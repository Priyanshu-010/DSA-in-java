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
// We should always use a temporary node or a function (beacause it's pass by value)
// for printing a linked lists so the head doesn't change
        while(temp != null){  // Printing Linked Lists
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        displayRecursively(a);
    }
    public static void display(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Printng linked lists recursively

    public static void displayRecursively(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        displayRecursively(head.next);

        // This will print the linked list in reverse
//        displayRecursively(head.next);
//        System.out.print(head.data + " ");
    }
}
