package org.funky.test.scala

/**
 * Repository of persons.
 */
class PersonRepository {

  private var persons: Set[Person] = Set[Person]()

  /**
   * Adds the given person in the repository.
   * @param person the person to add
   */
  def add(person: Person) {
    persons += person
  }

  /**
   * Finds all the person from the given name. The name is matched against
   * the first name and the last name of all persons defined in the repository.
   * @param name the name of the persons to find
   * @return the persons that have the given name
   */
  def findPersonsByName(name: String): Set[Person] = {
    persons.filter(p => p.firstName == name || p.lastName == name)
  }

  /**
   * Remove the given person from the repository.
   * @param person the person to remove
   */
  def remove(person: Person) {
    persons -= person
  }

}
