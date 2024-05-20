import java.io.*;
import java.util.*;
class test {
    public static void main(String[] args) throws IOException{
        File f = new File ("movies.txt");

        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()==true){
            String s = sc.nextLine();
            System.out.println(s);
        }
        sc.close();
    }
}
