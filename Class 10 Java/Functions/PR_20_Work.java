class PR_20_Work{
    void work(char c,int i){
        for (char j = c;j>='A';j--){
            for (char k = j;k<=c;k++)
                System.out.print(j);
            
            System.out.print(i);
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        PR_20_Work ob = new PR_20_Work();
        // ob.work('D', 9); 
        ob.work('E',19);     
    }
}