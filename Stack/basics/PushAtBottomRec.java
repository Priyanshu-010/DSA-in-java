package basics;

import java.util.Stack;

public class PushAtBottomRec {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(5);
        st.push(9);
        System.out.println(st);

        pushAtBottomRec(st);
        System.out.println(st);
    }

    public static void pushAtBottomRec(Stack<Integer> st){
        
        int x = 8;
        if(st.size() == 0) {
            st.push(x);
            return;
        };

        int top = st.pop();

        pushAtBottomRec(st);
        st.push(top);
    }
}
