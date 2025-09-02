package basics;

import java.util.*;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // Taking input from user

//        int n;
//        System.out.print("Enter the number of elements: ");
//        n = sc.nextInt();
//        System.out.println("Enter the elements: ");
//        for (int i = 1; i <= n; i++) {
//            int in = sc.nextInt();
//            st.push(in);
//        }
//        System.out.println(st);

        // Reversing a Stack

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0){
            int x = st.peek();
            rt.push(x);
            st.pop();

            // OR
//            rt.push(st.pop());
        }
//        System.out.println(rt);

        // Now if we do this again then we will solve the question

        Stack<Integer> gt = new Stack<>();
        while (rt.size() > 0){
            int x = rt.peek();
            gt.push(x);
            rt.pop();

            // OR
//            gt.push(rt.pop());
        }
        System.out.println(gt);
    }


}
