import java.io.*;
class Angles {
    public static void main () throws IOException {
        // declaration
        int a1,a2,sum=0;
        
        // inputs
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter two angles : ");
        a1 = Integer.parseInt(br.readLine());
        a2 = Integer.parseInt(br.readLine());
        
        // calculation
        sum = a1+a2;
        
        // decision
        switch(sum){
            case 180:
                System.out.print("SUPPLEMENTARY ANGLE");
                break;
            case 90:
                System.out.print("COMPLIMENTARY ANGLE");
                break;
            default:
                System.out.print("It is neither complimentary angle nor supplementary angle");
        }
        }
}