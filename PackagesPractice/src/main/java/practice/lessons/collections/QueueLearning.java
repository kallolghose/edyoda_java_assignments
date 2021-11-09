package practice.lessons.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLearning {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(10);
        integerQueue.add(20);
        integerQueue.add(30);
        System.out.println("Queue : " + integerQueue);
        Integer dataRemoved = integerQueue.remove();
        System.out.println("Data Removed : " + dataRemoved);
        System.out.println("Queue : " + integerQueue);
        System.out.println("Peek : " + integerQueue.peek());
        System.out.println("Queue : " + integerQueue);
        Integer polledData = integerQueue.poll();
        System.out.println("Polled Data : " + polledData);
        System.out.println("Queue : " + integerQueue);
        integerQueue.remove();

        System.out.println("Queue Size : " + integerQueue.size());

        Integer polledWhenQueueIsEmpty = integerQueue.poll();
        System.out.println("Polled when queue is empty : " + polledWhenQueueIsEmpty);

        Integer removeWhenQueueIsEmpty = integerQueue.remove();
        System.out.println("Remove when queue is empty : " + removeWhenQueueIsEmpty);
    }

}
