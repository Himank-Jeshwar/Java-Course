import java.io.*;
public class SortingArray {
    public static void main(String[] args)throws IOException {
        // declaration
        int [] originalArray = new int[10],sortedArray = new int [10];
        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 integers :-");
        for (int i = 0;i<originalArray.length;i++){
            originalArray[i] = Integer.parseInt(br.readLine());
        }
        for (int j = 0;j<sortedArray.length;j++){
            sortedArray[j]=originalArray[j];
        }

        // sorting in descending order
        for (int j = 0;j<sortedArray.length;j++){
            for (int k = 0;k<(sortedArray.length-j-1);k++){
                if (sortedArray[k]<sortedArray[k+1]){
                    int temp = sortedArray[k+1];
                    sortedArray[k+1] = sortedArray[k];
                    sortedArray[k] = temp;
                }
            }
        }

        // printing original and sorted array
        System.out.print("Original Array : ");
        for (int u = 0;u<originalArray.length;u++){
            System.out.print(originalArray[u]+"  ");
        }
        System.out.println();
        System.out.print("Sorted Array : ");
        for (int o = 0;o<sortedArray.length;o++){
            System.out.print(sortedArray[o]+"  ");
        }
        
    }
}
