import java.util.*;
class PR_02_Max_and_Min_ASCII {
    // declaring class attributes
    char arr[],ch;

    public PR_02_Max_and_Min_ASCII(){
        arr = new char[10];
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
    }

    void display(){
        // declaration
        char max ,min ;

        System.out.println("Enter 10 characters : ");

        for(int i = 0;i<arr.length;i++){
            input();
            arr[i]=ch;
        }
        max = arr[0];
        min = arr[0];
        for (int j = 0;j<arr.length;j++){
            if ((int)arr[j]>(int)max)
                max = arr[j];
            else if ((int)arr[j]<(int)min)
                min = arr[j];
        }
        System.out.println("Character with lowest ASCII - "+min);
        System.out.println("Character with highest ASCII - "+max);
    }

    public static void main(String[] args) {
        PR_02_Max_and_Min_ASCII maxminASCII = new PR_02_Max_and_Min_ASCII();
        maxminASCII.display();
    }
}
