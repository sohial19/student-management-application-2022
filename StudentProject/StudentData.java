package StudentProject;

class StudentData {
    private int StudentID;
    private String StudentFirstName;
    private String StudentLastName;

    StudentData(int StudentID, String StudentFirstName, String StudentLastName) {
        this.StudentID = StudentID;
        this.StudentFirstName = StudentFirstName;
        this.StudentLastName = StudentLastName;
    }

    public int getStudentID() {

        return StudentID;
    }

    public String getStudentLastName() {

        return StudentLastName;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public String toString() {
        return StudentID + " " + StudentFirstName + " " + StudentLastName;
    }
}