import java.io.*;
import java.util.*;
class test {
    static String generateID(){
        String id = "";        
        for (int i = 0;i<8;i++){
            int ch = (int)(Math.random()*(90-65)+65);
            id+=(char)(ch);
        }
        return id;
    }
    public static void main(String[] args) throws IOException{
        // int n = (int)(Math.random()*(90-65)+65);
        // System.out.println(n);
    
        System.out.println(generateID());
    }
}
