package oreilly;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class StringBuilderTest {

    private StringBuilder sb;

    @Before
    public void setUp() throws Exception {
        sb = new StringBuilder();

    }

    @Test @Ignore
    public void appendTest() {

        String hello = "hello, my friend!";
        sb.append(hello);
        assertEquals("appendTest error ...", hello, sb.toString());
    }

    @Test @Ignore
    public void sqrtTest() {
        assertEquals("sqrtTest error ...", 1.414213562, Math.sqrt(2), 1E-7);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exceptionTest() {
        sb.insert(-1, "");
    }
}














