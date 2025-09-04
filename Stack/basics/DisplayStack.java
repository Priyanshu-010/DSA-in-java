package basics;

import java.util.Stack;

public class DisplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(5);
        st.push(9);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();

        while(st.size()> 0){
            rt.push(st.pop());
        }

        while(rt.size()>0){
            int x = rt.peek();
            System.out.print(x + " ");
            st.push(x);
            rt.pop();
        }
    }
}
