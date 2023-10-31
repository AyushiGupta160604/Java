public class SinglyLinkedList<T> {
    public static class Node{
        public int data;
        public Node nextNode;
    }
    public static Node headNode;
    public int size;

    public static boolean isEmpty(){
        return headNode == null;
    }
    public static void printList(){
        for(int i = 1; i <= 10; i++){
            insertAtEnd(i);
        }
    }
    public static void insertAtEnd(int data){
        Node Temp = new Node();
        Temp.data = data;
        Node T = headNode;
        if(isEmpty()){
            System.out.println("List is Empty!");
            headNode = Temp;
        }
        else{
            while(T.nextNode != null){
                T.nextNode = T;
            }
            T.nextNode = Temp;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printList();
    }
}
