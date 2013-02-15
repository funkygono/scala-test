package org.funky.test.scala

import org.junit.{Test, Before}
import org.junit.Assert.assertTrue
import java.util

/**
 * Unit test (in Scala) of the group repository.
 */
class GroupRepositoryInScalaTest {

  var repository: GroupRepository = _

  @Before def setUp() {
    repository = new GroupRepository
  }

  @Test def test__Add_And_Find_Group() {
    val admin: Group = Group("Admin", Set(Person("Funky", "Gono")))
    repository.add(admin)
    assertTrue(repository.findGroupsByName("Admin").contains(admin))
  }

}
