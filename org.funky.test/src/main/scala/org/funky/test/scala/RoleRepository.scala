package org.funky.test.scala

/**
 * Repository of roles.
 */
class RoleRepository() {
  private var roles: Set[Role] = Set[Role]()

  def add(role: Role) {
    roles += role
  }

  def findRoleByName(name: String) = roles.find(role => role.getName == name)

}
