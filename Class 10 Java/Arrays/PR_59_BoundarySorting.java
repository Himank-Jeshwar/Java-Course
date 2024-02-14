class PR_59_BoundarySorting {
    int[][] getPositions(int m,int n){
        int r = 0;
        int pos[][] = new int[2*m+2*(n-2)][2];

        for (int j = 0;j<n;j++){ // first part
            pos[r][0]=0;
            pos[r][1]=j;
            r++;
        }

        for(int i = 1;i<m;i++){ // second part
            pos[r][0]=i;
            pos[r][1]=n-1;
            r++;
        }

        for (int j = n-2;j>=0;j--){ // third part
            pos[r][0]=m-1;
            pos[r][1] = j;
            r++;
        }

        for (int i = m-2;i>0;i--){ // fourth part
            pos[r][0]=i;
            pos[r][1]=0;
            r++;
        }
         
        return pos;
    }

    void sort(int boundary[]){
        int min = 0,temp=0; // declaration

        // selection sort
        for (int i=0;i<boundary.length-1;i++){
            min = i;
            for (int j = i+1;j<boundary.length;j++){
                if (boundary[j]<boundary[min])
                    min = j;
            }
            // swap
            temp = boundary[i];
            boundary[i]=boundary[min];
            boundary[min] = temp;
        }
    }

    void sortBoundary(int arr[][]){
        int m = arr.length,n=arr[0].length,row = 0,col = 0, ind = 0;
        int pos[][] = getPositions(m,n); // gets positions of boundary to array pos[][]
        
        int boundary[] = new int[2*m+2*(n-2)];    

        // extracting boundary
        for (int i = 0;i<pos.length;i++){
            row = pos[i][0];
            col = pos[i][1];
            boundary[ind++]=arr[row][col];
        }

        sort(boundary);
        ind = 0;

        // assigning the new boundary
        for (int i = 0;i<pos.length;i++){
            row = pos[i][0];
            col = pos[i][1];
            arr[row][col] = boundary[ind++];
        }
    }

    void show(int arr[][]){
        int m = arr.length,n=arr[0].length;
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++)
                if (i==0||j==0||i==m-1||j==n-1)
                    System.out.print(arr[i][j]+"\t");
                else
                    System.out.print("\t");
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{12,52,31},
                       {14,15,61},
                       {71,18,50},
                       {16,13,45}};

        PR_59_BoundarySorting ob = new PR_59_BoundarySorting();

        System.out.println("Unsorted boundary : ");
        ob.show(arr); // displaying the old array
        ob.sortBoundary(arr);
        System.out.println("\nSorted Boundary : ");
        ob.show(arr);
    }
}
