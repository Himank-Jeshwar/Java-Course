import java.io.*;
import java.util.*;
class test {
    
    public static void main(String[] args) throws IOException{
        // int n = (int)(Math.random()*(90-65)+65);
        // System.out.println(n);
        FileWriter ob = new FileWriter("tickets.txt");
        ob.write("Hello\n");
        ob.write("Himank");
        ob.close();
        // System.out.println(generateID());
    }
}
