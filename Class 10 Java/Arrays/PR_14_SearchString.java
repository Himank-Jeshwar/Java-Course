import java.util.*;
class PR_14_SearchString {
    public static void main(String[] args) {
        String arr[] = new String [2];
        String s; int j;

        System.out.println("Enter 10 strings : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }

        System.out.print("Enter string to search : ");
        s = sc.nextLine();

        for (j = 0;j<arr.length;j++){
            if (arr[j].equals(s)){
                System.out.println("String is found at index "+j);
                break;
            }
        }

        if (j==arr.length){
            System.out.println("String not found.");
        }
    }    
}
