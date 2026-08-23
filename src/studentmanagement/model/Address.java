package studentmanagement.model;

public class Address {

    String city;
    String state;
    String pincode;

    public Address(
            String city,
            String state,
            String pincode) {

        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    @Override
    public String toString() {

        return city + ", "
                + state + " - "
                + pincode;
    }
}