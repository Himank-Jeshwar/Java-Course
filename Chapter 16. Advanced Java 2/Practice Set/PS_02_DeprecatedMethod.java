import java.io.*;
class DeprecatedMethod{
    @Deprecated
    public void writeInFile(String fileName,String text)throws IOException{
        try{
            FileWriter filewriter = new FileWriter(fileName);
            filewriter.write(text);
            filewriter.close();
        }
        catch(IOException e){
            throw new IOException();
        }
    }
}
public class PS_02_DeprecatedMethod {
   
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException{
        DeprecatedMethod dm = new DeprecatedMethod();
        dm.writeInFile("helloworld", "I am Himank Jeshwar");
    }    
}
