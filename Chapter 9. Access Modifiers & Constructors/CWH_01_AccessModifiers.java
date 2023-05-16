class Employee{
    private int id;
    private String name;
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
public class CWH_01_AccessModifiers {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // emp1.name = "Himank Jeshwar";
        // emp1.id = 998; --> throws an error as these attributes are private
        
        emp1.setName("Himank Jeshwar");
        System.out.println(emp1.getName());;
    }
    
}