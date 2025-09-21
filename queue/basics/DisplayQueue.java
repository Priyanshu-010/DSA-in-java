package basics;

import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(1);
        q.add(7);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q);

        Queue<Integer> qu = new LinkedList<>(); // helper queue
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x + " ");
            qu.add(x);
        }
        //q = qu; // first method
        System.out.println();
        while(!qu.isEmpty()){
            q.add(qu.poll());
        }
        System.out.println(q);
    }
}
