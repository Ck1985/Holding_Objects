package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
public class IterableClass implements Iterable<String> {
    protected String[] words = ("And that is how we known the earth " +
            "to be the banana - the shaped").split(" ");
    public Iterator<String> iterator(){
        return new Iterator<String>(){
            private int index = 0;
            public boolean hasNext(){
                return this.index < words.length;
            }
            public String next(){
                return words[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        IterableClass iterableClass = new IterableClass();
        for(String s : iterableClass){
            System.out.print(s + " ");
        }
    }
}
