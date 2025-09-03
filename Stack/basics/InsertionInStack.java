package basics;

import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(5);
        st.push(9);
        System.out.println(st);

        int x = 4;

        int i = 2;
        Stack<Integer> temp = new Stack<>();
        while(st.size()>i){
            temp.push(st.pop());
        }

        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
