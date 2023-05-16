import java.io.*;
public class PS_06_MulTable_for_2_to_9 {
    public static void main(String[] args)throws IOException { 
        for (int i = 2;i<=9;i++){
            File mulTableFile = new File("C:\\Users\\Himank Jeshwar\\Documents\\Himank Documents\\Java Course\\Chapter 16. Advanced Java 2\\Practice Set\\Multiplication Tables\\Multiplication Table of "+i+".txt");
            FileWriter writeOnFile = new FileWriter(mulTableFile);
            for (int j = 1;j<=10;j++){
                writeOnFile.write(i+" x "+j+" = "+(i*j));
                if (j<10)
                    writeOnFile.write("\n");
                else
                    writeOnFile.write("");
            }
            writeOnFile.close();
        }
        
        }
}
