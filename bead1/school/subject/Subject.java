package school.subject;

public enum Subject{
    LITERATURE(SubjectType.HUMANITY, 4),
    HISTORY(SubjectType.HUMANITY, 5),
    PHYSICS(SubjectType.SCIENCE, 6),
    CHEMISTRY(SubjectType.SCIENCE, 7);

    private SubjectType subjectType;
    private int startingYear;

    private Subject(SubjectType st, int sy){
        this.subjectType = st;
        this.startingYear = sy;
    }

    public SubjectType getSubjectType(){
        return subjectType;
    }
    public int getStartingYear(){
        return startingYear;
    }
}