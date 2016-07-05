package oreilly.mocking;

import java.util.List;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class PersonDummy implements PersonDao {
    public List<Person> getAll() {
        return null;
    }

    public Person getById(long id) {
        return null;
    }
}
