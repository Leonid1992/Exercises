//. How can you ensure that a Customer instance can not be created without a name and an
//initial deposit?

package ClassesObjectMethods.ex9;

public class Customer {
    private String nome;
    private double deposit;

    public Customer(String nome, double deposit) {
        this.nome = nome;
        this.deposit = deposit;
    }
    public String toString(){
        String customer = "il nome dell cliente e : " + this.nome + " ed ha depositato : $ " + this.deposit;
        return customer;
    }
    public static void main(String[] args) {
        Customer customer = new Customer("Anna",22.99);
        System.out.println(customer);
    }
}
