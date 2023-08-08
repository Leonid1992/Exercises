//// How can you create a method that can be called without creating an instance of its class?

package ClassesObjectMethods.ex6;

public class Main {
    public static void main(String[] args) {
        Main.method();
    }
    public static void method(){
        System.out.println("Stampa del methodo");
    }
}
