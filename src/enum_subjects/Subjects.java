package enum_subjects;

public enum Subjects {
    ENGLISH("English"),
    GERMAN("German"),
    TRANSLATION("Translation"),
    MATH("Math"),
    CODING("Coding"),
    TECHNICAL_DRAWING("Technical drawing");

    private final String nameOfTheSubject;

    Subjects(String nameOfTheSubject) {
        this.nameOfTheSubject = nameOfTheSubject;
    }

    public String getNameOfTheSubject() {
        return nameOfTheSubject;
    }
}
