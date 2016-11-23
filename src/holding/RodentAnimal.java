package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;

/**
 * Created by Anonymous11100001 on 6/28/2016.
 */
class Rodent{
    protected String name;
    protected int id;
    public Rodent(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void eat(){
        print("Rodent eats everythings");
    }
    public void living()
    {
        print("Rodent living everywhere");
    }
    public String toString(){
        return "Name: " + this.name + " id: " + this.id;
    }
}
class MouseOwn extends Rodent{
    public MouseOwn(String name, int id){
        super(name, id);
        this.name = name;
        this.id = id;
    }
    public void eat(){
        print("MouseOwneats dirty");
    }
    public void living(){
        print("MouseOwnis living in the house");
    }
}
class Gerbil2 extends Rodent{
    public Gerbil2(String name, int id){
        super(name, id);
        this.name = name;
        this.id = id;
    }
    public void eat(){
        print("Gerbil eats friurs");
    }
    public void living(){
        print("Gerbil is living in the forest");
    }
}
class HamsterOwn extends Rodent{
    public HamsterOwn(String name, int id){
        super(name, id);
        this.name = name;
        this.id = id;
    }
    public void eat(){
        print("HamsterOwneats shit");
    }
    public void living(){
        print("Gerbil is living with people");
    }
}
public class RodentAnimal {
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[]{
                new MouseOwn("Mouse1", 1),
                new MouseOwn("Mouse2", 2),
                new MouseOwn("Mouse3", 3),
                new Gerbil2("Gerbul1", 1),
                new Gerbil2("Gerbil2", 2),
                new HamsterOwn("Hamster1", 1),
                new HamsterOwn("Hamster2", 2),
                new HamsterOwn("Hamster3", 3)
        };
        List<Rodent> rodentsList = new ArrayList<>(Arrays.asList(rodents));
        Iterator<Rodent> rodentIterator = rodentsList.iterator();
        while(rodentIterator.hasNext()){
            Rodent rodent = rodentIterator.next();
            print(rodent);
        }
    }
}
