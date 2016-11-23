package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/16/2016.
 */
public class InterfaceVSIterator {
    public static void display(Iterator<Pet> iterator){
        while(iterator.hasNext()){
            Pet p = iterator.next();
            System.out.print(p.id() + ": " + p + " ");
        }
        System.out.println();
    }
    public static void display(Collection<Pet> pets){
        for(Pet p : pets){
            System.out.print(p.id() + ": " + p +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        List<Pet> listPet = Pets.arrayList(8);
        Set<Pet> setPet = new HashSet<>(listPet);
        Map<String, Pet> mapPet = new LinkedHashMap<>();
        String namesString = "Ralph, Eric, Robin, Lacey" + "Briney, Sam, Spot, Fluttfy";
        String[] names = namesString.split(", ");
        for(int i = 0; i < names.length; i++){
            mapPet.put(names[i], listPet.get(i));
        }
        display(listPet);
        display(setPet);
        display(listPet.iterator());
        display(setPet.iterator());
        System.out.println(mapPet);
        System.out.println(mapPet.keySet());
        display(mapPet.values());
        display(mapPet.values().iterator());
    }
}
