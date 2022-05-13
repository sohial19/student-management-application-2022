import java.util.*;
import java.util.List;

class StudentData {
    private int sno;
    private String sfname;
    private String slname;

    StudentData(int sno, String sfname, String slname) {
        this.sno = sno;
        this.sfname = sfname;
        this.slname = slname;
    }

    public int getSno() {
        return sno;
    }

    public String getSlname() {
        return slname;
    }

    public String getSfname() {
        return sfname;
    }

    public String toString() {
        return sno + " " + sfname + " " + slname;
    }
}

class StudentDetails {
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
                case 1:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Please provide the data for the student to store. ");
                    System.out.print("Student id: ");
                    int sno = s.nextInt();
                    System.out.print("First name: ");
                    String sfname = s1.nextLine();
                    System.out.print("Last name: ");
                    String slname = s1.nextLine();

                    c.add(new StudentData(sno, sfname, slname));
                    break;
                case 2:
                    System.out.println("--------------------------------------------------");
                    System.out.println("Id fname lname");
                    Iterator<StudentData> i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Please give the student id to search? ");
                    System.out.print("Student id:");
                    int sno1 = s.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getSno() == sno1) {
                            System.out.println(e);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found");
                    }
                    System.out.println("--------------------------------------------------");
                    break;

                case 4:
                    found = false;
                    System.out.println("Please provide student id? ");
                    System.out.print("Student id: ");
                    sno1 = s.nextInt();
                    System.out.println("--------------------------------------------------");
                    i = c.iterator();
                    while (i.hasNext()) {
                        StudentData e = i.next();
                        if (e.getSno() == sno1) {
                            i.remove();
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Record Not Found");
                    } else {
                        System.out.println("Record is Deleted Successfully...!");
                    }

                    System.out.println("--------------------------------------------------");
                    break;
                case 5:
                    found = false;
                    System.out.println("Which student do you want to excute? ");
                    System.out.print("Student id: ");
                    sno1 = s.nextInt();

                    ListIterator<StudentData> li = c.listIterator();
                    while (li.hasNext()) {
                        StudentData e = li.next();
                        if (e.getSno() == sno1) {
                            System.out.println("Please provide the data for the student to update. ");
                            System.out.print("First name: ");
                            sfname = s1.nextLine();
                            System.out.print("Last name: ");
                            slname = s1.nextLine();
                            li.set(new StudentData(sno1, sfname, slname));
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

