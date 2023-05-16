import java.io.*;

/**
 * @author Himank Jeshwar
 * @version JDK 14
 * @since 30-09-2022
 */
public class PS_01_JavaDoc {
    /**
     * This function is used to write on a file.
     * @param fileName Name of the file
     * @param text Text to be written in the file
     * @throws IOException 
     */

    public static void writeInFile(String fileName,String text)throws IOException{
        try{
            FileWriter filewriter = new FileWriter(fileName);
            filewriter.write(text);
            filewriter.close();
        }
        catch(IOException e){
            throw new IOException();
        }
    }
    public static void main(String[] args)throws IOException {
        // Write in a file
        writeInFile("HelloWorld.txt", "Hello my name is Himank Jeshwar.");
    }
}
