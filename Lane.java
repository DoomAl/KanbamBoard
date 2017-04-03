import java.util.ArrayList;
import java.util.LinkedList;

public class Lane {
    private ArrayList<LinkedList<Ticket>> lane;
    private String name;
    private int numMaxPerson;
    private boolean subDivision;



    public Lane(String name){
        lane=new ArrayList<LinkedList<Ticket>>();
        this.name=name;
        numMaxPerson=0;
        subDivision=false;
    }

    public Lane(String name, int maxPerson, boolean subDivision){
        lane=new ArrayList<LinkedList<Ticket>>();
        this.name=name;
        numMaxPerson=maxPerson;
        this.subDivision=subDivision;
    }

    public String getName(){
        return name;
    }

    public int getNumMaxPerson(){
        return numMaxPerson;
    }

    public boolean isSubDivision(){
        return subDivision;
    }

    public boolean setName(String newName){
        if (lane.isEmpty()){
            name=newName;
            return true;
        }
        return false;
    }

    public ArrayList<LinkedList<Ticket>> getLane(){
        return lane;
    }

    public boolean setNumMaxPerson(int newNumber){
        if(newNumber>=0){
            numMaxPerson=newNumber;
            return true;
        }
        return false;
    }

    public void setSubDivision(boolean subDivision){
        this.subDivision=subDivision;
    }

    public boolean addTicket(Ticket ticket){
        lane.get(lane.size()-1).add(ticket);
        return true;
    }

    public boolean addTicket(int index, Ticket ticket){
        if (index>=0 && index<lane.size()){
            lane.get(index).add(ticket);
            return true;
        }
        return false;
    }

    public boolean removeTicket(Ticket ticket){
        boolean answer=false;
        for (int i=0; i<lane.size();i++){
            if(lane.get(i).contains(ticket)){
                lane.get(i).remove(ticket);
                answer=true;
                break;
            }
        }
        return answer;
    }

    public boolean removeFirst(){
        boolean answer=false;
        if (lane.isEmpty()==false) {
            Ticket ticket = lane.get(0).remove(0);
            answer=true;
        }
        return answer;
    }

    public int containsTicket(Ticket ticket){
        int answer=-1;
        for(int i=0; i<lane.size();i++){
            if(lane.get(i).contains(ticket)){
                answer=i;
            }
        }
        return answer;
    }

}
