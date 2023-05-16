import java.util.Scanner;
import java.util.Random;
class Game{
    private int randInt,userInt,noOfGuesses=0;
    // Object instantiation 
    Scanner gameInput = new Scanner (System.in);
    Random rand = new Random();

    // constructor generates a random number for the computer.
    public Game(){    
        randInt = rand.nextInt(101);
    }
    public void takeUserInput(){
        
        System.out.print("Guess any number (0 to 100) = ");
        userInt = gameInput.nextInt();
    }

    public void isCorrectNumber(){
        if (userInt>randInt){
            System.out.println("\tTOO HIGH !");
        }
        else if (userInt<randInt){
            System.out.println("\tTOO LOW !");
        }
        else if (userInt==randInt)
            System.out.println("\n\tCORRECT NUMBER !");
    }
    public void setnoOfGuesses(int guess){
        noOfGuesses = guess;
    }
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public int getComputerInt(){
        return randInt;
    }
    public int getUserInt(){
        return userInt;
    }
}
public class Guess_The_Number {
    public static void main(String[] args) {
        Game game = new Game(); // instantiating object for Game class.
        int userNo,compNo = game.getComputerInt(),guesses = game.getnoOfGuesses();
        do {
            game.takeUserInput();
            userNo = game.getUserInt();
            if (userNo<0||userNo>100){
                System.out.println("\tNUMBER OUT OF RANGE !\n\tTry Again.\n");
                continue; // will skip this iteration if it is out of range. Here, number of guesses will not be counted.
            }
            game.setnoOfGuesses(++guesses);
            game.isCorrectNumber();
        }while(userNo!=compNo);
        System.out.println("\tNumber of guesses - "+guesses);        
    }
}