package holding;
import java.util.*;
import java.util.Collections.*;
/**
 * Created by Anonymous11100001 on 7/18/2016.
 */
public class MultiIterableClass extends IterableClass {
    public Iterable<String> reserved(){
        return new Iterable<String>(){
            public Iterator<String> iterator(){
                return new Iterator<String>(){
                    private int currentIndex = words.length - 1;
                    public boolean hasNext(){
                        return this.currentIndex > -1;
                    }
                    public String next(){
                        return words[currentIndex--];
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
    public Iterable<String> randommized(){
        return new Iterable<String>(){
            public Iterator<String> iterator(){
                List<String> shuffed = new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffed);
                return shuffed.iterator();
            }
        };
    }
    public static void main(String[] args){
        MultiIterableClass mic = new MultiIterableClass();
        for(String s : mic.reserved()){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : mic.randommized()){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : mic){
            System.out.print(s + " ");
        }
    }
}
