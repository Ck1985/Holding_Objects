/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
package holding;
import java.util.*;

public class AppleAndOrageWithGenerics {
    public static void main(String[] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i = 0; i < 3; i++){
            apples.add(new Apple());
        }
        // !apples.add(new Orage());
        for(int j = 0; j < apples.size(); j++){
            System.out.print(apples.get(j).id() + " ");
        }
        System.out.println();
        for(Apple a : apples){
            System.out.print(a.id() + " ");
        }
    }
}
