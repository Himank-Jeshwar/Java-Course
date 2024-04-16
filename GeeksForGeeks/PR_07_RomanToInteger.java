class PR_07_RomanToInteger {
    public static void main(String[] args) {
        int keys[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String values[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String roman = "";

        int num = 3549;
        int q,ind = -1;
        do{
            q = 0;
            for (int i = keys.length-1;i>=0;i--){
                if(num>=keys[i]){
                    q = num/keys[i];
                    ind = i;
                    break;
                }
            }

            for (int i = 0;i<q;i++)
                roman+=values[ind];

            num = num%keys[ind];
        }while (num!=0);
        
        System.out.println(roman);
    }


}
