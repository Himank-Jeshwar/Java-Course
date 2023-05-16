public class PR_03_Marks {
    public static void main(String[] args) {
        double [] marks = new double [5];
        marks[0]=90.5;
        marks[1]=95.0;
        marks[2]=45.5;
        marks[3]=67.0;
        marks[4]=94.5;
        double avgMarks = 0.0;
        double totalMarks = 0.0;
        for (double el : marks){
            totalMarks+=el;
        }
        avgMarks = totalMarks/marks.length;
        System.out.println("Average marks = "+avgMarks);
    }
}
