public class Person {
    private final String name;
    private final String lastName;
    private final String gender;
    private final String id;
    private final String pinCode;
    private final String completedSteps;

    public Person(String name, String lastName, String gender, String id, String pinCode, String completedSteps) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.pinCode = pinCode;
        this.completedSteps = completedSteps;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getFullName() {
        return name + " " + lastName;
    }

    public String getCompletedSteps() {
        return completedSteps;
    }
}
