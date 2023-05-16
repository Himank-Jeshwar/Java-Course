public class CustomArray{
    int capacity,size;
    private int arr[];

    CustomArray(int capacity){
        this.capacity = capacity;
        this.size = 0;
        arr = new int [capacity];
    }

    void set (int element,int index){
        arr[index] = element;
        size++;
    }

    void insert (int element,int index){
        for (int i = size-1;i>=index;i--){
            arr[i+1] = arr[i];
        }
        arr[index] = element;
        size++;
    }

    void delete (int index){
        for (int i = index;i<size;i++){
            arr[i] = arr[i+1];
        }
        size--;
    }

    int indexOf (int element){
        // linear search
        for (int i = 0;i<size;i++){
            if (element==arr[i])
                return i;
        }        
        return -1;
    }

    int get (int index){
        return arr[index];
    }

    CustomArray merge(CustomArray cusArr){
        CustomArray p = new CustomArray(this.size+cusArr.size);
        p.size = p.capacity;
        for (int i = 0;i<p.capacity;i++){
            if (i<this.size)
                p.arr[i] = this.arr[i];
            else 
                p.arr[i] = cusArr.arr[i-this.size];
        }
        return p;
    }

    CustomArray merge(int [] cusArr){
        // int p[] = new int [this.size + cusArr.length];
        CustomArray p = new CustomArray(this.size+cusArr.length);
        p.size = p.capacity;
        for (int i = 0;i<p.capacity;i++){
            if (i<this.size)
                p.arr[i] = this.arr[i];
            else 
                p.arr[i] = cusArr[i-this.size];
        }

        return p;
    }
    void show(){
        System.out.print("[");
        for (int i = 0;i<this.size;i++){
            System.out.print(arr[i]);

            if (i<this.size-1)
                System.out.print(",");
            
        }
        System.out.println("]");
    }

}
