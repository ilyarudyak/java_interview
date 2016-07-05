package misc;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by ilyarudyak on 7/5/16.
 */
@RunWith(value = Parameterized.class)
public class MathUtilsTest {

    private int a;
    private int b;
    private int expected;

    public MathUtilsTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
        });
    }

    @Test @Ignore
    public void testAdd() throws Exception {
        assertEquals(expected, MathUtils.add(a, b));
    }
}