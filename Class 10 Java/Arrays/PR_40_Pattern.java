class PR_40_Pattern {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0;i<10;i++){
            System.out.print(a[i]+"\t");
            if (a[i]%3==0)
                System.out.println();
        }

    }    
}
