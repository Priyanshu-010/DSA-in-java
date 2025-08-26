public class ReverseLinkedList {
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
        display(a);
//        Node ans = reverse(a);
//        display(ans);
        Node ans1 = reverseIteratively(a);
        display(ans1);

    }

    public static Node reverse(Node head){
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node reverseIteratively(Node head){
        Node curr = head;
        Node prev = null;
        Node agla = null;

        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
