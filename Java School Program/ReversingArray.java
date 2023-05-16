import java.util.Scanner;
class ReversingArray{
    int arr[];
    void input (){
        arr = new int [10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<arr.length;i++){
            System.out.print("Enter element "+(i+1)+" : ");
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    void reverse(){
        int temp;
        for (int j = 0;j<arr.length/2;j++){
            temp = arr[j];
            arr[j]=arr[arr.length-j-1];
            arr[arr.length-j-1]=temp;
        }
    }
    void display(){
        System.out.print("Reversed array : {");
        for (int k = 0;k<arr.length;k++){
            System.out.print(arr[k]);
            if (k<arr.length-1)
                System.out.print(", ");
        }
        System.out.print("}");
    }
    public static void main(String[] args) {
        ReversingArray revArr = new ReversingArray();
        revArr.input();
        revArr.reverse();
        revArr.display();
    }
}