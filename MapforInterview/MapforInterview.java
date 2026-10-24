package MapforInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MapforInterview {
    public static void main(String[] args) {
       Map<Integer,Student> studentTable = new HashMap<>();
       var best = new Student(1, "best");
       studentTable.put(best.id, best);
       System.out.println(studentTable.get(1));
       if(studentTable.containsKey(4)){
            System.out.println(studentTable.get(4));
       }

        //PriorityQueue + hashmap - > Character Frequency
        // Find the most frequency of character on message
        String message = "sfsfsfkjgksjkdjljkjslierwi@@";
        Map<Character,Integer> freqMap = new HashMap<>();
        for (char c : message.toCharArray()){
            freqMap.putIfAbsent(c,0);
            freqMap.put(c,freqMap.get(c)+1);
        }

       //Max Heap
       var pq = new PriorityQueue<CharCount>(
        (a, b) -> Integer.compare(b.count(), a.count())
       );
       for (var e : freqMap.entrySet()) {
            pq.add(new CharCount(e.getKey(), e.getValue()));
       }

       while (!pq.isEmpty()) {
        var item = pq.poll();
        System.out.println(item.ch() + "-> " + item.count());
       }

      
    }

    private record Student(int id,String name){

    }

    private record CharCount(char ch, int count){

    }
}
