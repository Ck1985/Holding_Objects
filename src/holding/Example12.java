package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/29/2016.
 */
public class Example12 {
    public static void ReadandInsertList(Collection<Object> collection1, Collection<Object> collection2){
        Iterator<Object> collect1Iterator = collection1.iterator();
        System.out.println("Collection 1 has elements: ");
        while(collect1Iterator.hasNext()){
            Object objectcollection1 = collect1Iterator.next();
            System.out.print(objectcollection1 + " ");
        }
        System.out.println();
        System.out.println("Now we will copy all elements in List1 to List2; ");
        collection2.addAll(collection1);
        Iterator<Object> collec2Iterator = collection2.iterator();
        while(collec2Iterator.hasNext()){
            Object objectcollection2 = collec2Iterator.next();
            System.out.print(objectcollection2 + " ");
        }
    }
    public static void ReverseList2(List<Object> list1, List<Object> list2){
        ListIterator<Object> list1Iterator = list1.listIterator();
        System.out.println("Collection1  has Elements are; ");
        System.out.println("If you want to read all elements of List in order reverse, the first you have to move curso to the last elements of list: ....");
        while(list1Iterator.hasNext()){
            Object object = list1Iterator.next();
            System.out.print(object + " ");
        }
        System.out.println("And now .....");
        while(list1Iterator.hasPrevious()){
            Object object = list1Iterator.previous();
            list2.add(object);
        }
        System.out.println("Now we will copy all elements of list1 to list2 by order has reversed: ");
        ListIterator<Object> list2Iterator = list2.listIterator();
        while(list2Iterator.hasNext()){
            Object object = list2Iterator.next();
            System.out.print(object + " ");
        }
    }
    public static void main(String[] args){
        Integer[] integerArray = new Integer[]{
                1,2,3,4,5,6,7,8,9
        };
        List<Object> integerList1 = new ArrayList<>(Arrays.asList(integerArray));
        List<Object> integerList2 = new ArrayList<>();
        //ReadandInsertList(integerList1, integerList2);
        System.out.println();
        ReverseList2(integerList1, integerList2);
        System.out.println("Good Boy ^^");
    }
}
