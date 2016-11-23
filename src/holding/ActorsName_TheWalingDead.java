package holding;
import java.util.*;
import static tk.anonymous11100001.util.Print.*;
/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
class GeneratorName{
    private int key = 0;
    private String next(){
        switch(key){
            default:
            case 0:
                key++;
                return "Noman Reedus";
            case 1:
                key++;
                return "Lauren Cohan";
            case 2:
                key++;
                return "Andrew Lincoln";
            case 3:
                key++;
                return "Steven Eyun";
            case 4:
                key++;
                return "Chandler Rick";
            case 5:
                key++;
                return "Melisa McBridge";
            case 6:
                key++;
                return "Emily Kiney";
            case 7:
                key++;
                return "Emma Bell";
            case 8:
                key = 0;
                return "Emma Watsin";
        }
    }
    public void fillArray(String[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = next();
        }
    }
    public Collection fillCollection(Collection<String> collection, int n){
        for(int i = 0; i < n; i++){
            collection.add(next());
        }
        return collection;
    }
}
public class ActorsName_TheWalingDead {
    public static void main(String[] args){
        GeneratorName generatorName = new GeneratorName();
        String[] myArray = new String[15];
        generatorName.fillArray(myArray);
        for(String name : myArray){
            System.out.print(name + " ");
        }
        print(generatorName.fillCollection(new ArrayList<>(), 9));
        print(generatorName.fillCollection(new LinkedList<>(), 10));
        print(generatorName.fillCollection(new HashSet<>(), 11));
        print(generatorName.fillCollection(new LinkedHashSet<>(), 12));
        print(generatorName.fillCollection(new TreeSet<>(), 13));

    }
}
