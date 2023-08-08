//Write a method that allows you to pass any number of Strings as parameter inputs without
  //      using an array.

package ClassesObjectMethods.ex5;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.input("Leo","Vilcu");
        main.input("Marco","Verdi");
        main.input("Anna","Bianchi");
    }
  public void input(String...args){};
}
