public class LinkedListCycleII {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(9);
        Node d = new Node(4);
        Node e = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;

        Node ans = llNode(a);
        System.out.println(ans.data);
    }

    public static Node llNode(Node head){
        boolean isCycle = false;
        if(head == null || head.next == null){
            return null;
        }
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                isCycle = true;
                break;
            }
        }
        Node temp = head;
        if(isCycle){
            while(temp != slow && slow !=null && slow.next == null){
                temp = temp.next;
                slow = slow.next;
            }
        }else{
            return null;
        }

        return slow;
    }
}
