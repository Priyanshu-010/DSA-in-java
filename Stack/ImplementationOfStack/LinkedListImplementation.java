package ImplementationOfStack;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        Node head = null;
        private int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRec(Node h){
            if(h==null)return;
            displayRec(h.next);
            System.out.print(h.data+ " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp =temp.next;
            }
            System.out.println();
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }

        void peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return;
            }
            System.out.println(head.data);
        }
        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size == 0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.display();
        System.out.println(st.size());
        System.out.println(st.pop());;
        st.display();
        st.peek();
        System.out.println(st.isEmpty());
    }
}
