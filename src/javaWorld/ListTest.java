package javaWorld;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/19/2016.
 */
public class ListTest {
    public static void main(String[] args){
        List arrayList = new ArrayList();
        String[] toys = {"Shoe", "Ball", "Frishee"};
        arrayList.addAll(Arrays.asList(toys));
        System.out.println("List has created: (Unsorted)" + arrayList);
        System.out.println("List has size: " + arrayList.size() + " it is Empty: " + arrayList.isEmpty());
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + " ");
        }
        arrayList.remove(0);
        arrayList.clear();
        System.out.println();
        System.out.println(arrayList);
    }
}
