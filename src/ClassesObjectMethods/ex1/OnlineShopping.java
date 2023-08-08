/*Create a new Java project and try modeling a domain you’re comfortable with. It could be
        something like: Sports, Business, Mathematics, Online Shopping, etc. For example, if you
        modeled online shopping, you might create classes to represent: Customer, Product, Order,
        etc. These classes would likely have properties and you may think of a few methods that
        might make sense for them too. There is no example code for this
*/

package ClassesObjectMethods.ex1;

public class OnlineShopping {
    public static void main(String[] args) {
        Product product = new Product(1,29.99," Watch");
        Customer customer = new Customer(10, "Leo", "Vilcu", "leo@gmail.com");
        Order order = new Order(10,product,customer,4);

        System.out.println("Product:" + product.getName());
        System.out.println("price per unit:$ " + product.getPrice() );
        System.out.println("Quantity : " + order.getQuantity());
        System.out.println("Total price : " + order.totalPrice());
    }

}
