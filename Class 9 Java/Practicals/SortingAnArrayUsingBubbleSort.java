// pending
import java.io.*;
public class SortingAnArrayUsingBubbleSort {
    // int [] numbers = new int[20];
    void input()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 20 integers :- ");
        // for (int i = 0;i<numbers.length;i++){
            // numbers[i] = Integer.parseInt(br.readLine());
        // }
    }
    void sort(){
        // ascending order
        int [] numbers = {50,10,0,-5,-1,23,35,11,12,8 ,75,83,54,59,90,82,71,77,63,80};
        for (int j = 0;j<numbers.length/2;j++){
            for (int k = 0;k<numbers.length/2;k++){
                if (numbers[j]>numbers[k]){
                    int temp = numbers[k];
                    numbers[k]=numbers[j];
                    numbers[j]=temp;
                }   
            }
        }
        for (int o = numbers.length/2;o<numbers.length;o++){
            for (int l = numbers.length/2;l<numbers.length;l++){
                if (numbers[o]<numbers[l]){
                    int temp = numbers[l];
                    numbers[l]=numbers[o];
                    numbers[o]=temp;
                }
            }
        }
        for (int el : numbers) {
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args)throws IOException {
        SortingAnArrayUsingBubbleSort stArr = new SortingAnArrayUsingBubbleSort();
        // stArr.input();
        stArr.sort();
    }
}
