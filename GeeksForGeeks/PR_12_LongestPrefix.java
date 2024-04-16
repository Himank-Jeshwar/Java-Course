class PR_12_LongestPrefix {
    public static void main(String[] args) {
        String str[] = {"geekysforgeeks", "geekys", "geek", "geezer"};
        String prefix = "",unconfirmedPrefix = "";

        int k = 0;
        for (int i = 1;i<str.length;i++){
            if (k<str[i].length())
                if (str[0].charAt(k)==str[i].charAt(k)){
                    unconfirmedPrefix+=str[0].charAt(k);
                    k++;
                }

                else{
                    
                    break;
                }                    
            }
        }

    }

}
