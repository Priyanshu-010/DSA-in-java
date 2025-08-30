package DoublyLinkedList;

public class Basics {
    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int data){
            val = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(1);
        Node d = new Node(9);
        Node e = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;
//        display(a);
        displayFromTail(e);
    }

    public static void displayFromTail(Node tail){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
