import java.util.*;
class PR_13_ReplaceElement {
    void input(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+arr.length+" elements below : ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLine();
        }
    }

    void replace (String newElement,String oldElement,String arr[]){
        // involves both insertion and deletion
        int index = 0,i;
        for(i = 0;i<arr.length;i++){
            if (oldElement.equals(arr[i])){
                index = i;
                break;
            }
        }
        if (i==arr.length){
            System.out.println("Element not found.");
            System.exit(0);
        }
        // deletion of old element
        for (int j = index;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        
        // insertion of new element
        for (int k = arr.length-2;k>=index;k--){
            arr[k+1] = arr[k];
        }
        arr[index] = newElement;
    }   
    public static void main(String[] args) {
        String s1,s2; // declaration
        String strArr[] = new String[10];

        PR_13_ReplaceElement repArr = new PR_13_ReplaceElement();
        // inputs
        Scanner sc = new Scanner(System.in);
        repArr.input(strArr); // storing inputs to array
        
        System.out.print("Enter new element : ");        
        s1 = sc.nextLine();
        System.out.print("Enter old element : ");        
        s2 = sc.nextLine();

        // replacing element
        repArr.replace(s1,s2,strArr);

        // array traversal
        System.out.println("Array elements are : ");
        for (int j = 0;j<strArr.length;j++){
            System.out.println(strArr[j]);
        }
    }    
}
