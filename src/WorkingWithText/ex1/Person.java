//. Model a Person with a first name and last name and ensure that even if the first name is
//entered all lowercase, it will be stored all uppercase.

package WorkingWithText.ex1;

public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
