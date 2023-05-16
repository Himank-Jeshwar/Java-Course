import java.io.*;
public class PR_27_FindTypeOfTriangle {
    public static void main(String[] args) throws IOException {
        // declaration
        double a1,a2,a3;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three angles : ");
        a1 = Double.parseDouble(br.readLine());
        a2 = Double.parseDouble(br.readLine());
        a3 = Double.parseDouble(br.readLine());

        // decision
        if (a1+a2+a3==180)
            if (a1<90&&a2<90&&a3<90)
                System.out.print("It is an Acute-angled triangle");
            else if (a1>90||a2>90||a3>90)
                System.out.print("It is an Obtuse-angled triangle");
            else 
                System.out.print("It is a Right-angled triangle");
        else 
            System.out.print("It is not a triangle");
    }
}
