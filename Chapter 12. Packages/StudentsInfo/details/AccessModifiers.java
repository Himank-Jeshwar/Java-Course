package StudentsInfo.details;
class Employee{
    public double salary = 98500.30;
    protected int age = 24;
    String name = "Rahul";
    private int id = 190011;

}
class Programmer extends Employee{
    public void meth2(){
        System.out.println(salary);
        System.out.println(age);
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println(emp.salary);
        System.out.println(emp.age);
        System.out.println(emp.name);
        // System.out.println(emp.id);
    }
}
