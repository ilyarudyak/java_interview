package complete_reference;

import java.util.Arrays;

/**
 * Created by ilyarudyak on 6/23/16.
 */
public class PassArray {

    public static void vaTestOld(int v[]) {
        System.out.println("Number of args: " + v.length +
                " Contents: " + Arrays.toString(v));

    }

    public static void vaTestOldNew(int ... v) {
        System.out.println("Number of args: " + v.length +
                " Contents: " + Arrays.toString(v));

    }

    public static void main(String args[])
    {
        // Notice how an array must be created to
        // hold the arguments.
        int n1[] = { 10 };
        int n2[] = { 1, 2, 3 };
        int n3[] = { };

        vaTestOld(n1); // 1 arg
        vaTestOld(n2); // 3 args
        vaTestOld(n3); // no args

        System.out.println();
        // we still can pass an array
        vaTestOldNew(n1); // 1 arg
        vaTestOldNew(10); // 1 arg
        vaTestOldNew(1, 2, 3); // 3 args
        vaTestOldNew(); // no args
    }
}
