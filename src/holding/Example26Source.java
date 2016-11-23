package holding;
import java.util.*;
import net.mindview.util.TextFile;
/**
 * Created by Anonymous11100001 on 7/14/2016.
 */
public class Example26Source {
    public static void main(String[] args) {
        Map<String,ArrayList<Integer>> m =
                new LinkedHashMap<String,ArrayList<Integer>>();
        List<String> words = new LinkedList<String>();
        words.addAll(new TextFile("C:\\Users\\CK1985\\IdeaProjects\\Holding_Objects\\out\\production\\Holding_Objects\\test.txt", "\\W+"));
        System.out.println("Words in file: " + words);
        Iterator itWords = words.iterator();
        int count = 0;
        while(itWords.hasNext()) {
            String s = (String)itWords.next();
            count++;
            if(!m.keySet().contains(s)) {
                ArrayList<Integer> ai =
                        new ArrayList<Integer>();
                ai.add(0, count);
                m.put(s, ai);
            }
            else {
                m.get(s).add(count);
                m.put(s, m.get(s));
            }
        }
        System.out.println();
        System.out.println("Map of word locations: " + m);
        // New Map to hold sorted words, keyed by location:
        Map<Integer,String> replay = new TreeMap<Integer,String>();
        Iterator<Map.Entry<String,ArrayList<Integer>>> it =
                m.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<String,ArrayList<Integer>> me = it.next();
            for(int i = 0; i < me.getValue().size(); i++)
                replay.put(me.getValue().get(i),
                        me.getKey());
        }
        System.out.println();
        System.out.println("TreeMap of ordered locations, words: " + replay);
        System.out.println();
        // Display words in order as TreeMap values():
        System.out.println("Words in original order: " +
                replay.values());
    }
}
