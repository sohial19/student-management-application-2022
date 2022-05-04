import java.util.Scanner;


public class Menu {
    public static void main(String args[]) {
        getOptions();
    }

    public static void getOptions() {
        Student[] stud = new Student[100];



        Scanner sc = new Scanner(System.in);
        while (true) {
            int select;
            System.out.println("Available menu items");
            System.out.println("1: add student");
            System.out.println("2: update student");
            System.out.println("3: view student");
            System.out.println("4: delete student");
            System.out.println("Which function do you want to excute?");
            System.out.println("Menu item: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    addStud(stud);
                    break;
                case 2:
                    viewStud(stud);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
            }
        }
    }

    public static void addStud(Student[] stud) {
        Scanner sc = new Scanner(System.in);
        int numID;
        String firstName, lastName;


        int i=0;

            System.out.println("Please provide the data for the student to store.");
            System.out.println("Student ID: ");
            numID = sc.nextInt();
            sc.nextLine();
            System.out.println("First Name:");
            firstName = sc.nextLine();
            System.out.println("Last Name:");
            lastName = sc.nextLine();
            stud[i] = new Student(numID, firstName, lastName);




    }

    public static void viewStud(Student[] stud) {
        for (Student element : stud) {
            if (null != element) {
                System.out.println("1. Student ID: " + element.getNumID());
                System.out.println("2. Student Name: " + element.getFirstName());
                System.out.println("3. Student Course: " + element.getLastName());
            }
        }

    }

}
