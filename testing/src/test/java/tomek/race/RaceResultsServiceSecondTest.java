package tomek.race;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class RaceResultsServiceSecondTest {

    private RaceResultsService service;
    private Message message;
    private Client clientA;
    private Client clientB;
    private Client clientC;

    @Before
    public void setUp() throws Exception {
        service = new RaceResultsService();
        message = mock(Message.class);
        clientA = mock(Client.class);
        clientB = mock(Client.class);
        clientC = mock(Client.class);
    }

    @Test
    public void subscribedClientShouldReceiveMessage() throws Exception {

        service.addSubscriber(clientA);
        service.send(message);

        verify(clientA).receive(message);
    }

    @Test
    public void allSubscribedClientsShouldReceiveMessages() throws Exception {

        service.addSubscriber(clientA);
        service.addSubscriber(clientB);

        service.send(message);

        verify(clientA).receive(message);
        verify(clientB).receive(message);

    }

    @Test
    public void notSubscribedClientShouldNotReceiveMessage() throws Exception {
        verify(clientC, never()).receive(message);
    }

    @Test
    public void shouldSendOnlyOneMessageToMultiSubscriber() {
        service.addSubscriber(clientA);
        service.addSubscriber(clientA);
        service.send(message);

        // same as below - times(1) is the default
        verify(clientA, times(1)).receive(message);
//        verify(clientA).receive(message);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveMessages() {
        service.addSubscriber(clientA);
        service.removeSubscriber(clientA);
        service.send(message);

        verify(clientA, never()).receive(message);
    }
}















