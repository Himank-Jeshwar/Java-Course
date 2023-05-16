import java.io.*;
class Evaluate{
    public static void main()throws IOException{
        // declaration
        int choice;
        double num;
        
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Press 1 to find natural logarithm of the number\nPress 2 to find absolute value of the number\nPress 3 to find the square root of the number\nPress 4 to find the cube root of the number\nPress 5 to generate random number between 0 and 1");
        choice = Integer.parseInt(br.readLine());
        
        // decision
        switch (choice){
            case 1:
                System.out.print("Enter number = ");
                num = Double.parseDouble(br.readLine());
                System.out.print("Logarithm of the number = "+Math.log(num));
            break;
            
            case 2:
                System.out.print("Enter number = ");
                num = Double.parseDouble(br.readLine());
                System.out.print("Absolute value of the number = "+Math.abs(num));
            break;
            
            case 3:
                System.out.print("Enter number = ");
                num = Double.parseDouble(br.readLine());
                System.out.print("Square root of the number = "+Math.sqrt(num));
            break;
            
            case 4:
                System.out.print("Enter number = ");
                num = Double.parseDouble(br.readLine());
                System.out.print("Cube root of the number = "+Math.cbrt(num));
            break;
            
            case 5:
                System.out.print("Random number between 0 to 1 = "+Math.random());
            break;
            
            default:
                System.out.print("INVALID INPUT\n\tPlease try again.");
            }
    }
}