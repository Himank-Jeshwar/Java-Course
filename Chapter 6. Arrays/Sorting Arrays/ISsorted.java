class IsSorted {
    public static void main(String[] args) {
        int [] numbers = {11,2,3,4,5};
        boolean isSorted = true;
        for (int i = 0;i<numbers.length-1;i++){
            if (numbers[i]>numbers[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted==true){
            System.out.println("This array is sorted.");
        }
        else {
            System.out.println("This array is not sorted.");
        }
    }
}
