package misc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilyarudyak on 7/5/16.
 */
@RunWith(value = Parameterized.class)
public class MathUtils2Test {

    @Parameterized.Parameter(value = 0)
    public int a;

    @Parameterized.Parameter(value = 1)
    public int b;

    @Parameterized.Parameter(value = 2)
    public int expected;

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

    @Test
    public void testAdd() throws Exception {
        assertEquals(expected, MathUtils.add(a, b));
    }
}
