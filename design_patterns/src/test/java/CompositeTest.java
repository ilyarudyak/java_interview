import oreilly.composite.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilyarudyak on 6/26/16.
 */
public class CompositeTest {

    @Test
    public void testConstant() {
        double testValue = 3.0;
        Expression e = new Constant(testValue);
        assertEquals(testValue, e.getValue(), 1E-10);
    }

    @Test
    public void testAdder() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Adder(left, right);
        assertEquals((testValueA+testValueB), e.getValue(), 1E-10);
    }

    @Test
    public void testSubtracter() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Subtracter(left, right);
        assertEquals((testValueA-testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testDivider() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Divider(left, right);
        assertEquals((testValueA/testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testMultiplier() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Multiplier(left, right);
        assertEquals((testValueA*testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testComplexExpression() {
        Expression e =
                new Divider(
                        new Multiplier(
                                new Adder(new Constant(3.0), new Constant(5.0)),
                                new Constant(2.0)
                        ),
                        new Adder(new Constant(2.0), new Constant(6.0))
                );
        // we know this would be equal 12.121212121212...
        assertEquals(2, e.getValue(), 1E-10);
    }
}
