//1. Model a class with data that enumerates (associates with a number) the first names of three
//friends, classmates or coworkers. Make it so that this name data will be shared among all
//instances of the class.

package ClassesObjectMethods.ex11;

public class People {
    public static final String[] friends = {"Marco","Anna","Giovanni"};

    public String[] getFriends() {
        return People.friends;
    }

    public static void main(String[] args) {
        People people1 = new People();
        System.out.println(people1.getFriends()[0]);
        System.out.println(people1.getFriends()[1]);
        System.out.println(people1.getFriends()[2]);
        System.out.println();

        People people2 = new People();
        System.out.println(people2.getFriends()[0]);
        System.out.println(people2.getFriends()[1]);
        System.out.println(people2.getFriends()[2]);
        System.out.println();

        People people3 = new People();
        System.out.println(people3.getFriends()[0]);
        System.out.println(people3.getFriends()[1]);
        System.out.println(people3.getFriends()[2]);
    }

}
