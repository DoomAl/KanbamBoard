import java.util.HashSet;

public class Ticket {

	
	String description;
	boolean blocked;
	boolean done;
	HashSet<Person> personWorking;
	
	public Ticket (String description){
		this.description = description;
		blocked = false;
		done = false;
		personWorking=new HashSet<Person>();
	}

	public HashSet<Person> getPersonWorking() {
		return personWorking;
	}

	public void setPersonWorking(HashSet<Person> personWorking) {
		this.personWorking = personWorking;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public boolean isDone() {
		return done;
	}


}
