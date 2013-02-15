package org.funky.test.scala

import org.junit.{Before, Test}
import org.junit.Assert.assertThat
import org.junit.Assert.assertTrue
import org.hamcrest.core.Is.is

/**
 * Unit tests of the role repository.
 */
class RoleRepositoryTest {

  private var repository: RoleRepository = _

  @Before def setUp() {
    repository = new RoleRepository
  }

  @Test def test__Create_And_Find() {
    repository.add(new Role("Manager"))
    assertThat(repository.findRoleByName("Manager").get, is(new Role("Manager")))
  }

}
