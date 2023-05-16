import java.util.*;

class PR_58_Marks {
    String name;
    int age;
    double m1,m2,m3,maximum,average;
    
    PR_58_Marks(String n,int age,double m1,double m2,double m3){
        name = n;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        maximum = 0.0;
        average = 0.0;
    }

    void compute(){
        average = (m1+m2+m3)/3;
        if (Math.max(m1,m2)<m3)
            maximum = m3;
        else 
            maximum = Math.max(m1,m2);
    }

    void display(){
        System.out.println("\nName : "+name+"\nAge : "+age);
        System.out.println("Marks 1 : "+m1+"\nMarks 2 : "+m2+"\nMarks 3 : "+m3);
        System.out.println("Maximum marks : "+maximum);
        System.out.println("Average : "+average);
    }

    public static void main(String[] args) {
        String n;
        int a;
        double m1,m2,m3;
        PR_58_Marks obj;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        n = sc.nextLine();
        System.out.print("Enter age : ");
        a = sc.nextInt();
        System.out.println("Enter marks below : ");
        m1 = sc.nextDouble();
        m2 = sc.nextDouble();
        m3 = sc.nextDouble();

        obj = new PR_58_Marks(n, a, m1, m2, m3);
        obj.compute();
        obj.display();

    }
}
