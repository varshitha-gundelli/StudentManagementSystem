package studentmanagement.service;

import studentmanagement.exception.InvalidStudentDataException;
import studentmanagement.interfaces.DatabaseOperations;
import studentmanagement.model.Address;
import studentmanagement.model.Student;

public class StudentManager implements DatabaseOperations {

    private static int studentCount = 0;

    public static final String COLLEGE_NAME = "SRITW";

    // Method Overloading
    public void insert(
            String name,
            int age,
            String rollNo,
            String dept,
            Address address)
            throws InvalidStudentDataException {

        insert(
            new Student(
                name,
                age,
                rollNo,
                dept,
                address
            )
        );
    }

    @Override
    public void insert(Student s)
            throws InvalidStudentDataException {

        if (s == null) {

            throw new InvalidStudentDataException(
                "Invalid student data"
            );
        }

        studentCount++;

        log("Inserted student: " + s);
    }

    @Override
    public void update(Student s) {

        log("Updated student: " + s);
    }

    @Override
    public void delete(String rollNo) {

        log(
            "Deleted student with RollNo: "
            + rollNo
        );
    }

    @Override
    public Student fetch(String rollNo) {

        return new Student(
            "Dummy",
            20,
            rollNo,
            "CSE",
            new Address(
                "Warangal",
                "TG",
                "506001"
            )
        );
    }

    public static int getStudentCount() {

        return studentCount;
    }
}