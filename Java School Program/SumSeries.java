class SumSeries {
    public static void main(String[] args) {
        for (int i = 1;i<=10;i++){
            if (i%2==0)
                System.out.print(" - ");
            else if (i>1&&i%2!=0)
                System.out.print(" + ");
            System.out.print(i);
        }
    }
}
