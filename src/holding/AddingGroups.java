package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
public class AddingGroups {
    public static void main(String[] args){
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        Integer[] moreInt = {5,6,7,8};
        collection.addAll(Arrays.asList(moreInt));
        Collections.addAll(collection, 10,11,12,13);
        Collections.addAll(collection, moreInt);
        List<Integer> list = Arrays.asList(16,17,18,19);
        list.set(1, 100);
        list.add(22);
    }
}
