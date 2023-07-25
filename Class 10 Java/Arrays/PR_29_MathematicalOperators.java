import java.util.*;
class PR_29_MathematicalOperators {
    static boolean isValidOp(String ch){
        String operators = "+-*/";
        if (operators.indexOf(ch.charAt(0))!=-1)
            return true;
        return false;
    }
    static void input (String arr[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any "+arr.length+" operators : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.next();
            if (isValidOp(arr[i])==false){
                System.out.println("Not a valid operator");
                System.exit(0);
            }
        }
    }

    static void input(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        String operators[] = new String [3];
        int numbers[] = new int [4];
        int result;
        input(operators);
        input(numbers);
        result = numbers[0];
        for (int i = 0;i<operators.length;i++){
            if (operators[i].equals("+"))
                result += numbers[i+1];
            else if (operators[i].equals("-"))
                result -= numbers[i+1];
            else if (operators[i].equals("*"))
                result *= numbers[i+1];
            else if (operators[i].equals("/"))
                result /= numbers[i+1];
        }

        System.out.println("Result = "+result);
    }
}
