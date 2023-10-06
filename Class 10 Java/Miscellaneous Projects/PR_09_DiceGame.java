import java.util.*;
class PR_09_DiceGame {
    int p1,p2,p1Tries,p2Tries;
    void throwDice(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Roll a dice (1-6): ");
        p1 = sc.nextInt();
        p2 = (int)(Math.random()*6)+1; // computer's choice
        System.out.println("\nPlayer 1 rolled (you): "+p1);
        System.out.println("Player 2 rolled - "+p2);
    } 
    
    void play(){
        int p1_score = 0,p2_score = 0;
        do{
            throwDice();
            p1_score+=p1;
            p1Tries++;
            p2_score+=p2;
            p2Tries++;
        }while(p1_score!=20&&p2_score!=20);
        
        System.out.println("Player 1 took "+p1Tries+" tries");
        System.out.println("Player 2 took "+p2Tries+" tries");
        if (p1Tries<p2Tries)
            System.out.println("Player 1 is the Winner");
        if (p2Tries<p1Tries)
            System.out.println("Player 2 is the Winner");
    }
    public static void main(String[] args) {
        PR_09_DiceGame ob = new PR_09_DiceGame();
        ob.play();
    }    
}
