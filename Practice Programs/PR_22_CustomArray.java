class CustomArray<T> {
    private T data;
    private CustomArray<T> next;
     
    void insert(T data){
        CustomArray<T> ptr = new CustomArray<>();
        CustomArray<T> copy = this;
        ptr.data = data;
        if (this.data==null){
            this.data = data;
            this.next = null;
        }
        else {
            while (copy.next!=null){
                copy = copy.next;
            }
            copy.next = ptr;
            ptr.next = null;
        }
    } 
    CustomArray<T> insertAtStart(T data){
        CustomArray<T> ptr = this;
        CustomArray<T> p = new CustomArray<>();
        p.data = data;
        p.next = ptr;
        ptr = p;
        return ptr;
    }
    void insert(T data,int index){
        CustomArray<T> ptr = this;
        CustomArray<T> p = new CustomArray<>();
        if (index!=0){
            p.data = data;
            for (int i = 0;i<index-1;i++){
                ptr = ptr.next;    
            }
            
            p.next = ptr.next;
            ptr.next = p;
        }   
    }

    T elementAt(int index){
        CustomArray<T> p = this;
        for (int i = 0;i<   index;i++){
            p = p.next;
        }
        return p.data;
    }
    void print(){
        CustomArray<T> p = this;
        System.out.print("{");
        while(p!=null){
            System.out.print(p.data);
            if(p.next!=null)
                System.out.print(",");
            p = p.next;
        }
        System.out.print("}");
        System.out.println();
    }
}
class Main{
    public static void main(String[] args) {
        CustomArray <Integer> list = new CustomArray<>();
        CustomArray <String> strList = new CustomArray<>();
        list.insert(56);
        list.insert(78);
        list.insert(99);
        list.insert(107);
        list.insert(44);
        list.insert(12);
        list.insert(55);

        System.out.println(list.elementAt(2));        
        // System.out.println(ob1.data);
    }
}
