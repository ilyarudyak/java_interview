package complete_reference;

/**
 * Created by ilyarudyak on 6/13/16.
 */
interface NumericTest {
    boolean test(int n);
}

interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaDemo2 {

    public static void main(String args[])
    {
        // A lambda expression that tests if a number is even.
        NumericTest isEven = (n) -> (n % 2)==0;

        if(isEven.test(10)) System.out.println("10 is even");
        if(!isEven.test(9)) System.out.println("9 is not even");

        // Now, use a lambda expression that tests if a number
        // is non-negative.
        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(1)) System.out.println("1 is non-negative");
        if(!isNonNeg.test(-1)) System.out.println("-1 is negative");

        System.out.println();
        System.out.println();

        // This lambda expression determines if one number is
        // a factor of another.
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");

        if(!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10");
    }

}


