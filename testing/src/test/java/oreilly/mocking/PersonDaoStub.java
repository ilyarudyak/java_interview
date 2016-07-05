package oreilly.mocking;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class PersonDaoStub implements PersonDao {

    Person p1 = new Person(0, "First", "Person");
    Person p2 = new Person(1, "Robin", "Williams");
    Person[] people = {p1, p2};

    public List<Person> getAll() {
        return Arrays.asList(people);
    }

    public Person getById(long id) {
        return id < people.length ? people[(int)id] : null;
    }
}
