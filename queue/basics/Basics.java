package basics;

import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // We can write LinkedList or ArrayDeque here
        q.add(2);
        q.add(1);
        q.add(7);
        q.add(4);
        System.out.println(q.size());
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println(q.size());
        q.poll();  // remove
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.element()); // peek
    }
}
