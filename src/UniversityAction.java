import custom_exceptions.StudentHasNoSubjectException;
import custom_exceptions.StudentsMarkIsOutOfBoundsException;
import custom_exceptions.ThereAreNoFacultiesException;
import custom_exceptions.ThereAreNoGroupsOnTheFacultyException;
import custom_exceptions.ThereAreNoStudentsInTheGroupException;
import enum_subjects.Subjects;
import services.UniversityCalculations;
import services.UniversityService;

public class UniversityAction {
    public static void main(String[] args) {
        try {
            UniversityService universityService = new UniversityService();
            universityService.giveFICListOfSubjects();
            universityService.giveFITYListOfSubject();
            universityService.createADiaryOfAStudent();
            universityService.addStudentsToTheGroups();
            universityService.addGroupsToTheFaculties();
            universityService.addFacultiesToTheUniversity();
            universityService.giveStudentsMarks();
            System.out.println("The university itself: " + universityService.minskUniversity + "\n");
            System.out.println(UniversityCalculations.findAvgMarkOfAStudent(universityService.studentNikita));
            System.out.println(UniversityCalculations.findAvgMarkAccordingToCertainFacultyGroupSubject(universityService.FITY, "234.5", Subjects.TECHNICAL_DRAWING));
            System.out.println(UniversityCalculations.findAvgMarkForTheWholeUniversity(universityService.minskUniversity, Subjects.ENGLISH));
        } catch (ThereAreNoStudentsInTheGroupException | ThereAreNoFacultiesException
                | ThereAreNoGroupsOnTheFacultyException | StudentHasNoSubjectException
                | StudentsMarkIsOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}