package StudentProject;

import java.util.*;

class StudentDetails {
    private static final int ADD_STUDENT = 1;
    private static final int SHOW_STUDENT = 2;
    private static final int SEARCH_STUDENT = 3;
    private static final int REMOVE_STUDENT = 4;
    private static final int UPDATE_STUDENT = 5;

    public static void main(String[] args) {

        List<StudentData> c = new ArrayList<StudentData>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Available menu items: ");
            System.out.println("1: Add student");
            System.out.println("2: Show student");
            System.out.println("3: Search student");
            System.out.println("4: Remove student");
            System.out.println("5: Update student");
            System.out.println("which function do you want to excute? ");
            System.out.print("Menu item: ");
            ch = s.nextInt();

            switch (ch) {
                case ADD_STUDENT:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Please provide the data for the student to store. ");
                    System.out.print("Student id: ");
                    int eno = s.nextInt();
                    System.out.print("First name: ");
                    String StudentFirstName = s1.nextLine();
                    System.out.print("Last name: ");
                    String StudentLastName = s1.nextLine();
                    c.add(new StudentData(eno, StudentFirstName, StudentLastName));
                    break;
                case SHOW_STUDENT:
                    System.out.println("--------------------------------------------------");
                    System.out.printf("%-10s %-15s %-15s", "id", "firstname", "lastname");
                    System.out.println();
                    Iterator<StudentData> i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        System.out.printf("%-10s %-15s %-15s", e.getStudentID(), e.getStudentFirstName(), e.getStudentLastName());
                        System.out.println();
                    }
                    System.out.println("----------------------------");
                    break;
                case SEARCH_STUDENT:
                    boolean found = false;
                    System.out.println("Please give the student id to search? ");
                    System.out.print("Student id:");
                    int StudentId = s.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getStudentID() == StudentId) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case REMOVE_STUDENT:
                    found = false;
                    System.out.print("Enter Empno to Delete :");
                    StudentId = s.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getStudentID() == StudentId) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Successfully...!");
                    }
                    System.out.println("----------------------------");
                    break;
                case UPDATE_STUDENT:
                    found = false;
                    System.out.println("Which student do you want to excute? ");
                    System.out.print("Student id: ");
                    StudentId = s.nextInt();
                    ListIterator<StudentData> li = c.listIterator();
                    while (li.hasNext()) {
                        StudentData e = li.next();
                        if (e.getStudentID() == StudentId) {
                            System.out.println("Please provide the data for the student to update. ");
                            System.out.printf("Student if (%s): ", e.getStudentID());
                            StudentId = s.nextInt();
                            System.out.printf("First name (%s): ", e.getStudentFirstName());
                            StudentFirstName = s1.nextLine();
                            System.out.printf("Last name (%s): ", e.getStudentLastName());
                            StudentLastName = s1.nextLine();
                            System.out.println();
                            li.set(new StudentData(StudentId, StudentFirstName, StudentLastName));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Updated Successfully...!");
                    }
                    break;
            }
        } while (ch != 0);
    }
}