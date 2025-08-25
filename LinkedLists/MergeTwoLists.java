public class MergeTwoLists {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;

        Node ans = mergeTwoLists(a, d);
        display(ans);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeTwoLists(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node head = new Node(100);
        Node temp = head;
        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }

        if(temp1 == null){
            temp.next = temp2;
        }else{
            temp.next = temp1;
        }
        return head.next;
    }
}
