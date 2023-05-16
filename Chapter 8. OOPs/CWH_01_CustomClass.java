class Student{
    // class attributes
    int rollNum = 1; 
    String name = "Stranger";
    char rank;
    void getDetails(){
        System.out.println("Name is : "+name);
        System.out.println("Roll number : "+rollNum);
    }
    char grade(){
        return rank;        
    }
}
public class CWH_01_CustomClass {
    public static void main(String[] args) {
        System.out.println("This is my custom class");
        // Instantiating a new Student object
        Student stud1 = new Student(); 
        Student stud2 = new Student();

        // instance attributes
        stud1.name = "Himank Jeshwar";
        stud1.rollNum = 22;
        stud1.rank = 'A';

        stud2.name = "John Ferdandeiz";
        stud2.rollNum = 12;
        stud2.rank = 'B';
        
        stud1.getDetails();
        System.out.println("Grade of "+stud1.name+" : "+stud1.grade());
        
        stud2.getDetails();
        System.out.println("Grade of "+stud2.name+" : "+stud2.grade());
    }
}
