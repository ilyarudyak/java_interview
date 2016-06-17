package complete_reference.p1;

/**
 * Created by ilyarudyak on 6/17/16.
 */
public class SamePackage {

    SamePackage() {
        Protection p = new Protection();
        System.out.println("same package constructor");
        System.out.println("n = " + p.n);

//  class only
//  System.out.println("n_pri = " + p.n_pri);

        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
