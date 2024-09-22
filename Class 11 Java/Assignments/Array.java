import java.util.*;

class Array{
    int a[];
    int size;

    public Array(int x){
        size = x;
        a = new int[size];
    }

    public Array(Array ob){
        size = ob.size;
        a = new int [size];
        
        for (int i = 0;i<size;i++)
            a[i] = ob.a[i];
    }

    public static boolean isValid(int x){
        if (x<10){
            System.out.println("BELOW RANGE !");
            return false;
        }

        else 
            if (x>20){
                System.out.println("ABOVE RANGE !");
                return false;
            }

        return true;
    }

    void input(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter elements : ");
        String line = sc.nextLine();
        
        // storing input elements
        String[] elements = line.split(" ");
        for (int i = 0;i<elements.length;i++)
            a[i] = Integer.parseInt(elements[i]);

    }

    void show(){
        // print
        for (int i = 0;i<size;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    Array insertionSort(){
        // declaration
        int key,j;
        Array copyArr = new Array(this); // creating a copy array
        
        // insertion sort
        for (int i = 1;i<size;i++){
            key = copyArr.a[i];
            j = i-1;

            while(j>=0 && copyArr.a[j]>key){
                copyArr.a[j+1] = copyArr.a[j];
                j--;
            }
           copyArr.a[j+1] = key;
        }

        return copyArr;
    }

    int binSearch(int key){
        // declaration
        int start = 0,end = a.length-1,mid = 0;

        while(start<=end){
            mid = (start+end)/2;

            if (key==a[mid])
                return mid;
            else
                if (key<a[mid])
                    end = mid-1;
                else
                    start = mid+1;
        }

        return -1;
    }

}