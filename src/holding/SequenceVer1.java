/**
 * Created by Anonymous11100001 on 6/22/2016.
 */
package holding;
import static tk.anonymous11100001.util.Print.*;

interface Selector{
    boolean end();
    Object current();
    void next();
}
public class SequenceVer1 {
    private Object[] items;
    private int countitem = 0;
    private int length;
    public SequenceVer1(int length){
        this.length = length;
        this.items = new Object[this.length];
    }
    public void add(Object object){
        if(this.countitem < this.length){
            items[countitem++] = object;
        }
    }
    class SelectorItem implements Selector{
        private int currentIndex = 0;
        public boolean end(){
            return (this.currentIndex == length);
        }
        public Object current(){
            return items[currentIndex];
        }
        public void next(){
            if(!end()){
                this.currentIndex++;
            }
        }
    }
    public static void main(String[] args){
        SequenceVer1 sequenceVer1 = new SequenceVer1(10);
        for(int i = 0; i < sequenceVer1.items.length; i++){
            sequenceVer1.add(i);
        }
        Selector selectorItem = sequenceVer1.new SelectorItem();
        while(!selectorItem.end()){
            System.out.print(selectorItem.current() + " ");
            selectorItem.next();
        }
    }
}
