class PR_23_Pattern {
    void drawTriangle(String s){
        
        String str = "";
        int i = 0;

        // new approach
        do{
            str+=s.charAt(i)+" ";
            System.out.println(str);
            i++;
        }while(s.charAt(i)!=' ');

    }
    // C L A S S
    // C L A S

    // for (int i = s.length()-1;i>=0;i--){
        // for(int j = 0;j<i;j++){
                // System.out.print(s.charAt(j));
        // }
        // System.out.println();
    // }
    

    void drawInvertedTriangle(String s){
        String str = "";
        int len = 0;

        // MAIN AIM : calculating length
        while (s.charAt(len)!='.'){
            len++;
        }

        for (int i = len-1;i>=0;i--){
            for(int j = 0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int ch;
        PR_23_Pattern pattern = new PR_23_Pattern();
        // pattern.drawTriangle("CLASS ");
        pattern.drawInvertedTriangle("CLASS.");
    }
}
