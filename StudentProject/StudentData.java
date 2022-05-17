package StudentProject;

public class StudentData {
    private int studentId;
    private String studentFirstName;
    private String studentLastName;

    public StudentData(int studentID, String studentFirstName, String studentLastName) {
        this.studentId = studentID;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
    }

    public int getStudentId() {

        return studentId;
    }

    public String getStudentLastName() {

        return studentLastName;
    }

    public String getStudentFirstName() {

        return studentFirstName;
    }

    public String toString() {

        return studentId + " " + studentFirstName + " " + studentLastName;
    }
}