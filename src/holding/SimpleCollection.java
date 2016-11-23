package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
public class SimpleCollection {
    public static void main(String[] args){
        Collection<Integer> integers = new ArrayList<Integer>();
        for(int i = 1; i < 9; i++){
            integers.add(i);
        }
        for(Integer i : integers){
            System.out.print(i + " ");
        }
    }
}
