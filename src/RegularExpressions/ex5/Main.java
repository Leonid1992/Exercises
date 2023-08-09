/*. Write a regex that tests whether a String is an email address.
1. Note: Doing this in regex is actually notoriously difficult to comply with ALL the ways an
email address can be written. However, you can just do the simplest form of email
address you can think of, such as: first.last@domain.com
 */

package RegularExpressions.ex5;

public class Main {
    public static void main(String[] args) {
        String email = "Vilcu.leo1@gmail.com";
        String regex = "\\S+@\\w+.(com|net)";
        System.out.println(email.matches(regex));

    }
}
