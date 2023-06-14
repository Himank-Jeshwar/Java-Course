class PR_03_Pascal_Triangle {
    public static void main(String[] args) {
        int m [] = new int [20];
        m[0] = 1;
        
        for (int i = 0;i<6;i++){
            for (int k = 6;k>i;k--)
                System.out.print(" ");

            for (int j = 0;j<=i;j++)
                System.out.print(m[j]+" ");
            
            System.out.println();
            
            for (int a = i+1;a>0;a--)   
                m[a] = m[a]+m[a-1];
        }
        
    }
}
