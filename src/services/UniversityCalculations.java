package services;

import custom_exceptions.StudentHasNoSubjectException;
import custom_exceptions.ThereAreNoFacultiesException;
import custom_exceptions.ThereAreNoGroupsOnTheFacultyException;
import custom_exceptions.ThereAreNoStudentsInTheGroupException;
import enum_subjects.Subjects;
import pattern_of_university_structure.FacultyPattern;
import pattern_of_university_structure.GroupPattern;
import pattern_of_university_structure.StudentPattern;
import pattern_of_university_structure.UniversityPattern;

import java.util.ArrayList;
import java.util.List;

public class UniversityCalculations {

    public static double findAvgMarkOfAStudent(StudentPattern studentPattern) throws StudentHasNoSubjectException {
        int markSum = 0;
        int amountOfMarks = 0;
        List<Integer> marks = new ArrayList<>(studentPattern.getDiaryOfAStudent().values());
        if (marks.size() > 1) {
            for (Integer markCalculator : marks) {
                markSum += markCalculator;
                amountOfMarks++;
            }
        } else {
            throw new StudentHasNoSubjectException("Student has no subject");
        }
        return (double) markSum / amountOfMarks;
    }

    public static double findAvgMarkAccordingToCertainFacultyGroupSubject(FacultyPattern facultyPattern, String studentsGroup, Subjects subjects) throws ThereAreNoStudentsInTheGroupException, ThereAreNoGroupsOnTheFacultyException {
        int markSum = 0;
        int numberOfStudentsWithRequiredMark = 0;
        List<GroupPattern> groupsOnTheFaculty = facultyPattern.getGroupsOnTheFaculty();
        if (groupsOnTheFaculty.size() != 0) {
            GroupPattern requiredGroup = groupsOnTheFaculty.stream().
                    filter(expectedGroup -> expectedGroup.getNumber().equals(studentsGroup)).
                    findAny().orElseThrow(IllegalArgumentException::new);
            if (requiredGroup.getStudentInTheGroup().size() != 0) {
                for (StudentPattern studentFromTheGroup : requiredGroup.getStudentInTheGroup()) {
                    if (studentFromTheGroup.getDiaryOfAStudent().containsKey(subjects) && studentFromTheGroup.getDiaryOfAStudent().get(subjects) != null) {
                        numberOfStudentsWithRequiredMark++;
                        markSum += studentFromTheGroup.getDiaryOfAStudent().get(subjects);
                    }
                }
            } else {
                throw new ThereAreNoStudentsInTheGroupException("The group is empty");
            }
        } else {
            throw new ThereAreNoGroupsOnTheFacultyException("Check the list of the groups in faculty");
        }
        return (double) markSum / numberOfStudentsWithRequiredMark;
    }

    public static double findAvgMarkForTheWholeUniversity (UniversityPattern universityPattern, Subjects subjects) throws ThereAreNoStudentsInTheGroupException, ThereAreNoGroupsOnTheFacultyException, ThereAreNoFacultiesException {
        int markSum = 0;
        int numberOfGroups = 0;
        List<FacultyPattern> facultiesOfTheUniversity =universityPattern.getFacultiesInTheUniversity();
        if (facultiesOfTheUniversity.size() != 0) {
            for (FacultyPattern providedFaculties : facultiesOfTheUniversity) {
                for (GroupPattern providedGroups : providedFaculties.getGroupsOnTheFaculty()) {
                    for (StudentPattern studentsInTheGroups : providedGroups.getStudentInTheGroup()) {
                        if (studentsInTheGroups.getDiaryOfAStudent().containsKey(subjects)) {
                          markSum += studentsInTheGroups.getDiaryOfAStudent().get(subjects);
                          numberOfGroups++;
                        }
                    }
                }
            }
        } else {
            throw new ThereAreNoFacultiesException("The faculty / faculties are not provided");
        }
        return (double) markSum / numberOfGroups;
    }
}

