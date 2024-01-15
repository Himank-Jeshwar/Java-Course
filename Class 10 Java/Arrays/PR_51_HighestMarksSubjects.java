import java.util.*;
class PR_51_HighestMarksSubjects{
    String n;
    int m[];
    public PR_51_HighestMarksSubjects(){
        n = "";
        m = new int[6];
    }

    public PR_51_HighestMarksSubjects(String n,int m[]){
        this.n = n;
        this.m = m;
    }

    void max(){
        String sub [] = {"English","Geography-History Civics","Science","Maths","2nd Language","Application"};
        int g = Integer.MIN_VALUE,ind = 0;

        // sorting in merit order
        for (int i = 0;i<6;i++)
            if (m[i]>g){
                g = m[i];
                ind = i;
            }

        System.out.println("Name of the student : "+n);
        System.out.println("Highest marks : "+g);
        System.out.println("Subject : "+sub[ind]);
    }

    public static void main(String args[]){
        String nm;
        int mrk[] = new int [6];

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter name of the student : ");
        nm = sc.nextLine();

        System.out.println("Enter marks for 6 subjects : ");
        
        // storing best 6 subjects
        for (int i = 0;i<6;i++)
            mrk[i] = sc.nextInt();

        PR_51_Best6Subjects	ob1 = new PR_51_Best6Subjects();
        PR_51_Best6Subjects ob2 = new PR_51_Best6Subjects(nm,mrk);
        ob1.max();
        ob2.max();
    }
}