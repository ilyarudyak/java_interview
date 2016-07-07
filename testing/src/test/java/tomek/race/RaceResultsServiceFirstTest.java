package tomek.race;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ilyarudyak on 7/8/16.
 */
public class RaceResultsServiceFirstTest {

    private RaceResultsService service;

    @Before
    public void setUp() throws Exception {
        service = new RaceResultsService();
    }

    @Test
    public void subscribedClientShouldReceiveMessage() throws Exception {

        Client client = mock(Client.class);
        Message message = mock(Message.class);

        service.addSubscriber(client);
        service.send(message);

        verify(client).receive(message);
    }
}
