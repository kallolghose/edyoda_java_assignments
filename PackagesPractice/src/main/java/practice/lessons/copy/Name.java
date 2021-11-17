package practice.lessons.copy;

public class Name {

    public static final String NAME_CONSTANT = "some_value";

    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void print(){
        System.out.println(String.format("Name : %s %s", firstName, lastName));
    }
}
