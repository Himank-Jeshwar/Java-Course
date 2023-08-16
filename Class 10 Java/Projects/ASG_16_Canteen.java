import java.util.*;
class ASG_16_Canteen{
    double b[],s[],n[],fr[];
    ASG_16_Canteen(){
        b = new double[5];
        s = new double[5];
        n = new double[5];
        fr = new double[5];
    }

    void accept(double a[]){
        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<5;i++){
            System.out.print("Enter sales for day "+(i+1)+" : ");
            a[i] = sc.nextDouble();
        }
    }
    String popular(){
        // declaration
        String items[] = {"Burger","Sandwiches","Noodles","Fried Rice"};
        String pop = "";
        double totalSales[] = {netSales(b),netSales(s),netSales(n),netSales(fr)};
        double max = totalSales[0];

        for (int i = 0;i<4;i++){
            if (totalSales[i]>=max){
                if (totalSales[i]>max)
                    pop=items[i]+"\n";
                else 
                    pop+=items[i]+"\n";
            }
        }
        return pop;
    }

    double netSales(double a[]){
        double total = 0.0;
            for (int i = 0;i<5;i++){
                total+=a[i];
        }
        return total;
    }

    void display(){
        System.out.println("ENTER SALES FOR BURGER : ");
        accept(b);
        System.out.println("\nENTER SALES FOR SANDWICHES : ");
        accept(s);
        System.out.println("\nENTER SALES FOR NOODLES : ");
        accept(n);
        System.out.println("\nENTER SALES FOR FRIED RICE : ");
        accept(fr);

        double netInc = netSales(b)+netSales(s)+netSales(n)+netSales(fr);
        System.out.println("\nNet sales for the week : "+netInc);
        System.out.println("Most popular item on sale : \n"+popular());
    }
    public static void main(String[] args) {
        ASG_16_Canteen ob = new ASG_16_Canteen();
        ob.display();
    }
}