class PR_03_SatisfyEquation{
    int satis(int a,int b,int c,int d){
        int eqn = a*a*a + b*b*b + c*c*c;
        return (eqn==d*d*d)?0:-1;
    }
}