package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 6/27/2016.
 */
public class SimpleIteration {
    public static void main(String[] args){
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()){
            Pet pet = it.next();
            System.out.print(pet.id() + ": " + pet + " ");
        }
        System.out.println();
        for(Pet pet : pets){
            System.out.print(pet.id() + ": " + pet + " ");
        }
        System.out.println();
        it = pets.iterator();
        for(int i = 0; i < 6; i++){
            it.next();
            it.remove();
        }
        System.out.println(pets);
        //System.out.println(it.hasNext());
    }
}
