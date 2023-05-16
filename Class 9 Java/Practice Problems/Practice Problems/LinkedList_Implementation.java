class LinkedList {
    private int data;
    private LinkedList next,head;
    
    void set(int data,LinkedList next){
        head = this;
        this.data = data;
        this.next = next;
    }

    LinkedList deleteAtIndex (int index){
        LinkedList copy = head;
        LinkedList q ;
        for (int i = 0;i<index-1;i++){
            copy = copy.next;
        }
        q  = copy.next;
        copy.next = q.next;
        return head;
    }

    LinkedList insertAtIndex(int element,int index){
        LinkedList q = new LinkedList();
        q.data = element;

        LinkedList ptr = head;
        for (int i = 0;i<index-1;i++){
            ptr = ptr.next;
        }

        q.next = ptr.next;
        ptr.next = q;
        
        return head;
    }

    LinkedList insertAtStart(int element){
        LinkedList q = new LinkedList();
        q.data = element;
        q.next = head;
        return q;
    }
    void show(){
        // System.out.println(data);
        LinkedList copy = head;
        while(copy!=null){
            System.out.print(copy.data+" ");
            copy = copy.next;
        }
        System.out.println();
    }

    // n1 n2 n3
}

class LinkedList_Implementation{
    public static void main(String[] args) {
        LinkedList n1,n2,n3,n4;
        n1 = new LinkedList();
        n2 = new LinkedList();
        n3 = new LinkedList();
        n4 = new LinkedList();
        
        n1.set(10, n2);
        n2.set(45,n3);
        n3.set(90,n4);
        n4.set(11,null);

        
        // n1.show();
        // n1 = n1.deleteAtIndex(2);
        // n1 = n1.insertAtIndex(22, 2);
        n1 = n1.insertAtStart(99);
        n1.show();
    }
}
