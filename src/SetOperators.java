
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/3/2016.
 */
public class SetOperators {
    public static void main(String[] args){
        String source = "A B C D E F G H I J K L";
        Set<String> set1 = new HashSet<String>();
        String[] sourceArray = source.split(" ");
        Collections.addAll(set1, sourceArray);
        set1.add("M");
        System.out.println("set1.contains(\"H\")" + set1.contains("H"));
        System.out.println("set1.contains(\"N\")" + set1.contains("N"));
        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.remove("H");
        System.out.println(set1);
        System.out.println("set2 in set1: " + set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set1 removeAll set2: " + set1);
        Collections.addAll(set1, "X Y Z".split(" "));
        System.out.println("X Y Z was added to set1: " + set1);
    }
}
