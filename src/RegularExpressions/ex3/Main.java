//. How can you use parentheses in a regex for grouping but without capturing?

package RegularExpressions.ex3;

public class Main {
    public static void main(String[] args) {

        String regex = "A(?:[bg])racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));
    }
}
