package holding;
import java.util.*;
/**
 * Created by Anonymous11100001 on 7/15/2016.
 */
class Command{
    private String string;
    public Command(String string){
        this.string = string;
    }
    String operation(){
        return this.string;
    }
}
class MyQueue{
    private Queue<Command> queue = new LinkedList<>();
    public MyQueue(){

    }
    public Queue<Command> fillQueue(){
        String[] commands = new String[] {
                "Open file",
                "close file",
                "Read File",
                "Write file",
                "Calculator hash bits"
        };
        for(String command : commands){
            Command commandObject = new Command(command);
            this.queue.offer(commandObject);
        }
        return this.queue;
    }
}
public class Example27 {
    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        Queue<Command> queue = myQueue.fillQueue();
        while(queue.peek() != null){
            System.out.print(queue.remove().operation() + " ");
        }
    }
}
