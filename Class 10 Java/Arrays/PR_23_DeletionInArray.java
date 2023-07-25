import java.util.*;
class PR_23_DeletionInArray {
    static int el;
    void show(int a[],int len){
        for (int i = 0;i<len;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
    int find(int arr[],int len){
        for (int i = 0;i<len;i++){
            if (arr[i]==el)
                return i;
        }
        return -1;
    }

    void input(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+a.length+" elements : ");
        for (int i = 0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }

    void delete(int arr[],int index){
        for (int i = index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
    }
    public static void main(String[] args) {
        int index = -1;
        int arr[] = {2,44,22,44,44,99,12,45,67,44,68,44};
        int len = arr.length;
        
        PR_23_DeletionInArray ob = new PR_23_DeletionInArray();
        ob.show(arr,len);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element to delete : ");
        el = sc.nextInt();
                            
        // removing all occurence
        for (int j = 0;j<arr.length;j++){
            index = ob.find(arr,len);
            if (index!=-1){
                ob.delete(arr, index);
                len--;
            }

        }
        System.out.println();
        ob.show(arr,len);
    }
}
