package holding;
import holding.stack.*;
/**
 * Created by Anonymous11100001 on 7/2/2016.
 */
public class Example15 {
    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        stack.push('U');
        stack.push('n');
        stack.push('c');
        System.out.print(stack.pop() + " ");
        stack.push('e');
        stack.push('r');
        stack.push('t');
        System.out.print(stack.pop() + " ");
        stack.push('a');
        System.out.print(stack.pop() + " ");
        stack.push('i');
        System.out.print(stack.pop() + " ");
        stack.push('r');
        System.out.print(stack.pop() + " ");
        stack.push('y');
        System.out.print(stack.pop() + " ");
        stack.push(null);
    }
}
