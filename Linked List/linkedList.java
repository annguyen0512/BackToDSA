public class linkedList {
    Node head;

    public boolean isEmpty(){
        return (head == null);
    }
    public int insertFirst(int i){
        Node newNode = new Node(i);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        return newNode.data;
    }
    
    public int deleteFirst(){
        if(isEmpty()){
            head = null;
        }else{
            head = head.next;
        }
        return head.data;
    }

    public int deleteMiddle(int i){
        Node current = head;
        Node pre;
        if(isEmpty()){
            System.out.println("Empty list");
            return 0;
        }else if(head.data == i){
            printList();
            head = head.next;
        }
        else{
            while(true){
                pre = current;
                current = current.next;
                if(current.data == i){
                    pre.next = current.next;
                    printList();
                    return current.data;
                }
                System.out.println("The deleted input does not exist");
                return -1;
            }
        }
        return -1;
    }

    public void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        linkedList list = new linkedList();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.printList();
        list.deleteMiddle(5);
    }
}
