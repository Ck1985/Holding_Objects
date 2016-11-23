package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
public class SequenceVer2 {
    private ArrayList<Object> items = new ArrayList<Object>();
    private int countItem = 0;
    class SelectorItem implements Selector{
        private int currentIndex = 0;
        public boolean end(){
            return (this.currentIndex == items.size());
        }
        public Object current(){
            return items.get(currentIndex);
        }
        public void next(){
            if(!end()){
                currentIndex++;
            }
        }
    }
    public static void main(String[] args){
        SequenceVer2 sequenceVer2 = new SequenceVer2();
        for(int i = 0; i < 5; i++){
            sequenceVer2.items.add(i);
        }
        sequenceVer2.items.add("anonymous");
        Selector selector = sequenceVer2.new SelectorItem();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
