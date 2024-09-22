import java.util.*;
class ConvertDecimal{
    int decimal,base; // declaration

    public ConvertDecimal(){
        decimal = 0;
        base = 0;
    }

    void input (){
        int ch;// declaration

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter decimal : ");
        decimal = sc.nextInt();

        System.out.println("Press 1 to convert to binary\nPress 2 to convert to octal");
        ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Binary : "+convert(decimal, 2));
                break;
            case 2:
                System.out.println("Octal : "+convert(decimal, 8));
                break;
            default:
                System.out.println("INVALID INPUT !");
        }

    }
    long convert(int decimal,int base){ 
        // declaration
        long result = 0L;
        int i = 1;

        // conversion by division method
        while (decimal!=0){
            result = (decimal%base)*i+result;
            i*=10;
            decimal/=base;
        }
        return result;
    }

    public static void main() {
        ConvertDecimal ob = new ConvertDecimal();
        ob.input();
    }
}