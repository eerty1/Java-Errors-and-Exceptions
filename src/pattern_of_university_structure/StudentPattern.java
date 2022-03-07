package pattern_of_university_structure;

import custom_exceptions.StudentsMarkIsOutOfBoundsException;
import enum_subjects.Subjects;

import java.util.HashMap;
import java.util.Map;

public class StudentPattern {
    private String name;
    private Map<Subjects, Integer> diaryOfAStudent;

    public StudentPattern(String name) {
        this.name = name;
        diaryOfAStudent= new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subjects, Integer> getDiaryOfAStudent() {
        return diaryOfAStudent;
    }

    public void setDiaryOfAStudent(Map<Subjects, Integer> diaryOfAStudent) {
        this.diaryOfAStudent = diaryOfAStudent;
    }

    @Override
    public String toString() {
        return "\n" + "name = " + name +
                ", The student has the following subjects and marks" + diaryOfAStudent;
    }

    public static void setMark (StudentPattern studentPattern, Subjects subjects, Integer mark) throws StudentsMarkIsOutOfBoundsException {
        if (studentPattern.getDiaryOfAStudent().containsKey(subjects)) {
            if (mark >= 0 && mark <= 10) {
                studentPattern.getDiaryOfAStudent().put(subjects, mark);
            } else {
                throw new StudentsMarkIsOutOfBoundsException("Mark range 0 - 10 expected");
            }
        }
    }
}
