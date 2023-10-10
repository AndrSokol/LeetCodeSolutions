package leetcode.algocource.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(List.of(1,2,3));

        // add
        queue.offer(4);
        queue.offer(5);

        Integer el = queue.peek();
        System.out.println(el); // 1

        Integer poll = queue.poll();
        System.out.println(poll); // 1
        System.out.println(queue.peek()); // 2

        System.out.println(queue.size()); // 4
        System.out.println(queue.isEmpty()); // false

    }
}
