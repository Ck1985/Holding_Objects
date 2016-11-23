package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
class CollectionSequenceEx30 implements Collection<Pet>{
    private Pet[] pets = Pets.createArray(10);
    public Object[] toArray(){
        return this.pets;
    }
    public void clear(){
        if(this.size() != 0){
            for(Pet p : this){
                p = null;
            }
        }
    }
    public <T> T[] toArray(T[] a){
        throw new UnsupportedOperationException();
    }
    public boolean add(Pet p){
        throw new UnsupportedOperationException();
    }
    public boolean removeAll(Collection<?> collection){
        throw new UnsupportedOperationException();
    }
    public boolean retainAll(Collection<?> collection){
        throw new UnsupportedOperationException();
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
    public boolean contains(Object p){
        throw new UnsupportedOperationException();
    }
    public int size(){
        return this.pets.length;
    }
    public boolean isEmpty(){
        return this.size() == 0 ? true : false;
    }
    public boolean containsAll(Collection<?> collection){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(Collection<? extends Pet> collection){
        throw new UnsupportedOperationException();
    }
    public boolean remove(Object object){
        throw new UnsupportedOperationException();
    }
}
public class Example30 {
    public static void main(String[] args){
       CollectionSequenceEx30 nc = new CollectionSequenceEx30();
        InterfaceVSIterator.display(nc);
        InterfaceVSIterator.display(nc.iterator());
    }
}
