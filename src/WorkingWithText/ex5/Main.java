//. Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
//same format, can you write code that can parse and print out:
//1. The building number: 12345
//2. The Street: “Big St.”
//3. City: “Alphabet City”
//4. State: “CA”
//5. Postal Code: 90210

package WorkingWithText.ex5;


public class Main {
    public static void main(String[] args) {
        String indirizzo = "12345 Big St., Alphabet City, CA 90210";


        String building = indirizzo.split(" ")[0];
        System.out.println(building);
        String street = street(indirizzo);
        System.out.println(street);
        String city = indirizzo.split(",")[1].strip();
        System.out.println(city);
        String state = indirizzo.split(",")[2].strip().split(" ")[0];
        System.out.println(state);
        String code = indirizzo.split(",")[2].strip().split(" ")[1];
        System.out.println(code);
    }
    public static String street(String indirizzo){
        int firstSpace = indirizzo.indexOf(" ");
        int firstComa = indirizzo.indexOf(",");
        String street = indirizzo.substring(firstSpace +1, firstComa);
        return street;
    }
}
