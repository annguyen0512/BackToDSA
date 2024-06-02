public class dynamicStack {
    int size;
    int[] stackArray;
    int top;
    public dynamicStack(int s) {
        size = s;
        stackArray = new int[size];
        this.top = -1;
    }
    public boolean isEmpty(){
        return(top == -1);
    }
    public void push(int value){
        if(top == size-1){
            int newStack[] = new int[size*2];
            for(int i = 0; i < size;i++){
                newStack[i] = stackArray[i];
            }
            newStack[++top] = value;
            stackArray = newStack;
            size = size*2;
        }else{
            stackArray[++top] = value;
        }
    }
    public void peak(){
        if(top == -1){
            System.out.println("Empty stack!");
        }else{
            System.out.println(stackArray[top]);
        }
    }
    public void pop(){
        if(top == -1){
            System.out.println("Empty stack!");
        }else{
            System.out.println(stackArray[top--]);
        }
    }
    public void printStack(){
        int i = top;
        if(top == -1){
            System.out.println("Empty stack!");
        }else{
            while(i != -1){
                System.out.print(stackArray[i--] + " ");
            }
            System.out.print("\n");
        }
        
    }

    public static void main(String[] args){
        dynamicStack stack = new dynamicStack(5);
        stack.pop();
        stack.printStack();
        stack.peak();
    }
}
