package oreilly.mocking;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by ilyarudyak on 7/5/16.
 */
public class PersonDaoTest {

    private PersonDao mockPersonDao;
    private PersonController testSubject;

    @Before
    public void setup() {
        mockPersonDao = Mockito.mock(PersonDao.class);
        testSubject= new PersonController(mockPersonDao);
    }

    Person p1 = new Person(0, "First", "Person");
    Person p2 = new Person(1, "Robin", "Williams");
    Person[] people = {p1, p2};

    @Test
    public void testControllerCallsDaoGetAll() {
        // Condition the Mock
        Mockito.when(mockPersonDao.getAll()).thenReturn(Arrays.asList(people));

        // Now the actual test - we know there's no such person in our fake data.
        boolean a = testSubject.checkIfPersonExists("First", "Person");
        boolean b = testSubject.checkIfPersonExists("Ashlie", "Madison");

        // Test the expectations
        Mockito.verify(mockPersonDao, Mockito.times(2)).getAll();
        // Could also use atLeastOnce(), never(), ...

        // Test the final result
        assertTrue(a);
        assertFalse(b);
    }

    @Test
    public void testControllerCallsDaoGetById() {
        Mockito.when(mockPersonDao.getById(1)).thenReturn(new Person(1, "First", "Person"));
        Person p = testSubject.findPersonById(1);
        Mockito.verify(mockPersonDao, Mockito.times(1)).getById(1);
        assertEquals(p.name(), "First Person");
    }
}



















