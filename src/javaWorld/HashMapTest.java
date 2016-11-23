package javaWorld;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/19/2016.
 */
public class HashMapTest {
    public static void main(String[] args){
        Map hashMap = new HashMap();
        System.out.println("HashMap has size: " + hashMap.size());
        System.out.println("hashMap is empty: " + hashMap.isEmpty());
        hashMap.put(new String("Harriet"), new String("Bone"));
        hashMap.put(new String("Bailey"), new String("Big Chair"));
        hashMap.put(new String("Max"), new String("Tennis Ball"));
        System.out.println("HashMap has size: " + hashMap.size());
        System.out.println("hashMap is empty: " + hashMap.isEmpty());
        String key = "Max";
        if(hashMap.containsKey(key)){
            System.out.println("hashMap.contains(\"Max\"): " + key + " has Value: " + hashMap.get(key));
        }
        Set keyset = hashMap.keySet();
        Iterator iteratorkey = keyset.iterator();
        while(iteratorkey.hasNext()){
            String k = (String)iteratorkey.next();
            System.out.print("key: " + k + " has Value: " + hashMap.get(k));
        }
        hashMap.clear();
        System.out.println(hashMap);
    }
}
