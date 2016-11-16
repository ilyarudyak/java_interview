package complete_reference.java8;

/**
 * Created by ilyarudyak on 11/17/16.
 */
public class MyIFImp implements MyIF {
    // Only getNumber() defined by MyIF needs to be implemented.
    // getString() can be allowed to default.
    public int getNumber() {
        return 100;
    }
}
