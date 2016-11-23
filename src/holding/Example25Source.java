package holding;

/**
 * Created by Anonymous11100001 on 7/14/2016.
 */
import java.util.*;
import net.mindview.util.*;

public class Example25Source {
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
		System.out.println("Map of word locations: " + m);
	}
}
