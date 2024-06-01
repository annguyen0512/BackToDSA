class stack{
    int size;
    int top;
    int[] arrayStack;

    public stack(int s) {
        size = s;
        top = -1;
        arrayStack = new int[size];
    }
    public void push(int i){
        arrayStack[++top] = i;
    }
    public int top(){
        return arrayStack[top];
    }
    public int pop(){
        return arrayStack[top--];
    }
    public boolean isEmpty(){
        return (top== -1);
    }
    public boolean isFull(){
        return (top == size-1);
    }
    public static void main(String[] args) {
        stack newStack = new stack(5);
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        while( !newStack.isEmpty() )     // until it's empty,
         {                             // delete item from stack
         long value = newStack.pop();
         System.out.print(value);      // display it
         System.out.print(" ");
         }  // end while
        System.out.println("");
    }
}