class PR_58_Alphabet {
    void show(char arr[][]){
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }    

    public static void main(String args[]){
        char arr[][] = {{'A','B','C','D'},
                        {'8','9','a','b'},
                        {'W','X','Y','V'}};
                        
        char newArr[][] = new char[3][4];
        int sum = 0,rev=0,copy=0;

        PR_58_Alphabet ob = new PR_58_Alphabet();
        System.out.println("Orignal array : ");
        ob.show(arr);

        for (int i = 0;i<3;i++){
            sum = 0;
            for (int j = 0;j<4;j++)
                sum+=arr[i][j];
            System.out.println("Sum of row "+(i+1)+" : "+sum);
        }

        //storing reverse of ascii
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                rev=0;
                copy = arr[i][j];
                while (copy>0){
                    rev = rev*10+copy%10;
                    copy/=10;
                }
                newArr[i][j] = (char)rev;
            }
        }

        System.out.println("Newly formed array : ");
        ob.show(newArr);
    }
}
