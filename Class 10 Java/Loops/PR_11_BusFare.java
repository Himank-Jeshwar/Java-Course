import java.util.Scanner;

class PR_11_BusFare {
    static double calculateFare (double dist){
        double fare = 0.0; // declaration

        // calculation
        if (dist>0&&dist<=5)
            fare = 80.0;
        else if (dist>5&&dist<=15)
            fare = 80 + 10*(dist-10);
        else if (dist>15)
            fare = 80 + 10*5 + 8.0*(dist-15);
        else 
            fare = 0.0;

        return fare;
    }

    public static void main(String[] args) {
        double dist,fare = 0.0,totalFare = 0.0;
        int passengers = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter distance you intend to travel (in km): ");
            dist = sc.nextDouble();
            fare = calculateFare(dist);
            
            System.out.println("........................\nDistance Travelled (in km) : "+dist);
            System.out.println("Fare : Rs."+fare+"\n........................");
            if (fare>0)
                passengers++;
                 
            totalFare+=fare;

            System.out.print("Would like to continue ? (y/n) : ");
            ch = Character.toLowerCase(sc.next().charAt(0));
    
        }while(ch!='n');   

        System.out.println("\nNumber of passengers : "+passengers);
        System.out.println("Total Fare received : Rs."+totalFare);
        sc.close();
    }
}