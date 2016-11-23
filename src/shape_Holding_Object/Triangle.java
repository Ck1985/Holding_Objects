/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package shape_Holding_Object;

import static tk.anonymous11100001.util.Print.print;

public class Triangle extends Shape {
    @Override void draw(){
        print("Triagnle.draw() ");
    }
    @Override void erase(){
        print("Triangle.erase() ");
    }
    void showMessage(){
        print("Triangle.showMessage() ");
    }
    public String toString(){
        return "Triangle";
    }
}
