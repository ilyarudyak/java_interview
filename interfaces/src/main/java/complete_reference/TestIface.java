package complete_reference;

/**
 * Created by ilyarudyak on 6/20/16.
 */
public class TestIface {
    public static void main(String args[]) {

        Client client = new Client();
        Callback callback = client;
        callback.callback(42);

        // can call only methods defined in interface
//        callback.nonIfaceMeth();
        client.nonIfaceMeth();
    }
}
