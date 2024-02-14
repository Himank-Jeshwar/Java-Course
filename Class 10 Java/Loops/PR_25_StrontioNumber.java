import java.util.*;
class PR_25_StrontioNumber{
    public static void main(String args[]){
        int n,newNum=0;

        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        n = Math.abs(sc.nextInt());

        if (n<10000==false){
            System.out.println("Not a 4-digit number");
            System.exit(0);
        }

        newNum = n*2;

        if ((newNum%1000)/100==(newNum%100)/10)
            System.out.println(n+" is a stonchio number");
        else
            System.out.println(n+" is NOT a stonchio number");
    }
}