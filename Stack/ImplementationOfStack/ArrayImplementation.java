package ImplementationOfStack;


public class ArrayImplementation {

    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0; // vvv imp
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            System.out.println(arr[idx-1]);
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }

        void display(){
            for (int i = 0; i <= idx-1; i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0){
                return true;
            }else{
                return false;
            }
        }

        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
//        st.peek();

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(7);
        st.push(3);
        System.out.println(st.isFull());
        st.push(9);
        System.out.println(st.capacity());
    }
}
