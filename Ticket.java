
public class Ticket {

	
	String description;
	boolean blocked;
	boolean done;
	
	
	public Ticket (String description1, boolean blocked1, boolean done1){
		description = description1;
		blocked = blocked1;
		done = done1;
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
