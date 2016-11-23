package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/6/2016.
 */
public class Example19 {
    public static void main(String[] args){
        Map<String, Gerbil> gerbils = new HashMap<>();
        gerbils.put("Fuzzy", new Gerbil(0));
        gerbils.put("Spot", new Gerbil(1));
        gerbils.put("Speedy", new Gerbil(2));
        gerbils.put("Dopey", new Gerbil(3));
        gerbils.put("Sleepy", new Gerbil(4));
        gerbils.put("Happy", new Gerbil(5));
        gerbils.put("Funny", new Gerbil(6));
        gerbils.put("Silly", new Gerbil(7));
        gerbils.put("Goofy", new Gerbil(8));
        gerbils.put("Wowee", new Gerbil(9));

        System.out.println(gerbils);
        System.out.println();

        Set<String> key = new HashSet<>(gerbils.keySet());
        Set<String> key2 = new LinkedHashSet<>(gerbils.keySet());
        System.out.println("key: " + key);
        System.out.println("key2: " + key2);
        System.out.println();

        Map<String, Gerbil> linkedGerbils = new LinkedHashMap<>();
        Map<String, Gerbil> linkedGerbil2 = new LinkedHashMap<>();
        for(String k : key){
            System.out.print("Adding ..." +  k);
            linkedGerbils.put(k, gerbils.get(k));
        }
        System.out.println();
        for(String k : key2){
            linkedGerbil2.put(k, gerbils.get(k));
        }
        System.out.println(linkedGerbils);
        System.out.println(linkedGerbil2);
        System.out.println();
    }
}
