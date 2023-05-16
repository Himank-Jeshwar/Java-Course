import java.util.Scanner;
import java.io.*;
public class PS_05_MultiplicationTable {
    public static void main(String[] args)throws IOException {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt(); 
        File table = new File("Multiplication table of "+n+".txt");
        FileWriter writeOnFile = new FileWriter(table);
        for (int i = 1;i<=10;i++){
            writeOnFile.write(n+" x "+i+" = "+(n*i));
            if (i<10)
                writeOnFile.write("\n");
            else
                writeOnFile.write("");
        }
        writeOnFile.close();
        sc.close();
        
    }
}
