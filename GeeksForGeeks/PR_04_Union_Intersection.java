class PR_04_Union_Intersection {
    boolean isPresent(int num,String el){
        String w = "";

        for (int i = 0;i<el.length();i++){
            if (el.charAt(i)==' '){
                if (Integer.parseInt(w)==num)
                    return true;
                w="";
            }
            else
                w+=el.charAt(i);
        }
        return false;
    }
    int [] removeDuplicates(int arr[]){
        String el = "",w = "";
        int len = 0,k=0,newArr[];

        for (int i =0;i<arr.length;i++){
            if (isPresent(arr[i],el)==false){
                el+=arr[i]+" ";   
                len++;
            }
        }
        
        newArr = new int[len];
        for(int i = 0;i<el.length();i++){
            if(el.charAt(i)==' '){
                newArr[k] = Integer.parseInt(w);
                w="";
                k++;
            }
            else
                w+=el.charAt(i); 
        }

        return newArr;
    }

    int[] union(int A[],int B[]){
        int U[] = new int [A.length+B.length];
        int i;
        for (i = 0;i<A.length;i++)
            U[i] = A[i]; 

        for (int k = 0;k<B.length;k++){
            U[i] = B[k];
            i++;
        }

        U = removeDuplicates(U);
        return U;
    }

    int [] intersection(int A[],int B[]){
        A = removeDuplicates(A);
        B = removeDuplicates(B);

        int max = Math.max(A.length,B.length);
        int min = Math.min(A.length,B.length);

        int I[] = new int [min],copy[];
        int k = 0;

        for (int i = 0;i<min;i++){
            for (int j = 0;j<max;j++){
                if (min==A.length && A[i]==B[j]){
                    I[k++] = A[i]; // or B[j]
                    break;
                }
                else if (min==B.length && B[i]==A[j]){
                    I[k++] = B[i]; // or A[j]
                    break;
                }
            }
        }
        
        if (k<min){
            copy = new int [k];
            for (int i = 0;i<k;i++)
                copy[i] = I[i];
            I = copy; 
        }
        return I;
    }

    void print(int arr[]){
        for (int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
        // return 0;
    public static void main(String[] args) {
        int A[] = {1, 3,3,4, 4, 5, 4,6,5};
        int B[] = {2, 3, 5, 6}; 
        int U[],I[];
        PR_04_Union_Intersection ob = new PR_04_Union_Intersection();

        U = ob.union(A, B); 
        I = ob.intersection(A, B);
        
        System.out.print("Union set : ");
        ob.print(U);
        System.out.print("Intersection set : ");
        ob.print(I);
    }    
}
