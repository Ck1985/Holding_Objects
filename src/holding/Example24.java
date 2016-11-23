package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/14/2016.
 */
public class Example24 {
    public static void main(String[] args){
        Map<String, Integer> mapSource = new LinkedHashMap<>();
        mapSource.put("Ten", 10);
        mapSource.put("Nine", 9);
        mapSource.put("Eight", 8);
        mapSource.put("Seven", 7);
        mapSource.put("Six", 6);
        mapSource.put("Five", 5);
        mapSource.put("Four", 4);
        mapSource.put("Three", 3);
        mapSource.put("Two", 2);
        mapSource.put("One", 1);
        mapSource.put("Zero", 0);

        System.out.println(mapSource);

        Map<String, Integer> tempMap = new LinkedHashMap<>();
        Set<String> keySet = mapSource.keySet();
        Set<String> sortedkeySet = new TreeSet<>(keySet);
        System.out.println(sortedkeySet);

        Iterator<String> sortedkeySetIterator = sortedkeySet.iterator();
        while(sortedkeySetIterator.hasNext()){
            String keyIterator = sortedkeySetIterator.next();
            tempMap.put(keyIterator, mapSource.get(keyIterator));
            mapSource.remove(keyIterator);
        }
        System.out.println("mapSource: " + mapSource);
        System.out.println("tempMap: " + tempMap);

        Set<String> sortedkeySetTempMap = new TreeSet<>(tempMap.keySet());
        Iterator<String> sortedkeySetTempIterator = sortedkeySetTempMap.iterator();
        while(sortedkeySetTempIterator.hasNext()){
            String keyTemp = sortedkeySetTempIterator.next();
            mapSource.put(keyTemp, tempMap.get(keyTemp));
            tempMap.remove(keyTemp);
        }
        System.out.println("mapSource: " + mapSource);
        tempMap.clear();
        System.out.println("tempMap: " + tempMap);
    }
}
