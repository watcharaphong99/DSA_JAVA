package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueForInterview {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("Best"));
        queue.offer(new Person("Test"));
        queue.offer(new Person("Yes"));
        queue.offer(new Person("Nest"));
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println();
        var frontOfQueue = queue.poll();
        System.out.println(frontOfQueue);
        System.out.println(queue);

        while (!queue.isEmpty()) {
            var person = queue.poll();
            System.out.println(person);
        }
    }

    private record Person(String name) {

    }
}
