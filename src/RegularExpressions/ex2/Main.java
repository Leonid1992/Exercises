// Use capture groups to write a regex that could match: Abracadabra or Agracadagra
package RegularExpressions.ex2;

public class Main {
    public static void main(String[] args) {
        String regex ="A[bg]racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));
    }
}
