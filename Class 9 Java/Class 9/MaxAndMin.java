import java.io.*;
class MaxAndMin{
    public static void main () throws IOException {
        // declaration
        int a,b,c,max,min;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st number = ");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd number = ");
        b = Integer.parseInt(br.readLine());
        System.out.print("Enter 3rd number = ");
        c = Integer.parseInt(br.readLine());
        
        // finding out max
        if (a>b&&a>c)
            max = a;
        else if (b>a&&b>c)
            max = b;
        else 
            max = c;
        
        // finding out min
        if (a<b&&a<c)
            min = a;
        else if (b<a&&b<c)
            min = b;
        else 
            min = c;
        
        // output
        System.out.println("Maximum = "+max);
        System.out.print("Minimum = "+min);
        
    }
}