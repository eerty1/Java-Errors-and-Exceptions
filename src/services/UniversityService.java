package services;

import custom_exceptions.StudentsMarkIsOutOfBoundsException;
import enum_subjects.Subjects;
import pattern_of_university_structure.FacultyPattern;
import pattern_of_university_structure.GroupPattern;
import pattern_of_university_structure.StudentPattern;
import pattern_of_university_structure.UniversityPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniversityService {
    public UniversityPattern minskUniversity = new UniversityPattern("Minsk University");
    public FacultyPattern FIC = new FacultyPattern("FIC");
    public FacultyPattern FITY = new FacultyPattern("FITY");
    public GroupPattern group3101 = new GroupPattern("310.1");
    public GroupPattern group1234 = new GroupPattern("123.4");
    public GroupPattern group2345 = new GroupPattern("234.5");
    public GroupPattern group3456 = new GroupPattern("345.6");
    public StudentPattern studentNikita = new StudentPattern("Nikita");
    public StudentPattern studentVeronika = new StudentPattern("Veronika");
    public StudentPattern studentViktoria = new StudentPattern("Viktoria");
    public StudentPattern studentDina = new StudentPattern("Dina");
    public StudentPattern studentSavva = new StudentPattern("Savva");
    public StudentPattern studentArtem = new StudentPattern("Artem");
    public StudentPattern studentAlexei = new StudentPattern("Alexei");
    public  StudentPattern studentPavel = new StudentPattern("Pavel");
    public Map<Subjects, Integer> listOfSubjectsForFIC = new HashMap<>();
    public Map<Subjects, Integer> listOfSubjectsForFITY = new HashMap<>();

    public void giveFICListOfSubjects () {
        listOfSubjectsForFIC.put(Subjects.ENGLISH, null);
        listOfSubjectsForFIC.put(Subjects.GERMAN, null);
        listOfSubjectsForFIC.put(Subjects.TRANSLATION, null);
    }

    public void giveFITYListOfSubject () {
        listOfSubjectsForFITY.put(Subjects.CODING, null);
        listOfSubjectsForFITY.put(Subjects.MATH, null);
        listOfSubjectsForFITY.put(Subjects.TECHNICAL_DRAWING, null);
    }

    public void createADiaryOfAStudent () {
        studentNikita.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFIC));
        studentVeronika.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFIC));
        studentViktoria.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFIC));
        studentDina.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFIC));
        studentSavva.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFITY));
        studentPavel.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFITY));
        studentArtem.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFITY));
        studentAlexei.setDiaryOfAStudent(new HashMap<>(listOfSubjectsForFITY));
    }

    public void addStudentsToTheGroups () {
        group3101.setStudentInTheGroup(Arrays.asList(studentNikita, studentVeronika));
        group1234.setStudentInTheGroup(Arrays.asList(studentViktoria, studentDina));
        group2345.setStudentInTheGroup(Arrays.asList(studentSavva, studentPavel));
        group3456.setStudentInTheGroup(Arrays.asList(studentArtem, studentAlexei));
    }

    public void addGroupsToTheFaculties () {
        FIC.setGroupsOnTheFaculty(Arrays.asList(group3101, group1234));
        FITY.setGroupsOnTheFaculty(Arrays.asList(group2345, group3456));
    }

    public void addFacultiesToTheUniversity () {
        minskUniversity.setFacultiesInTheUniversity(Arrays.asList(FIC,FITY));
    }

    public void giveStudentsMarks () throws StudentsMarkIsOutOfBoundsException {
        StudentPattern.setMark(studentNikita,Subjects.ENGLISH,9);
        StudentPattern.setMark(studentNikita,Subjects.GERMAN,8);
        StudentPattern.setMark(studentNikita,Subjects.TRANSLATION, 8);

        StudentPattern.setMark(studentVeronika,Subjects.ENGLISH,8);
        StudentPattern.setMark(studentVeronika,Subjects.GERMAN,7);
        StudentPattern.setMark(studentVeronika,Subjects.TRANSLATION, 7);

        StudentPattern.setMark(studentViktoria,Subjects.ENGLISH,9);
        StudentPattern.setMark(studentViktoria,Subjects.GERMAN,6);
        StudentPattern.setMark(studentViktoria,Subjects.TRANSLATION, 7);

        StudentPattern.setMark(studentDina,Subjects.ENGLISH,5);
        StudentPattern.setMark(studentDina,Subjects.GERMAN,8);
        StudentPattern.setMark(studentDina,Subjects.TRANSLATION, 9);

        StudentPattern.setMark(studentAlexei,Subjects.CODING,9);
        StudentPattern.setMark(studentAlexei,Subjects.MATH,8);
        StudentPattern.setMark(studentAlexei,Subjects.TECHNICAL_DRAWING,7);

        StudentPattern.setMark(studentSavva,Subjects.CODING,6);
        StudentPattern.setMark(studentSavva,Subjects.MATH,5);
        StudentPattern.setMark(studentSavva,Subjects.TECHNICAL_DRAWING,7);

        StudentPattern.setMark(studentArtem,Subjects.CODING,6);
        StudentPattern.setMark(studentArtem,Subjects.MATH,8);
        StudentPattern.setMark(studentArtem,Subjects.TECHNICAL_DRAWING,7);

        StudentPattern.setMark(studentPavel,Subjects.CODING,9);
        StudentPattern.setMark(studentPavel,Subjects.MATH,4);
        StudentPattern.setMark(studentPavel,Subjects.TECHNICAL_DRAWING,4);
    }
}
