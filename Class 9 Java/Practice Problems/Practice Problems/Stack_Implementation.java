class StackEmptyException extends Exception{
    @Override
    public String toString(){
        return "StackEmptyException";
    }
    
    @Override
    public void printStackTrace() {
        System.out.println(" : cannot remove element since the stack is empty.");
    }
}

class StackFullException extends Exception{
    @Override
    public String toString(){
        return "StackFullException";
    }

    @Override
    public void printStackTrace(){
        System.out.println(" : cannot push element since the stack is full.");
    }
}
class CustomStack {
    private int size,arr[],top;
    
    CustomStack(int size){
        this.size = size;
        top = -1;
        arr = new int [size];
    }

    void push(int element)throws StackFullException{
        //Pushes the element to the bottom of the stack*
        if (isFull())
            throw new StackFullException();

        top++;
        arr[top] = element;
    }

    int pop()throws StackEmptyException{
        // Removes the top most element
        if (isFull()){
            throw new StackEmptyException();
        }

        for (int i = top;i>size-1;i--){
            arr[i]=arr[i+1];
        }
        return (arr[top--]);
    }

    boolean isFull(){
        if (top==size-1)
            return true;
        else 
            return false; 
    }

    boolean isEmpty(){
        if (top==-1)
            return true;
        else 
            return false;
    }


    void printStack(){
        int copy = top;
        while (copy>=0){
            System.out.println(arr[copy]);
            copy--;
        }
    }

    int peek(int index){
        return arr[index];
    }
}

class Main{
    public static void main(String[] args)throws StackEmptyException,StackFullException {
        CustomStack stk = new CustomStack(10);
        stk.push(10);
        stk.push(90);
        stk.push(112);
        stk.push(78);

        stk.pop();
        // int el = stk.peek(0);
        // System.out.println(el);
        stk.printStack();
    }
}
