package complete_reference;

import java.util.Arrays;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class VarArgs4 {

    static void vaTest(int ... v) {
        System.out.println( "vaTest(Integer ...): " +
                "Number of args: " + v.length +
                " Contents: " + Arrays.toString(v)
        );
    }

    static void vaTest(boolean ... v) {
        System.out.println( "vaTest(boolean ...) " +
                "Number of args: " + v.length +
                " Contents: " + Arrays.toString(v)
        );
    }


    public static void main(String args[])
    {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

//        vaTest(); // Error: Ambiguous!
    }
}
