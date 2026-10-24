package priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueforInterview {
    public static void main(String[] args) {

        PriorityQueue<Member> member = new PriorityQueue<>(
                (e1,e2)-> Integer.compare(e2.type.ranking,e1.type.ranking)
        );
        member.offer(new Member("Best",Type.SILVER));
        member.offer(new Member("Boot",Type.GOLD));
        member.offer(new Member("Base",Type.BRONZE));
        member.offer(new Member("Bool",Type.GOLD));

        while (!member.isEmpty()) {
            var current = member.poll();
            System.out.println(current);
        }

        PriorityQueue<Member> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(e->e.type.ranking)
        );
        minHeap.offer(new Member("Best",Type.SILVER));
        minHeap.offer(new Member("Boot",Type.GOLD));
        minHeap.offer(new Member("Base",Type.BRONZE));
        minHeap.offer(new Member("Bool",Type.GOLD));

        while (!minHeap.isEmpty()) {
            var current = minHeap.poll();
            System.out.println(current);
        }
    }

    private record Member(String name,Type type){}

    private enum Type {
        BRONZE(1),
        SILVER(2),
        GOLD(3),
        PLATINUM(4);

        private final int ranking;

        Type(int ranking) {
            this.ranking = ranking;
        }

        public int getRanking() {
            return this.ranking;
        }
    }


}
