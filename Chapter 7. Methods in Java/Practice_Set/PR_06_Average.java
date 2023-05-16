public class PR_06_Average {
    static double average(double x,double...numbers){
        int n = 0; double avg,total=x;
        for (double el:numbers){
            total+=el;
            n++;
        }
        avg = total/(n+1);
        return avg;
    }
    public static void main(String[] args) {
        System.out.print(average(9));
    }
}
