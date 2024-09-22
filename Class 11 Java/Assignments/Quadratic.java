class Quadratic {
    private int a,b,c;
    
    public Quadratic (int x,int y,int z){
        a=x;
        b=y;
        c=z;
    }
    
    void compute(){
        // declaration
        double d = b*b-4*a*c;
        double root1 = 0,root2 = 0;
        
        // assigning message
        String msg = (d>0)?"Roots are real and unequal":(d==0)?"Roots are equal":"Roots are imaginary";
        char ch = (d>0)?'r':(d==0)?'e':'i';
        
        // decision and calculation
        switch(ch){
            case 'r':
            case 'e':
                root1 = (-b+Math.sqrt(d))/(2*a);
                root2 = (-b-Math.sqrt(d))/(2*a);
                System.out.println("Root 1 = "+root1+"\nRoot 2 = "+root2);
                
            default:
                System.out.print(msg);
        }
    }
}