package holding;
import java.util.*;

/**
 * Created by Anonymous11100001 on 6/21/2016.
 */
class Gerbil{
    private int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        System.out.println("The number of Gerbil[" + this.gerbilNumber + "] is: " + this.gerbilNumber);
        System.out.println("It say: hopping hopping");
    }
    public String toString(){
        return "Gerbil" + this.gerbilNumber;
    }
}
public class GerbilHopping {
    public static void main(String[] args){
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for(int i = 0; i < 5; i++){
            gerbils.add(new Gerbil(i));
        }
        for(int j = 0; j < gerbils.size(); j++){
            gerbils.get(j).hop();
        }
    }
}
