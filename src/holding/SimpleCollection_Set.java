package holding;
import static tk.anonymous11100001.util.Print.*;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
public class SimpleCollection_Set {
    public static void main(String[] args){
        Set<Integer> integers = new HashSet<Integer>();
        for(int i = 1; i < 9; i++){
            integers.add(i);
        }
        for(Integer c : integers){
            System.out.print(c + " ");
        }
    }
}
