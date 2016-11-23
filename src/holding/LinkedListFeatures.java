package holding;
import java.util.*;
import typeinfo.pets.*;
/**
 * Created by Anonymous11100001 on 6/30/2016.
 */
public class LinkedListFeatures {
    public static void main(String[] args){
        LinkedList<Pet> petLinkedList = new LinkedList<>(Pets.arrayList(5));
        System.out.println(petLinkedList);
        //Identical:
        System.out.println("petLinkedList.getFirst(): " + petLinkedList.getFirst());
        System.out.println("petLinkedList.element(): " + petLinkedList.element());
        //Only differ if List is Empty:
        System.out.println("petLinkedList.peek(): " + petLinkedList.peek());
        //Identical: Return and remove the first elements (head) of List:
        System.out.println("Before remove:" + petLinkedList);
        System.out.println("petLinkedList.remove(): " + petLinkedList.remove());
        System.out.println("peLinkedList: " + petLinkedList);
        System.out.println("petLinkedList.removeFirst(): " + petLinkedList.removeFirst());
        System.out.println("petLinkedList: " + petLinkedList);
        //only differ if List is empty:
        System.out.println("petLinkedList.poll(); " + petLinkedList.poll());
        System.out.println("petLinkedList: " + petLinkedList);
        petLinkedList.addFirst(new Rat());
        System.out.println("petLinkedList.addFirst(): " + petLinkedList);
        petLinkedList.offer(new Hamster());
        System.out.println("petLinkedList.offer(): " + petLinkedList);
        petLinkedList.addLast(Pets.randomPet());
        System.out.println(petLinkedList);
        petLinkedList.removeLast();
        System.out.println(petLinkedList);
    }
}
