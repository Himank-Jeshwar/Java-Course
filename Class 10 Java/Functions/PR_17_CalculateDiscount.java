import java.util.*;
class PR_17_CalculateDiscount{

    void Discount(int price){
        int dis1,dis2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter discount(s) : ");
        dis1 = Math.abs(sc.nextInt());
        dis2 = Math.abs(sc.nextInt());
        
        Discount(price,dis1);
        Discount(price,dis1,dis2);

        // amount = printedPrice-(printedPrice*a/100.0);
        // System.out.println("Amount to be paid : Rs."+amount);
    }

    void Discount(int p,int d){
        p = p-(p*d/100);
        // amount = printedPrice-(printedPrice*a/100.0);
        // amount = amount-(amount*b/100.0);
        System.out.println("Amount to be paid after single discount: Rs."+p);
    }

    void Discount(int p,int d1,int d2){
        p = p-(p*d1/100);
        p = p-(p*d2/100);
        // amount = printedPrice-(printedPrice*a/100.0);
        // amount = amount-(amount*b/100.0);
        // amount = amount-(amount*c/100.0);
        System.out.println("Amount to be paid after successive discount : Rs."+p);
    }

    public static void main(String[] args) {
        // declaration
        int printedPrice,amount;
        int ch;
        
        PR_17_CalculateDiscount obj = new PR_17_CalculateDiscount();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter printed price : ");
        printedPrice = sc.nextInt();
        // System.out.println("Choose below : \n1 - calculate 1 discount\n2 - calculate 2 successive discounts\n3 - calculate 3 successive discounts ");
        // ch = sc.nextInt();

        obj.Discount(printedPrice);
        // decision
    //     System.out.println("Enter discount(s) below : ");
    //     switch(ch){
    //         case 1:
    //             Discount(sc.nextInt());
    //             break;
    //         case 2:
    //             Discount(sc.nextInt(),sc.nextInt());
    //             break;
    //         case 3:
    //             Discount(sc.nextInt(),sc.nextInt(),sc.nextInt());
    //             break;
    //    }    
        // obj.Discount(printedPrice);
    }
}