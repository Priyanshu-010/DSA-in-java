import java.security.PublicKey;

public class MaxTwinSUm {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        Node c = new Node(9);
        Node d = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;

        int ans = twinSum(a);
        System.out.println(ans);
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node Next = null;

        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        return prev;
    }
    public static int twinSum(Node head){
        int max = 0;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;

        Node temp1 = head;
        Node temp2 = slow.next;
        int ans = 0;
        while(temp2 != null){

            ans = temp1.data + temp2.data;
            if(ans > max){
                max = ans;
                ans = 0;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }
}
