package holding;
import holding.stack.*;
import java.util.Stack;
/**
 * Created by Anonymous11100001 on 7/2/2016.
 */
public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        String[] source = "cong hoa xa hoi chu nghia viet nam".split(" ");
        for(String s : source){
            stack.push(s);
        }
        while(!stack.empty()){
            String getString = stack.pop();
            System.out.print(getString + " ");
        }

        holding.stack.Stack<String> stack2 = new holding.stack.Stack<>();
        //String[] source = "cong hoa xa hoi chu nghia viet nam".split(" ");
        for(String s : source){
            stack2.push(s);
        }
        while(!stack2.empty()){
            String getString = stack2.pop();
            System.out.print(getString + " ");
        }
    }
}
