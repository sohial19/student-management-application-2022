public class Student {
    private int numID, year;
    private String firstName, lastName;

    public Student(int numID, String firstName, String lastName) {

        this.numID = numID;
        this.firstName = firstName;
        this.lastName = lastName;

    }


    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
