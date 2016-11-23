package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
public class ForeachCollection {
    public static void main(String[] args){
        Collection<String> list = new LinkedList<>();
        Collections.addAll(list, "Take the long way home".split(" "));
        for(String s : list){
            System.out.print(s + " ");
        }
    }
}
