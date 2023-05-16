class PR_25_Pattern {
    public static void main(String[] args) {
        for (int i = 0,k = 15;i<5;i++){
            for (int j = 5;j>i;j--,k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }    
}
