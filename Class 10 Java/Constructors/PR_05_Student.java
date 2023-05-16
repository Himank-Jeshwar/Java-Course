import java.util.Scanner;

class PR_05_Student {
    // declaration
    String name;
    byte age;
    float m1,m2,m3,maximum,average;
    PR_05_Student s;
    PR_05_Student(){

    }
    PR_05_Student(String name,byte age,float m1,float m2,float m3){
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void accept(){
        String n; byte a; float marks1,marks2,marks3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        n = sc.nextLine();
        System.out.print("Enter age : ");
        a = sc.nextByte();
        System.out.println("Enter marks of 3 subjects : ");
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
        marks3 = sc.nextFloat();

        s = new PR_05_Student(n, a, marks1, marks2, marks3);
    }

    void compute(){
        s.maximum = Math.max(m3,Math.max(s.m1,s.m2));
        s.average = (s.m1+s.m2+s.m3)/3.0f; 
    }

    void display(){
        System.out.println("Name : "+s.name);
        System.out.println("Age : "+s.age);
        System.out.println("Marks 1 : "+s.m1);
        System.out.println("Marks 2 : "+s.m2);
        System.out.println("Marks 3 : "+s.m3);
        System.out.println("Maximum marks : "+s.maximum);
        System.out.println("Average : "+s.average);
    }
    public static void main(String[] args) {
        PR_05_Student stud = new PR_05_Student();
        stud.accept();
        stud.compute();
        stud.display();
    }
}
