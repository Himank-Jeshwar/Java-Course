class Employee2{
    private int id;
    private String name;
    private double salary;
    public Employee2(String myName){
        id = 990;
        name = myName;
    }
    public Employee2(String myName,int myId){
        id = myId;
        name = myName;
    }
    public Employee2(String myName,int myId,double mySalary){
        id = myId;
        name = myName;
        salary = mySalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
       name = newName;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int newId){
        id = newId;
    }
}
public class Quick_Quiz_2 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Himank Jeshwar",998,10000);
        // emp.setName("Harry");
        // emp.setId(986);
        System.out.println("Name : "+emp.getName());
        System.out.println("ID : "+emp.getId()); 
        System.out.println("Salary : "+emp.getSalary());
    }
}
