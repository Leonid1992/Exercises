/*2. Create an array and initialize it with the days of the week.
        2.1.Use System.out.println() to print:
        2.1.1.The number of items in the array
        2.1.2.The 4th day in the array
*/
package ClassesObjectMethods.ex2;

public class Main {
    public static void main(String[] args) {
         String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("days in array : " +  days.length);
        System.out.println("4th day in array : " + days[4]);

    }
}

