package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
public class ArrayIsNotIterable {
    public static <T> void test(Iterable<T> iterable){
        for(T t : iterable){
            System.out.print(t + "  ");
        }
    }
    public static void main(String[] args){
        Integer[] num = {1,2,3};
        String[] str = {"A", "B", "C"};
        //!test(num); test(str);
        test(Arrays.asList(num));
        test(Arrays.asList(str));
    }
}
