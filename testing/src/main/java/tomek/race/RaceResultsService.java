package tomek.race;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by ilyarudyak on 7/8/16.
 */
public class RaceResultsService {
    private Collection<Client> clients = new HashSet<Client>();

    public void addSubscriber(Client client) {
        clients.add(client);
    }

    public void send(Message message) {
        for (Client client : clients) {
            client.receive(message);
        }
    }

    public void removeSubscriber(Client client) {
        clients.remove(client);
    }
}
