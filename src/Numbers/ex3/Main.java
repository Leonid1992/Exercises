/*. Using only what you’ve learned so far in this course, create a class that contains 10
lowercase names and has a method that can be called 10 separate times, each time,
returning the next name. If the method is called “next()”, the first time it’s called, it returns
“name1”, the second time “next()” is called, it returns “name2”, etc.
1. Make the next() method capitalize the first letter of each name as it outputs them.
 */

package Numbers.ex3;

public class Main {

    private String[] persone = {"nome1", "nome2", "nome3", "nome4", "nome5", "nome6", "nome7", "nome8", "nome9", "nome10"};

    private int currentPerson = 0;

    public String prossimoNome(){
        String persona = persone[currentPerson++];
        return persona.substring(0,1).toUpperCase() + persona.substring(1);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());
        System.out.println(main.prossimoNome());

    }
}
