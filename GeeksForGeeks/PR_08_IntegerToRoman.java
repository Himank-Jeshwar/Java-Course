class PR_08_IntegerToRoman {
    int search(char a,char arr[]){
        for (int j = 0;j<arr.length;j++){ // linear search
            if (a==arr[j])
                return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        int keys[] = {1,5,10,50,100,500,1000};
        char values[] = {'I','V','X','L','C','D','M'},ch1,ch2;
        PR_08_IntegerToRoman ob = new PR_08_IntegerToRoman();

        String roman = "MMMDXLIX";
        int num = 0,ind1 = -1,ind2 = -1;

        for (int i = 0;i<roman.length()-1;i++){
            ch1 = roman.charAt(i);
            ch2 = roman.charAt(i+1);

            ind1 = ob.search(ch1, values);
            ind2 = ob.search(ch2, values);
            
            if (i + 1 < roman.length()) {
 
                // Comparing both values
                if (keys[ind1] >= keys[ind2]) {
                    // Value of current symbol
                    // is greater or equalto
                    // the next symbol
                    num+=keys[ind1];
                }
                else {
                    // Value of current symbol is
                    // less than the next symbol
                    num+=(keys[ind2] - keys[ind1]);
                    i++;
                }
            }
            else {
                num+=keys[ind1];
            }
        }

        System.out.println(num);
    
    }   

}
