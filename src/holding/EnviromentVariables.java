package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/17/2016.
 */
public class EnviromentVariables {
    public static void main(String[] args){
        for(Map.Entry entry : System.getenv().entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
