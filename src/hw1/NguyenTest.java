package hw1;

public class NguyenTest {

    String firstName;
    String lastName;
    String year;
    String major;
    String towerId;

    public static void main(String[] args) {

        NguyenTest student = new NguyenTest();
        student.firstName = "Adam";
        student.lastName = "Nguyen";
        student.year = "Fourth year";
        student.major = "Software Engineering";
        student.towerId = "013625768";

        System.out.println("Student's full name and ID number: " + student.firstName +" "+ student.lastName);
        System.out.println("Student's tower ID number: " + student.towerId);
        System.out.println("Student's year: " + student.year);
        System.out.println("Student's major: " + student.major);
    }
}
