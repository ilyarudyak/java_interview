package tomek.car;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoThrowingExceptionsTest {

    private Car car;

    @Before
    public void setUp() throws Exception {
        car = mock(Car.class);

    }

    @Test(expected = RuntimeException.class)
    public void testDefaultBehaviourOfTestDouble() {
        when(car.needsFuel()).thenThrow(new RuntimeException());
        car.needsFuel();
    }


}
