package holding;
import java.util.*;
import static net.mindview.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/28/2016.
 */
public class GerbilHopppingVer2 {
    public static void display(Iterator<Gerbil> iterator){
        while(iterator.hasNext()){
            Gerbil gerbil = iterator.next();
            gerbil.hop();
        }
        System.out.println();
    }
    public static void main(String[] args){
        Gerbil[] gerbils = new Gerbil[]{
                new Gerbil(1),
                new Gerbil(2),
                new Gerbil(3),
                new Gerbil(4),
                new Gerbil(5),
                new Gerbil(6)
        };
        LinkedList<Gerbil> gerbilList = new LinkedList<>(Arrays.asList(gerbils));
        Iterator<Gerbil> gerbilIterator = gerbilList.iterator();
        display(gerbilIterator);
    }
}
