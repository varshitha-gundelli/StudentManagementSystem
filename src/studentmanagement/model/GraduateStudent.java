package studentmanagement.model;

import studentmanagement.interfaces.CulturalActivities;
import studentmanagement.interfaces.SportsActivities;

public class GraduateStudent
        extends Student
        implements SportsActivities, CulturalActivities {

    private String thesisTitle;

    public GraduateStudent(
            String name,
            int age,
            String rollNo,
            String dept,
            Address address,
            String thesisTitle) {

        super(
            name,
            age,
            rollNo,
            dept,
            address
        );

        this.thesisTitle = thesisTitle;
    }

    @Override
    public String getDetails() {

        return super.getDetails()
                + ", Thesis: "
                + thesisTitle;
    }

    @Override
    public void participateInSports() {

        System.out.println(
            getName()
            + " is participating in sports."
        );
    }

    @Override
    public void participateInCulturalEvent() {

        System.out.println(
            getName()
            + " is participating in cultural events."
        );
    }
}