
import java.util.*;
import net.mindview.util.TextFile;
/**
 * Created by Anonymous11100001 on 7/3/2016.
 */
public class UniqueWords {
    public static void main(String[] args){
        Set<String> set = new TreeSet<String>(new TextFile("SetOperators.java", "\\W+"));
        System.out.print(set + " ");
    }
}
