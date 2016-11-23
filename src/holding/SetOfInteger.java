package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/2/2016.
 */
public class SetOfInteger {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        Random random = new Random(47);
        for(int i = 1; i < 10000; i++){
            set.add(random.nextInt(30));
        }
        System.out.print(set + " ");

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int i = 1; i < 10000; i++){
            sortedSet.add(random.nextInt(30));
        }
        System.out.print(sortedSet + " ");
    }
}
