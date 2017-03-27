package person;

public abstract class Person {
	
	private String name;
	private String role;
	
	public Person(){
		name="";
		role="";
	}
	
	public Person(String name, String role){
		this.name=name;
		this.role=role;
	}
	
	public String getRole(){
		return role;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String newName){
		name=newName;
	}
	
	public void setRole(String newRole){
		role=newRole;
	}
	
}
