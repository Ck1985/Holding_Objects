package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/16/2016.
 */
public class Example28 {
    public static void main(String[] args){
        PriorityQueue<Double> doublePQ = new PriorityQueue<>();
        Random random = new Random();
        for(int i = 1; i < 10; i++){
            doublePQ.offer(random.nextDouble());
        }
        while(doublePQ.peek() != null){
            System.out.print(doublePQ.poll() + " ");
        }
    }
}
