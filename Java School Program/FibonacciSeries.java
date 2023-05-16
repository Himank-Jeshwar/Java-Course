class FibonacciSeries {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13
        
        int firstTerm = 0 , secondTerm = 1;
        int thirdTerm;
        System.out.print("0, 1, ");
        for (int i = 1;i<=8;i++){
            thirdTerm=(firstTerm+secondTerm);
            System.out.print(thirdTerm);
            if (i<8)
                System.out.print(", ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }    
}
