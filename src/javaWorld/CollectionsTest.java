/**
 * Created by Anonymous11100001 on 7/19/2016.
 */
package javaWorld;
import java.util.*;
public class CollectionsTest {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        String dog1 = "dog1", dog2 = "dog2", dog3 = "dog3";
        hashSet.add(dog1);
        hashSet.add(dog2);
        hashSet.add(dog3);

        System.out.println("hashSet is: " + hashSet.size() +
        " It is Empty: " + hashSet.isEmpty());
        System.out.println("hashSet contains dog3: " + hashSet.contains(dog3));
        System.out.println("hashSet is not sorted collection: ");
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            String o = (String)iterator.next();
            System.out.print(o + " ");
        }
        hashSet.remove(dog1);
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
    }
}
