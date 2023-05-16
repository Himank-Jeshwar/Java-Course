import java.io.*;
public class AgeOf3People {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        byte age1,age2,age3; String oldest,youngest;
        System.out.print("Enter age of Person 1 = ");
        age1 = Byte.parseByte(br.readLine());
        System.out.print("Enter age of Person 2 = ");
        age2 = Byte.parseByte(br.readLine());
        System.out.print("Enter age of Person 3 = ");
        age3 = Byte.parseByte(br.readLine());

        if (age1>age2&&age1>age3)
            oldest = "Person 1";
        else 
            if (age2>age3&&age2>age1)
                oldest = "Person 2";
            else 
                oldest = "Person 3";
        
        if (age1<age2&&age1<age3)
            youngest = "Person 1";
        else
            if (age2<age3&&age2<age1)
                youngest = "Person 2";
            else
                youngest = "Person 3";

        System.out.print(oldest+" is the oldest.\n"+youngest+" is the youngest.");
    }
}
