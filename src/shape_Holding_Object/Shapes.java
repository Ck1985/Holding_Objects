/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package shape_Holding_Object;
public class Shapes {
    private static RandomGeneratorShape gen = new RandomGeneratorShape();
    public static void main(String[] args){
        Shape[] shapes = new Shape[10];
        for(int i = 0; i < shapes.length; i++){
            shapes[i] = gen.generatorShape();
        }
        for(Shape shp : shapes){
            shp.draw();
            shp.showMessage();
        }
    }
}

