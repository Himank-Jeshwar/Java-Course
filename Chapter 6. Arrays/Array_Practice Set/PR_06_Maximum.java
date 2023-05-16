public class PR_06_Maximum {
    public static void main(String[] args) {
        int [] numbers = {89,79,33,90,120,450,340,97};
        int max = numbers[0];
        for (int o = 0;o<numbers.length;o++){
            if (numbers[o]>max){
                max = numbers[o];
            }
        }
        System.out.println("Greatest number in the array = "+max);
    }    
}