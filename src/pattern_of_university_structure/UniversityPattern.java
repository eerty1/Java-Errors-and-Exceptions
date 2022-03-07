package pattern_of_university_structure;

import java.util.ArrayList;
import java.util.List;

public class UniversityPattern {
    private String name;
    private List<FacultyPattern> facultiesInTheUniversity;

    public UniversityPattern(String name) {
        this.name = name;
        facultiesInTheUniversity= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FacultyPattern> getFacultiesInTheUniversity() {
        return facultiesInTheUniversity;
    }

    public void setFacultiesInTheUniversity(List<FacultyPattern> facultiesInTheUniversity) {
        this.facultiesInTheUniversity = facultiesInTheUniversity;
    }

    @Override
    public String toString() {
        return "The name of the university is = " + name  +
                ", the faculties represented in the university" + facultiesInTheUniversity;
    }
}
