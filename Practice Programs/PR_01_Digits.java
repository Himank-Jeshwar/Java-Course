public class PR_01_Digits {
    public static void main(String[] args) {
        long num = 34719832L; double half = 0.0;
        half = num%1000/2;
        System.out.print("Half of 1st 3 digits from the right side - "+half+"\n1st 3 digits from the left side - "+(num/100000));
    }
}
