package studentmanagement.interfaces;

import studentmanagement.exception.InvalidStudentDataException;
import studentmanagement.model.Student;

public interface DatabaseOperations {

    void insert(Student s)
            throws InvalidStudentDataException;

    void update(Student s);

    void delete(String rollNo);

    Student fetch(String rollNo);

    default void log(String msg) {
        System.out.println("LOG: " + msg);
    }
}