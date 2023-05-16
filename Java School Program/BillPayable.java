import java.io.*;
class BillPayable{
    public static void main(String []args) throws IOException{
        // declaration
        double shirtCost = 245.0,trouserCost = 645.0,tieCost = 78.0,beltCost = 93.70,bill = 0.0;
        int shirts,trousers,ties,belts;
        // inputs
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of shirts = ");
        shirts=Integer.parseInt(br.readLine());
        System.out.print("Enter number of trousers = ");
        trousers=Integer.parseInt(br.readLine());
        System.out.print("Enter number of  ties = ");
        ties=Integer.parseInt(br.readLine());
        System.out.print("Enter number of belts = ");
        belts=Integer.parseInt(br.readLine());
        
        // calculation
        shirtCost*=shirts;
        trouserCost*=trousers;
        tieCost*=ties;
        beltCost*=belts;
        bill = shirtCost+trouserCost+tieCost+beltCost;

        System.out.println("ITEM\tNUMBER\tPRICE");
        System.out.println("Shirt\t"+shirts+"\t"+shirtCost);
        System.out.println("Trousers "+trousers+"\t"+trouserCost);
        System.out.println("Ties\t"+ties+"\t"+tieCost);
        System.out.println("Belts\t"+belts+"\t"+beltCost);
        System.out.println("Total amount = "+bill);
    }
}