package basics;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(5);
        st.push(9);
        System.out.println(st);

        reversRecursive(st);
        System.out.println(st);

        //Reverse Iterative (Reversing stack using iteration)

//        Stack<Integer> rt = new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        System.out.println(rt);
//        Stack<Integer> at = new Stack<>();
//        while(rt.size()>0){
//            at.push(rt.pop());
//        }
//        System.out.println(at);
//        while (at.size()>0){
//            st.push(at.pop());
//        }
//        System.out.println(st);


    }

    public static void reversRecursive(Stack<Integer> st){
        if(st.size() == 1) return;
        int top = st.pop();
        reversRecursive(st);
        pushAtBottomRec(st, top);
    }

    public static void pushAtBottomRec(Stack<Integer> st, int x){
        if(st.size() == 0) {
            st.push(x);
            return;
        };

        int top = st.pop();

        pushAtBottomRec(st, x);
        st.push(top);
    }
}
