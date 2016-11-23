package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/18/2016.
 */
class ReveserArrayListClass<T> extends ArrayList<T>{
    public ReveserArrayListClass(Collection<T> collection){
        super(collection);
    }
    public Iterable<T> reveser(){
        return new Iterable<T>(){
            public Iterator<T> iterator(){
                return new Iterator<T>(){
                    private int currentIndex = size() - 1;
                    public boolean hasNext(){
                        return this.currentIndex > -1;
                    }
                    public T next(){
                        return get(currentIndex--);
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
}
public class AdapterMethodIdiom {
    public static void main(String[] args){
        ReveserArrayListClass<String> ral = new ReveserArrayListClass<String>(Arrays.asList("To be or not to be".split(" ")));
        for(String s : ral){
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : ral.reveser()){
            System.out.print(s + " ");
        }
    }
}
