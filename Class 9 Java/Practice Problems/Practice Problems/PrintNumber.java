import java.io.*;
class PrintNumber{
    void print(){
        // declaration
        int n = 1;

        // printing
        for (int i = 1;i<=4;i++){
            for (int j = 1;j<=i;j++,n++){
                System.out.print(n+"  ");
            }
            System.out.println();
        }
    }

    boolean print(int n){ 
        // check for sum of digits
        int c = n;
        int sum = 0;
        while (c>0){
            sum+=c%10;
            c/=10;
        }

        if (Math.pow(sum,3)==n)
            return true;
        return false;
    }

    void print(int a,char ch){
        switch(ch){
            case 's':
            case 'S':
                System.out.println("Square of the number = "+a*a);
                break;

            case 'c':
            case 'C':
                System.out.println("Cube of the number = "+a*a*a);
            }
    }
    public static void main(String[] args)throws IOException {
        PrintNumber num = new PrintNumber();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice;
        System.out.println("Press 1 to print the format\nPress 2 to check for Dudeney number\nPress 3 to print either square or cube of the number");     
        choice = Integer.parseInt(br.readLine());
        
        switch(choice){
            case 1:
                num.print();
                break;
            case 2:
                int n;
                System.out.print("Enter number : ");
                n = Integer.parseInt(br.readLine());
                if (num.print(n))
                    System.out.println("It's a Dudeney number.");
                else 
                    System.out.println("It's not a Dudeney number.");
                break;

            case 3:
                int n1; char ch;
                System.out.print("Enter a letter : ");
                ch = br.readLine().charAt(0);
                System.out.print("Enter a number : ");
                n1 = Integer.parseInt(br.readLine());
                num.print(n1,ch);
                break;

        }
    }
}