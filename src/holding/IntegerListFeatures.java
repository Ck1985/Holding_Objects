package holding;
import static net.mindview.util.Print.*;
import java.util.*;
/**
 * Created by Anonymous11100001 on 6/26/2016.
 */
public class IntegerListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        Integer[] array = new Integer[10];
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }
        List<Integer> integerList = new ArrayList<Integer>(Arrays.asList(array));
        print("1: integerList: " + integerList);
        integerList.add(20);
        print("2: integerList: " + integerList);
        print("3: integerList.contain(20): " + integerList.contains(20));
        print("4: integerList.remove(20): " + integerList.remove((Integer) 7));
        print("5: integerList: " + integerList);
        Integer integerWrapper = integerList.get(3);
        print("6: integerWrapper: " + integerWrapper + " integerList.contains(integerWrapper): " + integerList.contains(integerWrapper));
        Object numberInteger = new Integer(8);
        print("7: integerList.indexOf(numberInteger): " + integerList.indexOf(numberInteger));
        print("8: integerList.remove(integerwrapper): " + integerList.remove(integerWrapper));
        print("9: integerList.remove(numberInteger): " + integerList.remove(numberInteger));
        print("10: integerList: " + integerList);
        integerList.add(new Integer(30));
        print("11: integerList: " + integerList);
        List<Integer> sub = integerList.subList(1, 5);
        print("12: sub: " + sub);
        print("13: integerList: " + integerList);
        Collections.sort(sub);
        print("13: sub: " + sub);
        print("14: integerList: " + integerList);
        Collections.shuffle(sub, random);
        print("15: sub:" + sub);
        print("16: integerList: " + integerList);
        print("17: integerList.containsAll(sub):" + integerList.containsAll(sub));
        List<Integer> copyList = new ArrayList<>(integerList);
        sub = Arrays.asList(integerList.get(1), integerList.get(4));
        print("18: copyList: " + copyList);
        print("19: sub: " + sub);
        copyList.retainAll(sub);
        print("20: copyList: " + copyList);
        copyList = new ArrayList<Integer>(integerList);
        print("21: copyList: "+ copyList);
        print("22: copyList.remove(2): " + copyList.remove(2));
        print("23: copyList.remove((Object)20): " + copyList.remove((Integer) 20));
        copyList.removeAll(sub);
        print("24: copyList: " + copyList);
        copyList.set(2, 108);
        print("25: copyList: " + copyList);
        copyList.addAll(2, Arrays.asList(23,24,25,26));
        print("26: copyList: " + copyList);
        print("27: copyList.isEmpty():" + copyList.isEmpty());
        copyList.clear();
        print("28: copyList.isEmpty(): " + copyList.isEmpty());
        Object[] objects = integerList.toArray();
        Integer[] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        print(integerList);
        Integer[] newArray = integerList.toArray(array1);
        for(Integer e : newArray){
            printnb(e + " ");
        }
    }
}
