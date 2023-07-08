public class PR_02_Frequency {
    public static void main(String[] args) {
        int [] arr = {15,67,67,15,90,56,56,78,56,90};
        System.out.println("ELEMENT\t\tFREQUENCY");
        for (int i = 0;i<arr.length;i++){
            int frequency = 1;
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[j]=0;
                    frequency++;
                }
            }
            if (arr[i]!=0)
                System.out.println(arr[i]+"\t\t"+frequency);
        }
    }
}
