//7. Model a Car, create an instance of it, pass it to System.out.println() so that its properties will
  //      be printed.

package ClassesObjectMethods.ex7;

public class Car {
    String model;
    int year;
    String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }
    public String toString(){
        String car = this.model + ' ' + this.year + ' ' + this.color;
        return car;
    }

    public static void main(String[] args) {
        Car car = new Car("Fiat",2014,"Black");
        System.out.println(car);
    }
}

