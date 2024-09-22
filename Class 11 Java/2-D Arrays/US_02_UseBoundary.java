class US_02_UseBoundary {
    public static void main(String[] args) {
        int a[][] = {{23,13,15,90},
                     {19,18,45,10},
                     {12,34,56,19},
                     {44,23,56,15}};

        PR_02_Boundary ob = new PR_02_Boundary(a);
        PR_02_Boundary sorted = ob.sort();

        System.out.println("Original Boundary : ");
        ob.show();
        System.out.println("Sorted Boundary : ");
        sorted.show();
    }    
}
