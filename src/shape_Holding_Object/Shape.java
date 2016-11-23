/**
 * Created by Anonymous11100001 on 5/19/2016.
 */
package shape_Holding_Object;

import static tk.anonymous11100001.util.Print.print;

public abstract class Shape {
    void draw(){

    }
    void erase(){

    }
    void showMessage(){
        print("Shape.showMessage() ");
    }
    abstract public String toString();
}

