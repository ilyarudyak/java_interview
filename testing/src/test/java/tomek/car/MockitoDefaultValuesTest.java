package tomek.car;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ilyarudyak on 7/7/16.
 */
public class MockitoDefaultValuesTest {

    private Car car = mock(Car.class);

    @Test
    public void testDefaultBehaviourOfTestDouble() {
        assertFalse("new test double should return false as boolean",
                car.needsFuel());
        assertEquals("new test double should return 0.0 as double",
                0.0, car.getEngineTemperature(), 1E-10);

        when(car.needsFuel()).thenReturn(true);
        assertTrue(car.needsFuel());
    }
}
