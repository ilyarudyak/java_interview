package tomek.phone;

import org.junit.Before;
import org.junit.Test;
import tomek.race.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockingTest {

    private Phone mobilePhone;
    private Phone landline;
    private tomek.phone.Client client;

    @Before
    public void setUp() throws Exception {
        mobilePhone = mock(Phone.class);
        landline = mock(Phone.class);
        client = new Client();
    }

    @Test
    public void shouldReturnTrueIfClientHasMobile() {
        when(mobilePhone.isMobile()).thenReturn(true);
        client.addPhone(mobilePhone);
        assertTrue(client.hasMobile());
    }

    @Test
    public void shouldReturnFalseIfClientHasNoMobile() {
        client.addPhone(landline);
        assertFalse(client.hasMobile());
    }
}





















