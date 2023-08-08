/*Try creating an array to represent the tic-tac-toe board to the right.
        4.1.How would you access the value in the bottom right square with
        Java code?
*/
package ClassesObjectMethods.ex4;

public class Main {
    public static void main(String[] args) {
        String[][] strings = {
                {"o","x","x"},
                {"x","o","o"},
                {"x","o","o"}
        };
        System.out.println(strings[2][2]);
    }

}
