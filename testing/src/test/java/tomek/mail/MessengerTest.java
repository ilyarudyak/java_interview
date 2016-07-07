package tomek.mail;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MessengerTest {

    private static final String CLIENT_EMAIL_ADDRESS = "dearjohn@gmail.com";
    private static final String MSG_CONTENT = "Hello, dear John!";

    @Test
    public void shouldSendEmail() {

        // this is just a DUMMY
        Template template = mock(Template.class);

        Client client = mock(Client.class);
        when(client.getEmailAddress()).thenReturn(CLIENT_EMAIL_ADDRESS);

        // this is a STUB - it returns predefined value (indirect input)
        TemplateEngine templateEngine = mock(TemplateEngine.class);
        when(templateEngine.prepareMessage(template, client)).thenReturn(MSG_CONTENT);

        // and this is a MOCK - we verify indirect output;
        MailServer mailServer = mock(MailServer.class);

        // this is our SUT; we send message and
        // verify that it is actually sent from mailServer
        Messenger sut = new Messenger(mailServer, templateEngine);
        sut.sendMessage(client, template);
        verify(mailServer).send(CLIENT_EMAIL_ADDRESS, MSG_CONTENT);
    }
}
