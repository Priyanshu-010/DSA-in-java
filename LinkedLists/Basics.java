public class Basics {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;

        Node temp = a;

        while(temp != null){  // Printing Linked Lists
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
