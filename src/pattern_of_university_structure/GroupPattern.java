package pattern_of_university_structure;

import java.util.ArrayList;
import java.util.List;

public class GroupPattern {
    private String number;
    private List<StudentPattern> studentInTheGroup;

    public GroupPattern(String number) {
        this.number = number;
        studentInTheGroup = new ArrayList<>();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<StudentPattern> getStudentInTheGroup() {
        return studentInTheGroup;
    }

    public void setStudentInTheGroup(List<StudentPattern> studentInTheGroup) {
        this.studentInTheGroup = studentInTheGroup;
    }

    @Override
    public String toString() {
        return "\n" + "The number of the group is = " + number + ", The students studying in this group" + studentInTheGroup;
    }
}
