package misc.pack1;

/**
 * Created by ilyarudyak on 6/17/16.
 */
public class D {

    public static void main(String[] args) {

        A a = new A();

        // protected method is *available* inside package
        a.msg();
    }
}
