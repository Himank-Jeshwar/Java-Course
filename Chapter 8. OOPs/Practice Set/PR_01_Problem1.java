class Employee{
    int salary;
    String name;

    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setName(String newName){
        name = newName;
    }
}
public class PR_01_Problem1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Himank Jeshwar";
        emp1.salary = 98000;
        emp1.setName("John Fernandeiz");
        System.out.println("Name : "+emp1.getName());
        System.out.println("Salary : "+emp1.getSalary());
    }    
}