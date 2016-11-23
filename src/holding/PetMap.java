package holding;
import java.util.*;
import typeinfo.pets.*;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 7/5/2016.
 */
public class PetMap {
    public static void main(String[] args){
        Map<String, Pet> petMap = new HashMap<>();
        petMap.put("My Cat", new Cat());
        petMap.put("My Dog", new Dog());
        petMap.put("My Hamster", new Hamster());
        print(petMap);
        Pet dog = petMap.get("My Dog");
        print(dog);
        print("petMap.ContainsKey(My Cat):" + petMap.containsKey("My Cat"));
        print("petMap.containsValue(Hamster): " + petMap.containsValue(new Hamster()));
        print(petMap.containsValue(dog));
    }
}
