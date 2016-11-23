package holding;
import java.lang.reflect.Array;
import java.util.*;
import net.mindview.util.TextFile;
/**
 * Created by Anonymous11100001 on 7/14/2016.
 */
public class Example25_26 {
    public static void main(String[] args){
        List<String> fileSource = new LinkedList<>(new TextFile("C:\\Users\\CK1985\\IdeaProjects\\Holding_Objects\\out\\production\\Holding_Objects\\test.txt", "\\W+"));
        System.out.println(fileSource);
        Map<String, ArrayList<Integer>> map = new LinkedHashMap<String, ArrayList<Integer>>();
        Set<String> keySet = new LinkedHashSet<>();
        int countPosition = 0;
        Iterator<String> fileSourceIterator = fileSource.iterator();
        while(fileSourceIterator.hasNext()){
            String word = fileSourceIterator.next();
            if(!keySet.contains(word)){
                keySet.add(word);
                countPosition++;
                ArrayList<Integer> arrayList = new ArrayList<Integer>();
                arrayList.add(countPosition);
                map.put(word, arrayList);
            }else{
                countPosition++;
                ArrayList<Integer> getArrayListEntry = map.get(word);
                getArrayListEntry.add(countPosition);
            }
        }
        System.out.println(map);

        Set<Integer> key = new TreeSet<>();
        Map<Integer, String> originalFile = new TreeMap<>();
        Set<Map.Entry<String, ArrayList<Integer>>> entries = map.entrySet();
        Iterator<Map.Entry<String, ArrayList<Integer>>> entryIterator = entries.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<String, ArrayList<Integer>> entry = entryIterator.next();
            ArrayList<Integer> valueEntry = entry.getValue();
            for(Integer i : valueEntry){
                key.add(i);
                originalFile.put(i, entry.getKey());
            }
        }
        System.out.println(key);
        System.out.println(originalFile);
        List<String> originalList = new ArrayList<>();
        Set<Map.Entry<Integer, String>> set1 = originalFile.entrySet();
        Iterator<Map.Entry<Integer, String>> set1Iterator = set1.iterator();
        while(set1Iterator.hasNext()){
            Map.Entry<Integer, String> set1Entry = set1Iterator.next();
            originalList.add(set1Entry.getValue());
        }
        System.out.println(originalList);
    }
}
