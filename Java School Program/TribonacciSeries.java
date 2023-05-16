class TribonacciSeries {
    public static void main(String[] args) {
        // 0 1 2 3 6
        int firstTerm = 0,secondTerm = 1, thirdTerm = 2;
        int fourthTerm;
        System.out.print("0, 1, 2, ");
        for (int i = 1;i<=7;i++){
            fourthTerm = firstTerm+secondTerm+thirdTerm;
            System.out.print(fourthTerm);
            if (i<7)
                System.out.print(", ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = fourthTerm;
        }
    }
}
