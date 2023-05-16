import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class CWH_06_FileHandling {
    public static void main(String[] args)throws IOException {
        File file1 = new File("HelloWorld.txt");
        // creating a file
        file1.createNewFile();

        // Write a file
        FileWriter filewriter = new FileWriter("HelloWorld.txt");
        filewriter.write("Hello my name is Himank Jeshwar.\nThank You.");
        filewriter.close();

        // Reading a file
        Scanner sc = new Scanner(file1);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();

        // Deleting a file
        file1.delete();
    }
}
