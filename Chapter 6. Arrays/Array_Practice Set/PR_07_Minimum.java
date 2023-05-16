public class PR_07_Minimum {
    public static void main(String[] args) {
        double [] marks = {78.5,9.0,45.5,99.5,55.0,68.0};
        double min = marks[0];
        for (double el : marks){
            if (el<min){
                min=el;
            }
        }
        System.out.println("Minimum value in the array = "+min);

    }
}
