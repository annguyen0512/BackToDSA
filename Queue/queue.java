class queue{
    int size,front,rear,capacity;
    int[] queueArray;
    public queue(int capacity) {
        size = 0;
        front = 0;
        rear = this.front + this.size - 1;
        this.capacity = capacity;
        queueArray = new int[this.capacity];
    }
    
    public boolean isEmpty(){
        return (this.size == 0);
    }

    public boolean isFull(){
        return (this.size == capacity);
    }

    public int front(){
        return queueArray[front];
    }

    public int rear(){
        return queueArray[front + size - 1];
    }

    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full!");
        }else{
            queueArray[size++] = value;
            System.out.println("Enqueue item: "+ value);
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            System.out.println("Dequeue item: "+ queueArray[front] + "\n");
            front++;
            size--;
        }
    }

    public void printQueue(){
        int index = front;
        while(size != 0){
            System.out.print(queueArray[index] + " ");
            index++;
            size--;
        }   
    }
    
    public static void main(String[] args){
        queue Queue = new queue(5);
        Queue.enqueue(10);
        Queue.enqueue(20);
        Queue.enqueue(30);
        Queue.enqueue(40);
        Queue.dequeue();
        System.out.println(Queue.front());
        System.out.println(Queue.rear());
    }
}