import java.util.Scanner;
public class CWH_03_HandlingSpecificException {
    public static void main(String[] args) {
        int index,sub = 0,sum = 0;int [] marks = {7,56,45,12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index = ");
        index = sc.nextInt();
        sc.close();
        try{
            System.out.println("ELement at index "+index+" is - "+marks[index]);
            for (int i = 0;i<marks.length;i++){
                sum+=marks[i];
            }
            System.out.println("Sum of array = "+sum);
            System.out.println("Average marks = "+(sum/sub));
        }
        catch(IndexOutOfBoundsException i){
            System.out.println("INVALID INDEX");
        }
        catch(ArithmeticException arth){
            System.out.println("No. of subjects cannot be 0.");
        }
        catch(Exception e){
            System.out.println("Unexpected Error occured.");
            System.out.println(e);
        }
    }
}
