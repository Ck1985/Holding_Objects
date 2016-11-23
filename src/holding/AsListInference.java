package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}
public class AsListInference {
    public static void main(String[] args){
        List<Snow> list1 = Arrays.asList(new Powder(), new Crusty(), new Slush());
        List<Snow> list2 = Arrays.asList(new Light(), new Heavy());
        List<Snow> list3 = Arrays.asList();
        Collections.addAll(list3, new Light(), new Heavy());
        List<Snow> list4 = Arrays.<Snow>asList(new Light(), new Heavy());
    }
}
