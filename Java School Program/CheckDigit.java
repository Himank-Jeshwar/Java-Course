import java.io.*;

class CheckDigit {
    public static void main(String[]args)throws IOException{
        // declaration
        int num,digits = 0;

        // inputs
        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inp);
        System.out.print("Enter a number = ");
        num = Integer.parseInt(br.readLine());

        // counting digits
        for (;num>0;num/=10){
            digits++;
        }
        System.out.println("Number of digits = "+digits);
        // decision
        switch(digits%2){
            case 0:
                System.out.print("The number contains even number of digits.");
                break;
            default:
                System.out.print("The number contains odd number of digits.");
        }
    }    
}
