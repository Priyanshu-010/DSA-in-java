public class deleteNthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNodeFromLast(Node head, int n){
        Node slow = head;
        Node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Optimized Soln which works even if n is at tail coz previous soln will not work if n is at tail

    public static Node deleteNthNode(Node head, int n){
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        if(fast==null){ // if the nth node which we have to delete is head
            head= head.next;  // deleting head
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(3);
        Node c = new Node(12);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;

//        Node ans = nthNodeFromLast(a, 2);
//        ans.data = ans.next.data;
//        ans.next = ans.next.next;

        a = deleteNthNode(a, 3);

        display(a);

    }
}
