package holding;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/5/2016.
 */
public class Example17 {
    private static Map<String, Gerbil> gerbilMap = new HashMap<>();
    static{
        gerbilMap.put("Gerbil1", new Gerbil(1));
        gerbilMap.put("Gerbil2", new Gerbil(2));
        gerbilMap.put("Gerbil3", new Gerbil(3));
        gerbilMap.put("Gerbil4", new Gerbil(4));
        gerbilMap.put("Gerbil5", new Gerbil(5));
    }
    public static Gerbil lookupbyKey(String key){
        Iterator<String> gerbilIterator = gerbilMap.keySet().iterator();
        while(gerbilIterator.hasNext()){
            String keyIterator = gerbilIterator.next();
            if(key.equals(keyIterator)){
                return gerbilMap.get(keyIterator);
            }
        }
        return null;
    }
    public static void main(String[] args){
        print(gerbilMap.keySet());
        Gerbil result = lookupbyKey("Gerbil3");
        result.hop();
    }
}
