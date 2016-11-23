package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/30/2016.
 */
public class InsertmiddleLinkedList {
    public static void insertMiddle(LinkedList<Integer> linkedList, Integer[] arraySource){
        for(Integer i : arraySource){
            ListIterator<Integer> integerLinkedList = linkedList.listIterator(linkedList.size()/2);
            integerLinkedList.add(i);
            System.out.print(linkedList + " ");
        }
    }
    public static void main(String[] args){
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        LinkedList<Integer> linkedList = new LinkedList<>();
        insertMiddle(linkedList, array);
    }
}
