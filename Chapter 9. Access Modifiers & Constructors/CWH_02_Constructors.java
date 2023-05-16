class Employee1{
    private int id;
    private String name;
    public Employee1(String myName){
        id = 990;
        name = myName;
    }
    public Employee1(String myName,int myId){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
       name = newName;
    }
    public int getId(){
        return id;
    }
    public void setId(int newId){
        id = newId;
    }
}
public class CWH_02_Constructors {
    public static void main(String[] args) {
        Employee1 emp = new Employee1("Himank Jeshwar",998);
        // emp.setName("Harry");
        // emp.setId(986);
        System.out.println("Name : "+emp.getName());
        System.out.println("ID : "+emp.getId());
    }
}
