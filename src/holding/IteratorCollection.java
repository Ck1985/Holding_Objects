package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/28/2016.
 */
public class IteratorCollection {
    public static void display(Collection<Object> collection){
        Iterator<Object> objectIterator = collection.iterator();
        while(objectIterator.hasNext()){
            Object object = objectIterator.next();
            System.out.print(object + "  ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] arrInt = new Integer[]{1,2,3,4,5,6,7,8,9};
        List<Object> list = Arrays.asList(arrInt);
        ArrayList<Object> arrayList = new ArrayList<>(list);
        LinkedList<Object> linkedList = new LinkedList<>(list);
        HashSet<Object> hashSet = new HashSet<>(list);
        TreeSet<Object> treeSet = new TreeSet<>(list);

        display(list);
        display(arrayList);
        display(linkedList);
        display(hashSet);
        display(treeSet);
    }
}
