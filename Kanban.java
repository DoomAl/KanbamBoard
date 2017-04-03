import java.util.ArrayList;


public class Kanban {
    private ArrayList<Lane> kanban;
    private String name;
    private String colour;

    public Kanban() {
        kanban = new ArrayList<Lane>();
        name = "Kanban";
        colour = "White";
        String vector[] = {"Backlog", "To Do", "In Progress", "Done"};
        for (int i = 0; i < 4; i++) {
            Lane lane = new Lane(vector[i]);
            kanban.add(lane);
        }
    }

    public Kanban(String name, ArrayList<String> nameLanes) {
        kanban = new ArrayList<Lane>();
        this.name = name;
        colour = "White";
        for (int i = 0; i < nameLanes.size(); i++) {
            Lane lane = new Lane(nameLanes.get(i));
            kanban.add(lane);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public boolean addLane(String name) {
        Lane newLane = new Lane(name);
        kanban.add(newLane);
        return true;
    }

    public boolean addLane(String name, int index) {
        if (index >= 0 && index < kanban.size()) {
            Lane lane = new Lane(name);
            kanban.add(index, lane);
            return true;
        }
        return false;
    }

    public boolean removeLane(String name) {
        int index = lookIndex(name);
        if (index!=-1){
            if (kanban.get(index).getLane().isEmpty()) {
                kanban.remove(index);
                return true;
            }
        }
        return false;
    }

    private int lookIndex(String name){
        for(int i=0;i<kanban.size();i++){
            if(kanban.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public boolean moveTicket(Ticket ticket, int indexLane) {
        boolean answer = false;
        if (kanban.isEmpty() == false) {
            for (int i = 0; i < kanban.size(); i++) {
                int index = kanban.get(i).containsTicket(ticket);
                if (index != -1) {
                    kanban.get(indexLane).addTicket(ticket);
                    kanban.get(index).removeTicket(ticket);
                    answer = true;
                    break;
                }

            }
        }
        return answer;
    }

    public boolean moveTicket(Ticket ticket, int indexLane, int priority){
        boolean answer = false;
        if(kanban.isEmpty()==false){
            for(int i= 0; i<kanban.size(); i++){
                int index = kanban.get(i).containsTicket(ticket);
                if (index != -1) {
                    kanban.get(indexLane).addTicket(priority,ticket);
                    kanban.get(index).removeTicket(ticket);
                    answer = true;
                    break;
                }
            }
        }
        return answer;
    }

}
