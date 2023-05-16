import java.io.*;
public class PR_04_Area {
    public static void main(String[] args) throws IOException{
        InputStreamReader m = new InputStreamReader(System.in);
        BufferedReader w = new BufferedReader(m);
        double rL,rB,cL,cB;
        System.out.print("Enter Room Length = ");
        rL = Double.parseDouble(w.readLine());
        System.out.print("Enter Room Breadth = ");
        rB = Double.parseDouble(w.readLine());
        System.out.print("Enter Carpet Length = ");
        cL = Double.parseDouble(w.readLine());
        System.out.print("Enter Carpet Breadth = ");
        cB = Double.parseDouble(w.readLine());

        double roomArea = rL*rB;
        double carpetArea = cL*cB;
        double uA = roomArea-carpetArea;
        System.out.print("Uncovered Area = "+uA+" sq.m");
    }
}
