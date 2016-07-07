package tomek.car;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MockitoVerificationTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = mock(Car.class);
    }

    @Test
    public void testVerification() throws Exception {
        car.driveTo("Monaco Monte-Carlo");
        verify(car).driveTo("Monaco Monte-Carlo");

        // these 2 calls returns ERROR
//        verify(car).driveTo("Monaco");
//        verify(car).needsFuel();
    }
}
