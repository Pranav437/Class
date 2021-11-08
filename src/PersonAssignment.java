public class PersonAssignment {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public PersonAssignment(String firstName, String lastName, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
    }

    public String getfullName() {
        String fullName;
        fullName = firstName + " " +lastName;
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String changeAddress(String address) {
        return address;
    }
}
