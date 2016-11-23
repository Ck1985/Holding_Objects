package holding;
import java.util.*;
import static net.mindview.util.Print.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/6/2016.
 */
public class Example18 {
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

        Set<String> sortedKey = new TreeSet<String>(gerbils.keySet());
        System.out.println(sortedKey);
        System.out.println();
        Map<String, Gerbil> sortedGerbils = new LinkedHashMap<>();
        for(String key : sortedKey){
            System.out.print("Adding ... " + key + ", ");
            sortedGerbils.put(key, gerbils.get(key));
        }
        System.out.println();
        System.out.println();
        System.out.println(sortedGerbils);
        System.out.println("Or just doing ...");
        Map<String, Gerbil> gerbils2 = new TreeMap<>(gerbils);
        System.out.println(gerbils2);
    }
}
