package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/28/2016.
 */
public class Sequence {
    private List<Object> sequence;
    private int size = 0;
    public Sequence(int size){
        this.size = size;
        sequence = new ArrayList<Object>(this.size);
    }
    public void add(Object object){
        sequence.add(object);
    }
    public Iterator<Object> iterator(){
        return this.sequence.iterator();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++){
            sequence.add(i);
        }
        Iterator<Object> it = sequence.iterator();
        while(it.hasNext()){
            Object object = it.next();
            System.out.print(object + "  ");
        }
    }
}
