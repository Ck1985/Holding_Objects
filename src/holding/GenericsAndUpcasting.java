package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
class GrannySmith extends Apple{}
class Gala extends Apple{}
class Fuji extends Apple{}
class GraenBurn extends Apple{}
public class GenericsAndUpcasting {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new GraenBurn());

        for(Apple a : apples){
            System.out.print(a + " ");
        }
    }
}
