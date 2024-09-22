class PR_02_Boundary {
    int size,n;
    int boundary[],row[],column[],a[][];
    
    public PR_02_Boundary(int a[][]){
        n = a.length;
        this.a = a;
        size = 4*(n-1);
        boundary = new int[size];
        row = new int [size];
        column = new int [size];
    }


    int[] boundary(){
        int k = 0;

        for (int i = 1;i<size;i++){
            if (i<n){
                row[i] = k;
                column[size-i] = row[i];
            }

            else 
                if (i<2*n-1){
                    row[i] = ++k;
                    column[size-i] = row[i];
                }
                else 
                    if (i<3*n-2){
                        row[i] = k;
                        column[size-i] = row[i];
                    }
                    else{
                        row[i] = --k;
                        column[size-i] = row[i];
                    }
        }

        for (int i = 0;i<size;i++)
            boundary[i] = a[row[i]][column[i]];

        return boundary;
    }    

    void show (){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if (i==0 || j==0 ||i==n-1 ||j==n-1){
                    System.out.print(a[i][j]+" ");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        System.out.println();
    }
    
    PR_02_Boundary sort(){
        int key,j;

        for (int i = 1;i<size;i++){
            key = boundary[i];
            j = i-1;

            while (j>=0 && boundary[j]>key){
                boundary[j+1] = boundary[j];
                j--;
            }
            boundary[j+1] = key;
        }

        // storing back in the array
        for (int i = 0;i<size;i++)
            a[row[i]][column[i]] = boundary[i];

        return this;
    }
}