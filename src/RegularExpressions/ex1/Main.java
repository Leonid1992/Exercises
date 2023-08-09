//. Write a regex that would match the following words: Dark, bark, Lark
//1. For extra challenge, could you additionally make it match: stark

package RegularExpressions.ex1;

public class Main {
    public static void main(String[] args) {
        String regex = "(st|[DbL])ark";
        System.out.println("Dark : " + "Dark".matches(regex));
        System.out.println("bark : " + "bark".matches(regex));
        System.out.println("Lark : " + "Lark".matches(regex));
        System.out.println("stark : " + "stark".matches(regex));
    }
}
