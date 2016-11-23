package holding;
import java.util.*;
import net.mindview.util.*;
/**
 * Created by Anonymous11100001 on 7/9/2016.
 */
public class Example21 {
    public static void main(String[] args){
        List<String> list = new ArrayList<>(new TextFile("C:\\Users\\CK1985\\IdeaProjects\\Holding_Objects\\out\\production\\Holding_Objects\\test.txt", "\\W+"));
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        Iterator<String> setIterator = list.iterator();
        while(setIterator.hasNext()){
            String element = setIterator.next();
            Integer freg = map.get(element);
            map.put(element, freg == null ? 1 : (freg + 1));
        }
        System.out.print(map);
    }
}
