public class RemoveElements {
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
        Node e = new Node(11);
        Node f = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a);
        removeElements(a, 3);
        display(a);
    }
    public static Node removeElements(Node head, int val){
        Node temp = new Node(0);
        temp.next = head;
        Node prev = temp;
        Node curr = head;

        while(curr != null){
            if(curr.data == val){
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return temp.next;
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
