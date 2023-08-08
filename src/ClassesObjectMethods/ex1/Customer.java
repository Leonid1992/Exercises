package ClassesObjectMethods.ex1;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String email;

    public Customer(int customerId, String firstName, String lastName, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    public void info(){
        System.out.println("Customer ID" + customerId);
        System.out.println("FirstName" + firstName);
        System.out.println("LastName" + lastName);
        System.out.println("Email" + email);
    }
}
