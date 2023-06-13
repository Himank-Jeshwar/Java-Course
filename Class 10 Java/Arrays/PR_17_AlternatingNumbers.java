import java.util.*;

//  0 1 2 3             9 
// -5,-2,5,2,4,7,1,8,0,-8
// -5,5,-8,2,-2,4,7,1,8,0
class PR_17_AlternatingNumbers{
    static boolean isPresent(int i,int arr[]){
        int s = 0,e = arr.length-1;
        int m;
        while(s<=e){
            m = (s+e)/2;
            if (arr[i]==m)
                return true;
            else if (arr[i]<m)
                e = m-1;
            else 
                s = m+1;
        }
        return false;
    }

    static boolean isNegativePresent(int arr[]){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]<0)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = {-5,-2,5,2,4,7,1,8,0,-8};
        int arr2[] = new int [arr1.length];
        arr2[0] = -1;
        int checked_indices[] = new int [arr1.length];

        for (int i = 0;i<arr1.length;i++){
            if (isNegativePresent(arr1)){
                for (int j = 0;j<arr1.length;j++){
                    if (arr1[i]<0 && i%2==0 && (!(isPresent(i,checked_indices)))){
                        arr2[i] = arr1[i];
                        checked_indices[i] = i;
                    }
                    else if (arr2[i]>0&&i%2==1 && (!(isPresent(i, checked_indices)))){
                        arr2[i] = arr1[i];
                        checked_indices[i] = i;
                    }
                }
            }
            else {
                if (!(isPresent(i, checked_indices))){
                    arr2[i] = arr1[i];
                }
            }

        
        }

        for (int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
}