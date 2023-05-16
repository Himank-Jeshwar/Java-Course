class PR_06_RearraningDigits{
    static int rearrange(int n){
        int i = 0,j,num=n,count = 0,newNum=0;
        while (num>0){
            count++;
            num/=10;
        }
        j = (int)(Math.pow(10,count-1));
        while (i<10){
            num = n;
            while (num>0){
                if (num%10==i){
                    newNum+=(num%10)*j;
                    j/=10;
                }
                num/=10;
            }
            i++;
        }
        return newNum;
    }
    public static void main(String[] args) {
        int n = 514392;
        int i = rearrange(n);
        System.out.println(i);
    }
}