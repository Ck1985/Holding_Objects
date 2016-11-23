/**
 * Created by Anonymous11100001 on 6/23/2016.
 */
package holding;
import java.util.*;
import typeinfo.pets.*;
import static tk.anonymous11100001.util.Print.*;

public class ListFeatures {
    public static void main(String[] args)
    {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(10);
        print("1: " + pets);
        Hamster hamster = new Hamster();
        pets.add(hamster);
        print("2: " + pets);
        print("3: pets.contains(hamster) = " + pets.contains(hamster));
        pets.remove(hamster);
        Pet pet = pets.get(3);
        print("4: " + pet + " pets.indexOf(pet) = " + pets.indexOf(pet));
        Pet cymric = new Cymric();
        print("5: pets.indexOf(cymric) = " + pets.indexOf(cymric));
        print("6: "+ pets.remove(cymric));
        print("7: " + pets.remove(pet));
        print("8: " + pets);
        pets.add(4, new Mouse());
        print("9: " + pets);
        List<Pet> sub = pets.subList(1, 4);
        print("subList: " + sub);
        print("10: " + pets.containsAll(sub));
        Collections.sort(sub);
        print("Sorted sub list: " + sub);
        print("11: pets.containsAll(sub) = " + pets.containsAll(sub));
        print(pets);
        Collections.shuffle(sub, random);
        print("Shuffle sub List: " + sub);
        print("12: " + pets.containsAll(sub));
        print(pets);
        List<Pet> copy = new ArrayList<Pet>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        print("sub: " + sub);
        copy.retainAll(sub);
        print("13: copy = " + copy);
        copy = new ArrayList<Pet>(pets);
        copy.remove(2);
        print("14: " + copy);
        copy.removeAll(sub);
        print("15: " + copy);
        //copy.set(2, new Mouse());
        print("16: " + copy);
        print(sub);
        copy.addAll(1, sub);
        print("17: " + copy);
        print("18: " + pets.isEmpty());
        pets.clear();
        print("19: " + pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        print("20: " + pets);
        Object[] o = pets.toArray();
        print("o[3] = " + o[3]);
        Pet[] pa = pets.toArray(new Pet[0]);
        print("21: " + pa[3].id());
    }
}
