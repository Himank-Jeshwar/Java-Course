public class PercentageDiff {
    public static void main(String[] args) {
        int num1 = 80,num2 = 90;
        double num1Percentage = (num1-num2)*100/((num1+num2)/2.0);
        if ((num1-num2)<0)
            num1Percentage = ((num1-num2)*-1)*100/((num1+num2)/2.0);
        System.out.println(num1Percentage+" %");
         
    }
}
