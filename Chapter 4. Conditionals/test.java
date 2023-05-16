import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        while (true){
        String u;
        Scanner sc = new Scanner (System.in);
        String i = sc.next();
        switch (i){
            case "i" :
            int roundNo = 1;
            int rounds = 1;
            while (rounds<=5){
                System.out.print("Tie or Win = ");
                u = sc.next();
                System.out.println("Round "+roundNo);
                   if (u.equals("Tie")){
                       System.out.println("Continuing ...");
                       roundNo++;
                       continue;
                   }
                   roundNo++;
                   rounds++;
               }
        }
    }    // int roundNo = 1;
}
}       
