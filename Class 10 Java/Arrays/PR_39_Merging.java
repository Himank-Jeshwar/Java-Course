class PR_39_Merging {
    public static void main(String[] args) {
        int x[] = {5,-3,-2,1,0,12,14,16,25,13};
        int y[] = {6,5,10,15,18,20,22,30};
        int z[] = new int [18];

        int m = 0,n=0;

        for (int i = 0;i<18;i++){
            if (i%2==0&&m<x.length)
                z[i] = x[m++];
            else
                if (m>=x.length)
                    z[i] = y[n++];

            else 
                if (i%2==1&&n<y.length)
                    z[i] = y[n++];
            else
                z[i] = x[m++];
        }

        System.out.print("z = ");
        for (int i = 0;i<18;i++)
            System.out.print(z[i]+" ");
    }    
}
