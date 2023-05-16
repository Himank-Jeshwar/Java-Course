class PR_43_Test {
    public static void main(String[] args) {
        // int sum = 0;
        String w = "COMPUTER";
        for (int i = 0;i<w.length();i++){
            for (int j = 0,k=0;j<=i;j++,k++)
                System.out.print(w.charAt(k)+" ");
        System.out.println();
        }
    }    
}
