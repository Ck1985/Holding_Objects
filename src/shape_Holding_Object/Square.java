/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package shape_Holding_Object;

import static tk.anonymous11100001.util.Print.print;

public class Square extends Shape {
    @Override void draw(){
        print("Square.draw() ");
    }
    @Override void erase(){
        print("Square.erase() ");
    }
    void showMessage() {
        print("Square.showMessage() ");
    }
    public String toString(){
        return "Square";
    }
}
