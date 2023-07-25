class Sets {
    private int arr[],index,length;
    Sets(int length){
        this.length = length;
        arr = new int[this.length];
        index = -1;
    }
    private boolean isPresent(int el){
        for (int i = 0;i<arr.length;i++){
            if (el==arr[i])
                return true;
        }
        return false;
    }
 
    void add(int el)
    {
        if (!(isPresent(el)))
            arr[++index] = el;
    }    

    void show(){
        System.out.print("{");
        for (int i = 0;i<=index;i++){
            System.out.print(arr[i]);
            if (i<index)
                System.out.print(",");
        }
        System.out.println("}");
    }

    int cardinal(){
        return index+1;
    }
    Sets union(Sets s2){
        int len = this.length + s2.length;
        int unionSetIndex = this.index+s2.index;
        Sets unionSet = new Sets(len);

        for (int i = 0;i<=unionSetIndex;i++){
            if (!(unionSet.isPresent(this.arr[i])))
                unionSet.add(this.arr[i]);
            
            if (!(unionSet.isPresent(s2.arr[i])))
                unionSet.add(s2.arr[i]);
        }
        return unionSet;
    }

    Sets intersection(Sets s2){
        int len = this.length + s2.length;
        int intersectionSetIndex = this.index + s2.index;
        Sets intersectionSet = new Sets (len);

        for (int i = 0;i<intersectionSetIndex;i++){
            if (!(intersectionSet.isPresent(this.arr[i])))
                if (this.isPresent(this.arr[i])&&s2.isPresent(this.arr[i]))
                    intersectionSet.add(this.arr[i]);
            
            if (!(intersectionSet.isPresent(s2.arr[i])))
                if(s2.isPresent(s2.arr[i])&&this.isPresent(s2.arr[i])) 
                    intersectionSet.add(s2.arr[i]);
        }
        return intersectionSet;
    }
}

class Main{
    public static void main(String[] args) {
        Sets A = new Sets(10);
        Sets B = new Sets(10);
        Sets C,D;
        A.add(1);
        A.add(2);   
        A.add(3);    
        A.add(3); 
        System.out.print("A = ");
        A.show();

        B.add(4);
        B.add(5);
        B.add(5);
        B.add(3);
        B.add(2);
        B.add(2);
        B.add(6);
        System.out.print("B = ");
        B.show();

        C = A.union(B);
        D = A.intersection(B);
        System.out.print("\nUnion set : ");
        C.show();
        System.out.print("Intersection set : ");
        D.show();

        System.out.println("Cardinal number of set A : "+A.cardinal());
        System.out.println("Cardinal number of set B : "+B.cardinal());
        System.out.println("Cardinal number of C : "+C.cardinal());
        System.out.println("Cardinal number of D : "+D.cardinal());
    }
}
