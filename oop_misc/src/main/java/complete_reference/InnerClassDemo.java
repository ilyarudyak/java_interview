package complete_reference;

/**
 * Created by ilyarudyak on 6/23/16.
 */
class Outer {
    private int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // this is an inner class
    public class Inner {
        int y = 10; // y is local to Inner
        void display() {
            // we have access to outer class members
            System.out.println("display: outer_x = " + outer_x);
        }
    }

//    void showy() {
//        System.out.println(y); // error, y not known here!
//    }
}


public class InnerClassDemo {

    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}

