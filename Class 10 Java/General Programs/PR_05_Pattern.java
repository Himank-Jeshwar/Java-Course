class PR_05_Pattern {
    public static void main(String[] args) {
        for (int i = 0;i<4;i++){
            for (int j = 0;j<=i;j++){
                System.out.print((char)(65+j)+""+(j+1));
            }
            System.out.println();
        }
    }    
}
