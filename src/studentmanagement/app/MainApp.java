package studentmanagement.app;

import studentmanagement.exception.InvalidStudentDataException;
import studentmanagement.model.Address;
import studentmanagement.model.GraduateStudent;
import studentmanagement.service.StudentManager;

public class MainApp {

    public static void main(String[] args) {

        Address addr =
                new Address(
                        "Warangal",
                        "TG",
                        "506001"
                );

        GraduateStudent gs =
                new GraduateStudent(
                        "John",
                        22,
                        "R001",
                        "CSE",
                        addr,
                        "AI Research"
                );

        StudentManager manager =
                new StudentManager();

        try {

            manager.insert(gs);

            gs.participateInSports();

            gs.participateInCulturalEvent();

            System.out.println(
                    "Total Students: "
                    + StudentManager.getStudentCount()
            );

        } catch (InvalidStudentDataException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}