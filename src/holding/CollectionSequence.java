package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/16/2016.
 */
public class CollectionSequence extends AbstractCollection<Pet> {
    private Pet[] pets = Pets.createArray(8);
    public int size(){
        return this.pets.length;
    }
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
    public static void main(String[] args){
        CollectionSequence cs = new CollectionSequence();
        InterfaceVSIterator.display(cs);
        InterfaceVSIterator.display(cs.iterator());
    }
}
