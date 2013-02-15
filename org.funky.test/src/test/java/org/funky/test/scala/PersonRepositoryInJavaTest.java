package org.funky.test.scala;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test (in Java) of the person repository.
 */
public class PersonRepositoryInJavaTest {

    private PersonRepository repository;

    @Before
    public void setUp() {
        repository = new PersonRepository();
    }

    @Test
    public void test__Add_And_Find_Person() {
        repository.add(new Person("Funky", "Gono"));
        Assert.assertTrue(repository.findPersonsByName("Gono").contains(new Person("Funky", "Gono")));
    }

}
