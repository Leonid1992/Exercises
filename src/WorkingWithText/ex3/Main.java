// How can you make sure when people enter text into a program, there are no unintended
//spaces at the beginning or end of the text?

package WorkingWithText.ex3;


import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("inserisci il tuo nome");
        Scanner scanner = new Scanner(System.in);
        String stringa = scanner.nextLine().trim();
        System.out.printf(stringa);
    }
}
