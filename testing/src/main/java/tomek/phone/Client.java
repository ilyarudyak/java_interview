package tomek.phone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ilyarudyak on 7/8/16.
 */
public class Client {

    private final List<Phone> phones = new ArrayList<>();

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public boolean hasMobile() {
        for (Phone phone : phones) {
            if (phone.isMobile()) {
                return true;
            }
        }
        return false;
    }
}
