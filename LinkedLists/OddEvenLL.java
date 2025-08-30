public class OddEvenLL {
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
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        oddEven(a);
        display(a);
    }
    public static void display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " ");
            temp  =temp.next;
        }
        System.out.println();
    }
    public static Node oddEven(Node head){
        Node odd = new Node(0);
        Node even = new Node(0);
        Node tempo = odd;
        Node tempe = even;
        Node temp = head;
        while(temp != null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;


            tempe.next = temp;
            if(temp == null) break;
            temp = temp.next;
            tempe = tempe.next;
        }

        odd = odd.next;
        even = even.next;
        tempo.next = even;

        return odd;
    }
}
