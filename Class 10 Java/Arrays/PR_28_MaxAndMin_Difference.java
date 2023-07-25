class PR_28_MaxAndMin_Difference {
    public static void main(String[] args) {
        int a [] = {56,22,11,32,15,63,91,45};
        int highest = a[0],lowest = a[0],secondLowest = a[0];
        for (int i = 0;i<a.length;i++){
            if (a[i]>highest)
                highest = a[i];
            else 
                if (a[i]<lowest)
                    lowest = a[i];
                else 
                    if (a[i]<secondLowest&&lowest<a[i])
                        secondLowest = a[i];
        } 

        System.out.println("Maximum difference = "+(highest-lowest));
        System.out.println("Minimum difference = "+(secondLowest-lowest));
    }    
}
