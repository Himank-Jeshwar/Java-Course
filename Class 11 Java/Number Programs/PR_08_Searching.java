class PR_08_Searching {
    double n;
    
    public PR_08_Searching (double n){
        this.n = n;
    }

    boolean isFound(){
        // declaration
        double num[] = {5.6,11.5,20.8,35.4,43.1,52.4,66.6,78.9,80.0,95.5};
        int start = 0,end = num.length-1,mid;

        // binary search
        while (start<=end){
            mid = (start+end)/2;

            if (n==num[mid])
                return true;
            else 
                if (n<num[mid])
                    end = mid-1;
                else 
                    start = mid+1;
        }

        return false;
    }

    void display(){
        if (isFound()==true)
            System.out.print("Search successful");
        else 
            System.out.println("Search element not found");
    }
}
