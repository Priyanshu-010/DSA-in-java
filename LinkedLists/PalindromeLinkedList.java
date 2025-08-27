public class PalindromeLinkedList {

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
        Node c = new Node(10);
        Node d = new Node(10);
        Node e = new Node(3);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        boolean ans = isPalindrome(a);
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
    public static boolean isPalindrome(Node head){
        if(head.next == null){
            return true;
        }
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
        while(temp2 != null){
            if(temp1.data != temp2.data){
                return false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return true;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
