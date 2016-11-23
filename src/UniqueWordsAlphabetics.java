/**
 * Created by Anonymous11100001 on 7/3/2016.
 */
import net.mindview.util.TextFile;

import java.util.*;
public class UniqueWordsAlphabetics {
    public static void main(String[] args){
        Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        words.addAll(new TextFile("SetOperators.java", "\\W+"));
        System.out.print(words + " ");
    }
}
