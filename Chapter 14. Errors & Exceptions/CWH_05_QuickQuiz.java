import java.util.Scanner;
public class CWH_05_QuickQuiz {
    public static void main(String[] args) {
        String [] names = {"Himank","Siddharth","Rahul","George","Peter"};
        Scanner sc = new Scanner(System.in);
        int ind;boolean isIndexOutOfBound = false;
        do{
            try{
                System.out.print("Enter the value of index = ");
                ind = sc.nextInt();
                System.out.println("The element at index "+ind+" -> "+names[ind]);
                isIndexOutOfBound = false;   
            }
            catch(ArrayIndexOutOfBoundsException indException){
                isIndexOutOfBound = true;
            }
            }while(isIndexOutOfBound);
        sc.close();
        }
        
        
    }
