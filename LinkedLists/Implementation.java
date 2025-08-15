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
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.display();
    }
}
