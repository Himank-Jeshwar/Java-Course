import java.io.*;
public class PR_26_Selection {
    public static void main(String[] args) throws IOException {
        // declaration
        double height,weight;

        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your height (in cm) = ");
        height = Double.parseDouble(br.readLine());
        System.out.print("Enter your weight (in kg) = ");
        weight = Double.parseDouble(br.readLine());

        // decision
        if (height>=175&&weight>=50&&weight<=80)
            System.out.print("You are selected !");
        else
            System.out.print("Sorry, You are not selected.");
    }
}
