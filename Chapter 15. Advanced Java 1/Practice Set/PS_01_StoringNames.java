import java.util.ArrayList;
import java.util.Scanner;
class PS_01_StoringNames {
    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter names of 10 students :");
        for (int i = 0;i<10;i++){
            String s = sc.nextLine();
            names.add(s);
        }

        System.out.println("The names are :- \n");
        for (String n : names) {
            System.out.println(n);
        }
    }    
}
