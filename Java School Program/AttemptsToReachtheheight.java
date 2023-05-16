import java.util.Scanner;
class AttemptsToReachtheheight {
    public static void main(String[] args) {
        int attempts = 1;
        double heightofPole,heightReached = 5.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of the pole (in ft.) : ");
        heightofPole = sc.nextDouble();
        while (heightReached<heightofPole){
            heightReached-=(2*heightReached/100);
            heightReached+=5;
            attempts++;
        }
        sc.close();
        System.out.print("Attempts made to reach the pole : "+attempts);
    }    
}
