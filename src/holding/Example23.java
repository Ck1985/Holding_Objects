package holding;
import java.util.*;

/**
 * Created by Anonymous11100001 on 7/10/2016.
 */
/*public class Example23{
    private static int findMaxKey(int n){
        Map<Integer, Integer> map = new TreeMap<>();
        Random random = new Random();
        for(int i = 1; i < n; i++){
            Integer key = random.nextInt(20);
            Integer freq = map.get(key);
            map.put(key, (freq == null ? 1 : freq + 1));
        }

        Set<Map.Entry<Integer, Integer>> setMapEntry = new LinkedHashSet<Map.Entry<Integer, Integer>>(map.entrySet());
        Iterator<Map.Entry<Integer, Integer>> setMapEntryIterator = setMapEntry.iterator();
        int maxValue = 0;

        int keyOfMaxValue = 0;
        while(setMapEntryIterator.hasNext()){
            Map.Entry<Integer, Integer> entry = setMapEntryIterator.next();
            Integer entryValue = entry.getValue();
            maxValue = maxValue < entryValue ? entryValue : maxValue;
        }
        for(int i = 0; i < map.keySet().size(); i++){
            if(map.get(i) == maxValue){
                keyOfMaxValue = i;
            }
        }

        return keyOfMaxValue;
    }
    public static void main(String[] args){
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i < 2000; i++){
            int maxkey = findMaxKey(10000);
            Integer freq = map.get(maxkey);
            map.put(maxkey, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}*/



/********************* Source*********************/
//import java.util.*;


public class Example23 {
    private static int getBestInt20(int n) {
        Random rand = new Random();
        Map<Integer, Integer> m =
                new TreeMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        int max = 0;
        for(int i = 0; i < m.keySet().size(); i++) {
            max = max < m.get(i) ? m.get(i) : max;
        }
        Set<Map.Entry<Integer,Integer>> me = new
                LinkedHashSet<Map.Entry<Integer,Integer>>(m.entrySet());
        int maxKey = 0;
        Iterator<Map.Entry<Integer,Integer>> it = me.iterator();
        while(it.hasNext()) {
            Map.Entry<Integer,Integer> findMax = it.next();
            if(findMax.getValue() == max)
                maxKey = findMax.getKey();
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<Integer,Integer> m20 =
                new TreeMap<Integer,Integer>();
        for(int i = 0; i < 2000; i++) {
            int x = getBestInt20(10000);
            Integer freq = m20.get(x);
            m20.put(x, freq == null ? 1 : freq + 1);
        }
        System.out.println("Most often picked ints, 0 - 19, in 2000 tests of 10,000 random picks: " + m20);
    }
}
