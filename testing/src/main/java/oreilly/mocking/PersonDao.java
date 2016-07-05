package oreilly.mocking;

import java.util.List;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public interface PersonDao {

    public List<Person> getAll();

    public Person getById(long id);
}
