package pattern_of_university_structure;

import java.util.ArrayList;
import java.util.List;

public class FacultyPattern {
    private String name;
    private List<GroupPattern> groupsOnTheFaculty;

    public FacultyPattern(String name) {
        this.name = name;
        groupsOnTheFaculty= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GroupPattern> getGroupsOnTheFaculty() {
        return groupsOnTheFaculty;
    }

    public void setGroupsOnTheFaculty(List<GroupPattern> groupsOnTheFaculty) {
        this.groupsOnTheFaculty = groupsOnTheFaculty;
    }

    @Override
    public String toString() {
        return "\n" + "The name of the faculty is = " + name + ", the groups represented in this faculty" + groupsOnTheFaculty;
    }
}
