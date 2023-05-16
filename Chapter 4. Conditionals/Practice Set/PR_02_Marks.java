import java.util.Scanner;
public class PR_02_Marks {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.print("Enter Full Marks = ");
        double fM = m.nextDouble();
        System.out.println("Enter Marks For Three Subjects :- ");
        System.out.print("Sub1 Marks = ");
        double sub1 = m.nextDouble();
        double sub1Perc = (sub1*100)/fM;
        System.out.print("Sub2 Marks = ");
        double sub2 = m.nextDouble();
        double sub2Perc = (sub2*100)/fM;
        System.out.print("Sub3 Marks = ");
        double sub3 = m.nextDouble();
        double total = sub1+sub2+sub3;
        double sub3Perc = (sub3*100)/fM;
        double totalPerc = (total*100)/(fM*3);
        if (totalPerc>=40 && sub1Perc >= 33 && sub2Perc >= 33 && sub3Perc >= 33) {
            System.out.print("Pass");
        }
        else {
            System.out.print("Fail");
        }
    }  
}
