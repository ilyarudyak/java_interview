package complete_reference;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class AbstractDemo {

    public static void main(String args[]) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}

abstract class A {
    abstract void callme();

    // concrete methods are still allowed in abstract classes
    void callmetoo() {
        System.out.println(getClass().getSimpleName() + ": This is a concrete method of class A.");
    }
}

class B extends A {
    void callme() {
        System.out.println(getClass().getSimpleName() + ": B's implementation of callme().");
    }
}
