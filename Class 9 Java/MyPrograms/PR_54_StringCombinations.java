class PR_54_StringCombinations{
    public static void main(String[] args) {

        String str = "TOP";
        int n = str.length();
        // big --> big , ibg ,igb , bgi, gbi , gib
        // huge --> huge , uhge, ughe, ugeh , hgue ,hgeu , hueg ,ehug
        // String arr [] = new String [2*n];
        
        // time complexity = O(n^3)
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                for (int k = 0;k<n;k++){
                    if (i!=j&&j!=k&&i!=k)
                        System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
                }
                System.out.print(" ");
            }
            // System.out.println();
        }

        // DRY RUN
        //  0 0 0 - x
        //  0 0 1 - x
        //  0 0 2 - x
        //  0 1 0 - x
        //  0 1 1 - x
        //  0 1 2 - TOP
        //  0 2 0 - x
        //  0 2 1 - TPO
        //  0 2 2 - x
        //  1 0 0 - x
        //  1 0 1 - x
        //  1 0 2 - OTP
        //  1 1 0 - x
        //  1 1 1 - x
        //  1 1 2 - x
        //  1 2 0 - OPT
        //  2 0 0 - x
        //  2 0 1 - PTO
        //  2 0 2 - x
        //  2 1 0 - POT
        //  2 1 1 - x
        //  2 1 2 - x
        //  2 2 0 - x
        //  2 2 1 - x
        //  2 2 2 - x

    }
}