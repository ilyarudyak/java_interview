package liang;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * Created by ilyarudyak on 6/16/16.
 */
public class GenBinSearchTest {

    private Integer[] a = new Integer[100];

    @Before
    public void setUp() throws Exception {
        Random r = new Random();
        r.setSeed(0);
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        Arrays.sort(a);
    }

    @Test
    public void testBinarySearch() throws Exception {

        for (int i = 0; i < a.length; i++) {
            assertEquals(i, GenBinSearch.binarySearch(a, a[i]));
        }


    }
}