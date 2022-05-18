package StudentProject;

import java.util.*;

public class StudentDetails {
    private static final int ADD_STUDENT = 1;
    private static final int SHOW_STUDENT = 2;
    private static final int SEARCH_STUDENT = 3;
    private static final int REMOVE_STUDENT = 4;
    private static final int UPDATE_STUDENT = 5;

    public static void main(String[] args) {

        List<StudentData> dataStore = new ArrayList<StudentData>();
        Scanner inputReader = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int MenuNumber;
        do {

            //The main menu started to show options in the project
            System.out.println("Available menu items: ");
            System.out.println("1: Add student");
            System.out.println("2: Show student");
            System.out.println("3: Search student");
            System.out.println("4: Remove student");
            System.out.println("5: Update student");
            System.out.println("which function do you want to excute? ");
            System.out.print("Menu item: ");
            MenuNumber = inputReader.nextInt();
            //The value which you want give into the keyboard and it takes valid number
            // The switch statement it takes the value and its excuted specified number in the above values
            switch (MenuNumber) {
                case ADD_STUDENT:
                    // These case statements its perform add students in the arraylist data structure
                    System.out.println("--------------------------------------------------");
                    System.out.println("Please provide the data for the student to store. ");
                    System.out.print("Student id: ");
                    int studentid = inputReader.nextInt();
                    System.out.print("First name: ");
                    String StudentFirstName = s1.nextLine();
                    System.out.print("Last name: ");
                    String StudentLastName = s1.nextLine();
                    dataStore.add(new StudentData(studentid, StudentFirstName, StudentLastName));
                    break;
                case SHOW_STUDENT:
                    // These case statements its perform show the student in the existing one
                    System.out.println("--------------------------------------------------");
                    System.out.printf("%-10s %-15s %-15s", "id", "firstname", "lastname");
                    System.out.println();
                    Iterator<StudentData> i = dataStore.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        //The below one to perform format of the table in the output of the student values
                        System.out.printf("%-10s %-15s %-15s", e.getStudentId(), e.getStudentFirstName(), e.getStudentLastName());
                        System.out.println();
                    }
                    System.out.println("----------------------------");
                    break;
                case SEARCH_STUDENT:
                    // These case statements its perform search student in the existing records
                    boolean found = false;
                    System.out.println("Please give the student id to search? ");
                    System.out.print("Student id:");
                    int studentsid = inputReader.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = dataStore.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getStudentId() == studentsid) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    //If the id cannot remember means its shows the record not found in the existing records
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case REMOVE_STUDENT:
                    found = false;
                    System.out.print("Enter StdeuntId to Delete Record? ");
                    studentsid = inputReader.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = dataStore.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getStudentId() == studentsid) {
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
                    studentsid = inputReader.nextInt();
                    ListIterator<StudentData> li = dataStore.listIterator();
                    while (li.hasNext()) {
                        StudentData e = li.next();
                        if (e.getStudentId() == studentsid) {
                            System.out.println("Please provide the data for the student to update. ");
                            System.out.printf("Student if (%s): ", e.getStudentId());
                            studentsid = inputReader.nextInt();
                            System.out.printf("First name (%s): ", e.getStudentFirstName());
                            StudentFirstName = s1.nextLine();
                            System.out.printf("Last name (%s): ", e.getStudentLastName());
                            StudentLastName = s1.nextLine();
                            System.out.println();
                            li.set(new StudentData(studentsid, StudentFirstName, StudentLastName));
                            found = true;
                        }
                    }
                    //if not found it gives the record not found in the arraylist
                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    //If found means it gives the successfully updated message
                    else {
                        System.out.println("Record is Updated Successfully...!");
                    }
                    break;
            }
        } while (MenuNumber != 0);
    }
}