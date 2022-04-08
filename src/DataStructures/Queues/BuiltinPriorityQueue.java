package DataStructures.Queues;

import java.util.PriorityQueue;

public class BuiltinPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(20);
        queue.add(50);
        while(!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
