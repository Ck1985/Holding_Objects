package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
public class PrintContainer {
    public static Collection fill(Collection<String> collection){
        collection.add("Rat");
        collection.add("Cat");
        collection.add("Dog");
        collection.add("Dog");
        return collection;
    }
    public static Map fill(Map<String, String> map){
        map.put("Rat", "Fuzy");
        map.put("Cat", "Rags");
        map.put("Dog", "Bosco");
        map.put("Dog", "Spot");
        return map;
    }
    public static void main(String[] args){
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));
    }
}
