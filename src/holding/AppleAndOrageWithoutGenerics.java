/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
package holding;
import java.util.*;

class Apple{
    private static long count;
    private final long id = count++;
    public long id(){
        return id;
    }
}
class Orage{

}
public class AppleAndOrageWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args){
        ArrayList apples = new ArrayList();
        for(int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        apples.add(new Orage());
        for(int j = 0; j < apples.size(); j++){
            ((Apple)apples.get(j)).id();
        }
    }
}
