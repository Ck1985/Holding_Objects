package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 6/26/2016.
 */
public class StringListFeature {
    public static void main(String[] args){
        Random random = new Random(47);
        List<String> stringList = new ArrayList<>(Arrays.asList("Beckham", "Rooney", "Mata", "Ronaldo", "Messi", "Neymar",
                "Suaret", "Pique", "Terry", "Lampard", "Pirlo"));
        print("1: stringList: " + stringList);
        stringList.add("Nani");
        print("2: stringList: " + stringList);
        print("3: stringList.contains(Terry): " + stringList.contains("Terry"));
        print("4: stringList.remove(Terry)" + stringList.remove("Terry"));
        print("5: stringList: " + stringList);
        String str = stringList.get(2);
        print("6: str = " + str + " indexOf(2): " + stringList.indexOf(str));
        Object source = new String("Ronaldo");
        print("7: stringList.contains(Ronaldo): " + stringList.contains(source));
        print("8: stringList.remove(source): " + stringList.remove(source));
        print("9: stringList.remove(str): " + stringList.remove(str));
        print("10: stringList: " + stringList);
        stringList.add(new String("Saqiri"));
        print("12: stringList: " + stringList);
        List<String> sub = stringList.subList(1, 5);
        print("13: sub: " + sub);
        Collections.sort(sub);
        print("14:  sort sub: " + sub);
        print("15: stringList: " + stringList);
        Collections.shuffle(sub, random);
        print("16: shuffle sub: " + sub);
        print("17: stringList: " + stringList);
        print("18: stringList.containsAll(sub): " + stringList.containsAll(sub));
        List<String> subTest = Arrays.asList("Neymar", "Messi", "Pirlo", "Beckham", "Suaret");
        print("19: stringList.constainsAll(subtest): " + stringList.containsAll(subTest));
    }
}
