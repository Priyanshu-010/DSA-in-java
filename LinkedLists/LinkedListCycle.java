public class LinkedListCycle {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(1);
        Node c = new Node(9);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = b;

        boolean ans = isLinkedListCycle(a);
        System.out.println(ans);
    }

    public static boolean isLinkedListCycle(Node head){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
