class BinarySearchOfString {
    public static void main(String[] args) {
        String [] words = {"Apple","Ball","Cat","Dog","Fruits"};
        String search = "Ball";
        int start = 0,end = words.length-1;
        while(start<=end){
            int middle = (start+end)/2;
            if (words[middle].equals(search)){
                System.out.print("Index - "+middle);
                break;
            }
            else if (words[middle].compareTo(search)>0){
                end = middle-1;
            }
            else if (words[middle].compareTo(search)<0){
                start = middle+1;
            }
        }
        if (start>end)
            System.out.println("Element not found");
    }    
}
