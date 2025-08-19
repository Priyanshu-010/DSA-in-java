public class NthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node nthNode(Node head, int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        temp = head;
        int target = size - n + 1;

        for(int i = 1; i<= target-1; i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node optimizedNthNode(Node head, int n){
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

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(3);
        Node c = new Node(12);
        Node d = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;

        Node ans = nthNode(a, 2);
        System.out.println(ans.data);
        Node optAns = optimizedNthNode(a, 2);
        System.out.println(optAns.data);
    }
}
