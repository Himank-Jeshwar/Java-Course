import java.io.*;
class Number{
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
        
        if (!(a==b&&b==c)){
            if (a>b&&a>c)
                max = a;
            else if (b>a&&b>c)
                max = b;
            else 
                max = c;
            System.out.print("Maximum = "+max);
            }
        else
            System.out.print("All the numbers are equal");
            }
        }