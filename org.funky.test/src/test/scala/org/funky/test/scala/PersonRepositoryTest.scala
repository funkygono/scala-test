package org.funky.test.scala

import org.junit.{Before, Test}
import org.junit.Assert.assertThat
import org.junit.Assert.assertTrue
import org.hamcrest.core.Is.is

/**
 * Unit tests of the PersonRepository.
 */
class PersonRepositoryTest {

  private var repository: PersonRepository = _

  @Before def setUp() {
    repository = new PersonRepository
  }

  @Test def test__Create_And_Find() {
    repository.add(Person("Funky", "Gono"))
    assertThat(repository.findPersonsByName("Funky"), is(Set(Person("Funky", "Gono"))))
  }

  @Test def test__Find_On_Empty_Repository_Returns_Nothing() {
    assertTrue(repository.findPersonsByName("Funky") isEmpty)
  }

}
