package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/15/2016.
 */
public class QueueDemo {
     static void printQueue(Queue queue ){
        while(!(queue.peek() == null)){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Random random = new Random(47);
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i < 20; i++){
            queue.offer(random.nextInt(40));
        }
        printQueue(queue);
        Queue<Character> queue2 = new LinkedList<>();
        char[] charArray = "Cong hoa xa hoi chu nghia viet nam".toCharArray();
        for(char c : charArray){
            queue2.offer(c);
        }
        printQueue(queue2);
    }
}
