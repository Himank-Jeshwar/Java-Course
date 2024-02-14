import java.util.*;
class PR_55_SortingNames {
    
    String nm[];
    int n,age[];
    
    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of students : ");
        n = sc.nextInt();

        nm = new String [n];
        age = new int [n];

        
        for (int i = 0;i<n;i++){
            System.out.println("STUDENT - "+(i+1)+" : ");
            System.out.print("Enter name : ");
            nm[i] = sc.next();
            
            System.out.print("Enter age : ");
            age[i] = sc.nextInt();
        }
    }

    void sort(){
        String t1="";
        int t2=0,min=0;

        for (int i = 0;i<n-1;i++){
            min = i;
            for (int j = i+1;j<n;j++)
                if (nm[j].compareTo(nm[min])<0)
                    min = j;
        
            // swapping
            t1 = nm[min];
            nm[min] = nm[i];
            nm[i] = t1;

            t2 = age[min];
            age[min] = age[i];
            age[i] = t2;
        }
    }

    void display(){
        System.out.println("NAMES\tAGE");
        for (int i = 0;i<n;i++)
            System.out.println(nm[i]+"\t"+age[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        PR_55_SortingNames ob = new PR_55_SortingNames();
        ob.input();
        System.out.println("BEFORE : ");
        ob.display();

        System.out.println("AFTER : ");
        ob.sort();
        ob.display();
    }
}
