import java.io.*;
public class PythagoranTriplet {
    public static void main(String[] args)throws IOException {
        //declaration
        int m;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a value for \'m\' = ");
        m = Integer.parseInt(br.readLine());

        // output
        if (m>1)
            System.out.print(2*m+","+Math.round(m*m-1)+","+Math.round(m*m+1)+" form a \'Pythagorean Triplet\'");
        else
            System.out.print("\'m\' must be greater than 1");
    }
}
