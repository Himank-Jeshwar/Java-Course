import java.util.Scanner;
class MaxRetriesExceededException extends Exception{
    @Override
    public String toString(){
        return "\nMaxRetriesExceededException: "+getMessage();
    }
    @Override
    public String getMessage(){
        return "You have exceeded the maximum limit of 5 attempts to access the array.";
    }
}

public class PS_03_KeepAccessingAnArray {
    static void accessArray()throws MaxRetriesExceededException{
         // declaration
         int index,c = 1;
         String [] vegetables = {"Potato","Garlic","Ginger","Tomato","Onion"};
         boolean isIndexValid;
         do {
             Scanner sc = new Scanner(System.in);
             System.out.print("Enter an index number - ");
             index = sc.nextInt();
             try{
                 System.out.print("Element at index "+index+" - "+vegetables[index]);
                 isIndexValid = true;
                 sc.close();
             }
             catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid Index.\n\tTry again");
                 isIndexValid = false;
             }
             if (isIndexValid==true)
                 break;
             else if(c==5){
                sc.close();
                 throw new MaxRetriesExceededException();
             }
            c++;
 
         }while(c<=5);
    }
    public static void main(String[] args) {
        try{
            accessArray();
        }
        catch(MaxRetriesExceededException m){
            m.printStackTrace();
        }
    }
}
