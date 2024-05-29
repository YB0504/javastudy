package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {
    public static void main(String[] args) {
        Queue q = new LinkedList();

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Queue =");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
