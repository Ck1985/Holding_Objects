package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 6/29/2016.
 */
public class Listiterator {
    public static void main(String[] args){
        List<Pet> pets = Pets.arrayList(10);
        ListIterator<Pet> petListIterator = pets.listIterator();
        while(petListIterator.hasNext()){
            Pet pet = petListIterator.next();
            System.out.print(pet + " " + petListIterator.nextIndex() + " " + petListIterator.previousIndex() + " ");
        }
        System.out.println();
        while(petListIterator.hasPrevious()){
            Pet pet = petListIterator.previous();
            System.out.print(pet.id() + " ");
        }
        System.out.println();
        System.out.print(pets);
        System.out.println();
        petListIterator = pets.listIterator(4);
        while(petListIterator.hasNext()){
            petListIterator.next();
            petListIterator.set(Pets.randomPet());
        }
        System.out.println(pets);
    }
}
