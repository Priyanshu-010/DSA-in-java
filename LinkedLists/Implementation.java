public class Implementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist{
        Node head;
        Node tail;

        void insertAtEnd(int x){
            Node temp = new Node(x);
            if(head == null){ // empty list
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtStart(int x){
            Node temp = new Node(x);
            if(head == null){ // empty list
//                head = temp;
//                tail = temp;
                // Or
                head = tail = temp;
                // Or
                //insertAtEnd(x); // as the head is null it will only run the if condition of head is null
            }else{
                temp.next = head;
                head = temp;
            }
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.display();
        ll.insertAtStart(2);
        ll.insertAtStart(8);
        ll.insertAtStart(19);
        ll.display();
    }
}
