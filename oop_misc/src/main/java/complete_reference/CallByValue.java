package complete_reference;

/**
 * Created by ilyarudyak on 6/22/16.
 */

public class CallByValue {

    static class Test {
        void meth(int i, int j) {
            i *= 2;
            j /= 2;
        }
    }

    public static void main(String args[]) {
        Test ob = new CallByValue.Test();
        int a = 15, b = 20;

        System.out.println("a and b before call: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " +
                a + " " + b);
    }
}














