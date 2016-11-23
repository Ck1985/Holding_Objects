package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/19/2016.
 */
public class ModifyArrayAsList {
    public static void main(String[] args){
        Integer[] integers = new Integer[]{1,2,3,4,5,6,7,8,9};
        Random random = new Random();
        List<Integer> list1 = new ArrayList(Arrays.asList(integers));
        System.out.println("Before shuffle: " );
        System.out.println("list1: " + list1);
        System.out.println("integers: " + Arrays.toString(integers));
        System.out.println("After shuffle:");
        Collections.shuffle(list1);
        System.out.println("list1: " + list1);
        System.out.println("integers: " + Arrays.toString(integers));

        List<Integer> list2 = Arrays.asList(integers);
        System.out.println("Before shuffle: " );
        System.out.println("list2: " + list2);
        System.out.println("integers: " + Arrays.toString(integers));
        System.out.println("After shuffle:");
        Collections.shuffle(list2);
        System.out.println("list2: " + list2);
        System.out.println("integers: " + Arrays.toString(integers));
    }
}
