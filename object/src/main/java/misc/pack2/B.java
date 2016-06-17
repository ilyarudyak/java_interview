package misc.pack2;

import misc.pack1.A;

/**
 * Created by ilyarudyak on 6/17/16.
 */
public class B extends A {

    public static void main(String args[]){
        B b = new B();

        // accessed outside A using inheritance
        b.msg();

        A a = new A();
        // error: msg() is protected and not available outside package
//        a.msg();
    }
}
