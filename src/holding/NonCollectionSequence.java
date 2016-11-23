package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
class PetSequence{
    protected Pet[] pets = Pets.createArray(10);
}
public class NonCollectionSequence extends PetSequence implements Iterable<Pet>{
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index = 0;
            public boolean hasNext(){
                return this.index < pets.length;
            }
            public Pet next(){
                return pets[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public Iterable<Pet> reversed(){
        return new Iterable<Pet>(){
            public Iterator<Pet> iterator(){
                return new Iterator<Pet>(){
                    private int indexCurrent = pets.length - 1;
                    public boolean hasNext(){
                        return this.indexCurrent > -1;
                    }
                    public Pet next(){
                        return pets[indexCurrent--];
                    }
                    public void remove(){
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }
    public Iterable<Pet> shufflemix(){
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled);
                return shuffled.iterator();
            }
        };
    }
    public static void main(String[] args){
        NonCollectionSequence nc = new NonCollectionSequence();
        System.out.println("Revesed: ");
        for(Pet p : nc.reversed()){
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.println("mix: ");
        for(Pet p : nc.shufflemix()){
            System.out.print(p + " ");
        }
        System.out.println();
        System.out.println("forward: ");
        for(Pet p : nc){
            System.out.print(p + " ");
        }
    }
}


