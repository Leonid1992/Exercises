// If someone enters “ alphabet “ (notice the spaces) as input into a method, make that
//method output “alphabeT” instead.

package WorkingWithText.ex4;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        String input = " alphabet ";
        String inputStrip = input.strip();
        System.out.println(inputStrip);
        String firstPart = inputStrip.substring(0, inputStrip.length()-1);
        System.out.println(firstPart);
        Character lastPart = inputStrip.charAt(inputStrip.length()-1);
        System.out.println(lastPart);
        System.out.println(firstPart + lastPart.toString().toUpperCase());

    }
}
