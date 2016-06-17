package complete_reference.p2;

import complete_reference.p1.Protection;

/**
 * Created by ilyarudyak on 6/17/16.
 */
public class Protection2 extends Protection {

    Protection2() {
        System.out.println("derived other package constructor");

//  class or package only
//  System.out.println("n = " + n);

//  class only
//  System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
