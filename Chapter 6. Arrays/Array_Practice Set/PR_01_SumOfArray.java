public class PR_01_SumOfArray {
    public static void main(String[] args) {
        float [] num = {34.5f, 12.5f, 88.5f, 90.5f, 23.5f};
        float total = 0.0f;
        for (int o = 0;o<num.length;o++){
            total+=num[o];
        }
        System.out.print("Sum of the array = "+total);
    }
}
