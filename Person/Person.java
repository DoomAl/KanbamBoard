package Person;

public abstract class Person {

    private String name;
    private String role;

    public Person(){
        name="";
        role="";
    }

    public Person(String name, String role){
        StringBuffer newName=onlyWords(name);
        StringBuffer newRole=onlyWords(role);
        this.name=newName.toString();
        this.role=newRole.toString();
    }

    public String getRole(){
        return role;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        StringBuffer name=onlyWords(newName);
        this.name=name.toString();
    }

    public void setRole(String newRole){
        StringBuffer role=onlyWords(newRole);
        this.role=role.toString();
    }

    private StringBuffer onlyWords(String str){
        StringBuffer newString=new StringBuffer();
        char array[]=str.toCharArray();
        for (int i=0; i<array.length;i++){
            char c=array[i];
            if((c >= 'a' && c <= 'z' ) || (c >= 'A' && c <= 'Z' ) || (c==' ')){
                newString.append(c);
            }
        }
        return newString;
    }

}