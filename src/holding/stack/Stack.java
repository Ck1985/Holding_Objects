package holding.stack;
import java.util.LinkedList;
/**
 * Created by Anonymous11100001 on 7/2/2016.
 */
public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();
    public void push(T object){
        linkedList.addFirst(object);
    }
    public T peek(){
        return linkedList.getFirst();
    }
    public T pop(){
        return linkedList.removeFirst();
    }
    public boolean empty(){
        return linkedList.isEmpty();
    }
    public String toString(){
        return linkedList.toString();
    }
}
