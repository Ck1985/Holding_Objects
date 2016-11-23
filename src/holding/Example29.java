package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/16/2016.
 */
class MyClass extends Object{

}
public class Example29 {
    private static PriorityQueue<MyClass> pq = new PriorityQueue<>();
    public static void main(String[] args){
        MyClass class1 = new MyClass();
        MyClass class2 = new MyClass();
        MyClass class3 = new MyClass();
        pq.offer(class1);
        pq.offer(class2);
        pq.offer(class3);
        pq.offer(class1);
        pq.offer(new MyClass());
        pq.offer(new MyClass());
    }
}
