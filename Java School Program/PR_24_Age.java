import java.io.*;
public class PR_24_Age {
    public static void main(String[] args)throws IOException {
        // declaration
        int age;String text;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your age = ");
        age = Integer.parseInt(br.readLine());

        // decision
        if (age<2)
            text = "Infant";
        else if (age<5)
            text = "Toddler";
        else if (age<13)
            text = "Child";
        else if(age<20)
            text = "Teen";
        else if (age<40)
            text = "Adult";
        else if (age<60)
            text = "Middle Age Adult";
        else 
            text = "Senior Adult";
        System.out.print(text);
    }
}
