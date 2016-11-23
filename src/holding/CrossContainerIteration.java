package holding;
import java.util.*;
import typeinfo.pets.*;
import tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/27/2016.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> petIterator){
        while(petIterator.hasNext()){
            Pet pet = petIterator.next();
            System.out.print(pet.id() + ": " + pet + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        ArrayList<Pet> pets = Pets.arrayList(20);
        LinkedList<Pet> lkPets = new LinkedList<>(pets);
        HashSet<Pet> hsPets = new HashSet<>(pets);
        TreeSet<Pet> trSet = new TreeSet<>(pets);

        display(pets.iterator());
        display(lkPets.iterator());
        display(hsPets.iterator());
        display(trSet.iterator());
    }
}
