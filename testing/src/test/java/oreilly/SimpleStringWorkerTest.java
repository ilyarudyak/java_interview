package oreilly;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class SimpleStringWorkerTest {

    private SimpleStringWorker subject;

    @Before
    public void setUp() throws Exception {
        subject = new SimpleStringWorker();
    }

    @Test
    public void testAppend() throws Exception {
        subject.append("hello");
        assertEquals("hello", subject.toString());
    }
}
