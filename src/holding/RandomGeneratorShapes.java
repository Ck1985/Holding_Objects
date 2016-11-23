package holding;
import java.util.*;
import shape_Holding_Object.*;
/**
 * Created by Anonymous11100001 on 7/18/2016.
 */
public class RandomGeneratorShapes implements Iterable<Shape> {
    private int numElements;
    private Shape[] shapes;
    private Random random = new Random();
    public RandomGeneratorShapes(int numElements){
        this.numElements = numElements;
        shapes = new Shape[this.numElements];
    }
    public Shape generatorShape(){
        int choose = random.nextInt(4);
        switch(choose){
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Polygon();
            default:
                return new Triangle();
        }
    }
    public void fillArray(){
        for(int i = 0; i < this.shapes.length; i++){
            shapes[i] = this.generatorShape();
        }
    }
    public Iterator<Shape> iterator(){
        return new Iterator<Shape>() {
            private int index = 0;
            public boolean hasNext(){
                return this.index < shapes.length;
            }
            public Shape next(){
                return shapes[index++];
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
    public static void main(String[] args){
        RandomGeneratorShapes rgs = new RandomGeneratorShapes(10);
        rgs.fillArray();
        ArrayIsNotIterable.test(rgs);
    }
}
