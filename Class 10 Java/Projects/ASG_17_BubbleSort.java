import java.util.*;
class ASG_17_BubbleSort {
    // declaration
    String n,sub[];
    double m[];

    public ASG_17_BubbleSort(){
        // allocating space
        sub = new String[10];
        m = new double[10];
    }
    void input (){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the name of student : ");
        n = sc.nextLine();
        System.out.println("Enter marks of 10 subjects : ");
        
        for (int i = 0;i<10;i++){
            System.out.print("Enter subject name : ");
            sub[i] = sc.next();
            
            System.out.print("Enter marks for "+sub[i]+" : "); 
            m[i] = sc.nextDouble();

            System.out.println(); 
        }
    }

    void sort(){
        // declaration
        double temp = 0.0;
        String t = "";

        // sorting in merit order
        for (int i = 0;i<10;i++){
            for (int j = 0;j<10-i-1;j++){
                if (m[j]<m[j+1]){
                    // swapping
                    temp = m[j+1];
                    m[j+1] = m[j];
                    m[j] = temp;

                    t = sub[j+1];
                    sub[j+1] = sub[j];
                    sub[j] = t;
                }
            }
        }
    }

    void display(){
        System.out.println("Name of the student : "+n);
        for (int i = 0;i<10;i++)
            System.out.println(sub[i]+" - "+m[i]);
    }
    public static void main(String[] args) {
        ASG_17_BubbleSort ob = new ASG_17_BubbleSort();
        ob.input();
        ob.sort();
        ob.display();        
    }    
}
