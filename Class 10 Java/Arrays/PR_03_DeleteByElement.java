import java.util.*;
class PR_12_DeleteByElement {
    void input(String arr[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter "+arr.length+" elements below : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
    }
    void delete(String element,String arr[]){
        int index = 0,i;
        // finding element
        for (i = 0;i<arr.length;i++){
            if (element.equals(arr[i])){
                index = i;
                break;
            }
        }

        if (i==arr.length){
            System.out.println("Element not found.");
            System.exit(0);
        }
        // deleting the element
        for (int j = index;j<arr.length-1;j++){
            arr[j] = arr[j+1];
        }
        
    }
    public static void main(String[] args) {
        String s; // declaration
        String strArr[] = new String[10];
        int l = 0;
        PR_12_DeleteByElement arrdel = new PR_12_DeleteByElement();
        // inputs
        Scanner sc = new Scanner(System.in);
        arrdel.input(strArr); // storing inputs to array
        l = strArr.length;
        System.out.print("Enter element to delete : ");        
        s = sc.nextLine();

        // deleting element
        arrdel.delete(s,strArr);
        l--;
        // array traversal
        System.out.println("Array elements are : ");
        for (int j = 0;j<l;j++){
            System.out.println(strArr[j]);
        }
    }
}
