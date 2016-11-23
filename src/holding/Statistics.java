package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/4/2016.
 */
public class Statistics {
    public static void main(String[] args){
        Map<Integer, Integer> map = new TreeMap<>();
        Random random = new Random(47);
        for(int i = 1; i < 10000; i++){
            int k = random.nextInt(20);
            Integer v = map.get(k);
            map.put(k, (v == null ? 1 : v + 1));
        }
        System.out.print(map);
    }
}
