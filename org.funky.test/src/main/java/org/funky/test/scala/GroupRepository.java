package org.funky.test.scala;

import java.util.HashSet;
import java.util.Set;

/**
 * Repository of groups.
 */
public class GroupRepository {

    private final Set<Group> groups = new HashSet<Group>();

    /**
     * Adds the given group in the repository.
     * @param group the group to add
     */
    public void add(Group group) {
        groups.add(group);
    }

    /**
     * Finds the groups that have the given name.
     * @param name the name of the groups to find
     * @return the groups
     */
    public Set<Group> findGroupsByName(String name) {
        Set<Group> result = new HashSet<Group>();
        for (Group group : groups) {
            if (group.name().equals(name)) {
                result.add(group);
            }
        }
        return result;
    }

}
