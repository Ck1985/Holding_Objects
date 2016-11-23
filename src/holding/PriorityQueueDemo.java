package holding;
import java.util.*;
import holding.QueueDemo;
/**
 * Created by Anonymous11100001 on 7/15/2016.
 */
public class PriorityQueueDemo {
    public static void main(String[] args){
        Random random = new Random();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 1; i < 10; i++){
            priorityQueue.offer(random.nextInt(20));
        }
        QueueDemo.printQueue(priorityQueue);
        List<Integer> list = Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,9,14,18,21,23,25);
        priorityQueue = new PriorityQueue<>(list);
        System.out.println(list);
        QueueDemo.printQueue(priorityQueue);
        priorityQueue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
        priorityQueue.addAll(list);
        System.out.println(priorityQueue);
        QueueDemo.printQueue(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(" "));
        PriorityQueue<String> queuePQ = new PriorityQueue<>(strings);
        QueueDemo.printQueue(queuePQ);
        queuePQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        queuePQ.addAll(strings);
        QueueDemo.printQueue(queuePQ);

        Set<Character> set = new HashSet<>();
        for(char c : fact.toCharArray()){
            set.add(c);
        }
        PriorityQueue<Character> charQueue = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        charQueue.addAll(set);
        QueueDemo.printQueue(charQueue);
        PriorityQueue<Character> charQueue2 = new PriorityQueue<>();
        for(char c : fact.toCharArray()){
            charQueue2.offer(c);
        }
        QueueDemo.printQueue(charQueue2);
    }
}
