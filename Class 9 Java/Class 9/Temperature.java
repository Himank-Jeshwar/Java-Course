import java.io.*;
class Temperature {
    public static void main() throws IOException{
        // declaration
        double temp;
        char tempUnit;
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("For Fahrenheit ,press(f)\n For Celsius ,press(c)");
        tempUnit = br.readLine().charAt(0);
        
        // decision
        switch (tempUnit){
            case 'f':
            case 'F':
                System.out.print("Enter temperature in fahrenheit :");
                temp = Double.parseDouble(br.readLine());
                double c = (temp-32)*5/9;
                System.out.print("Temperature in celsius = "+c);
                break;
            case 'c':
            case 'C':
                System.out.print("Enter temperature in celsius :");
                temp = Double.parseDouble(br.readLine());
                double f = 1.8*temp+32;
                System.out.print("Temperature in fahrenheit = "+f);
                break;
            default:
                System.out.print("INVALID INPUT");
                
        }
    }
}