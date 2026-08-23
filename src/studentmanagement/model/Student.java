package studentmanagement.model;

public class Student extends Person {

    private String rollNo;
    private String dept;
    private Address address;

    // Inner Class
    class Marks {

        int subject1;
        int subject2;

        public Marks(int s1, int s2) {
            subject1 = s1;
            subject2 = s2;
        }

        public int total() {
            return subject1 + subject2;
        }
    }

    // Constructor
    public Student(
            String name,
            int age,
            String rollNo,
            String dept,
            Address address) {

        super(name, age);

        this.rollNo = rollNo;
        this.dept = dept;
        this.address = address;
    }

    // Copy Constructor
    public Student(Student s) {

        super(
            s.getName(),
            s.getAge()
        );

        this.rollNo = s.rollNo;
        this.dept = s.dept;
        this.address = s.address;
    }

    // Method Overriding
    @Override
    public String getDetails() {

        return "Student: " + getName()
                + ", Age: " + getAge()
                + ", RollNo: " + rollNo
                + ", Dept: " + dept
                + ", Address: " + address;
    }

    @Override
    public String toString() {

        return getDetails();
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;

        return rollNo.equals(s.rollNo);
    }
}