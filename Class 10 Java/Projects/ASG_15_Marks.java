import java.util.*;
class ASG_15_Marks {
    public static void main(String[] args) {
        // declaration
        double eng1[] = new double[5];
        double eng2[] = new double[5];
        double total = 0.0,low;

        Scanner sc = new Scanner (System.in);
        for (int i = 0;i<5;i++){
            System.out.println("\nEnter marks for UT-"+(i+1)+" (out of 20 marks) - ");
            System.out.print("Enter marks for english language : ");
            eng1[i] = sc.nextInt();
            System.out.print("Enter marks for english literature : ");
            eng2[i] = sc.nextInt();
        }
        low = eng1[0]; // initializing lowest 

        for (int i = 0;i<5;i++){
            if (eng1[i]<low)
                low = eng1[i];
            total=eng1[i]+eng2[i];
            System.out.println("Total marks scored in UT - "+(i+1)+" = "+total);
        }
        System.out.println("Lowest marks in english language: "+low);
    }
}
