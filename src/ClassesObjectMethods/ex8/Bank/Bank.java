//. Model a Bank with the ability to access the vault. Model a BankManager and a Customer
//too. Ensure the Customer can not access the Bank’s vault directly but the BankManager
//can.

package ClassesObjectMethods.ex8.Bank;

public class Bank {
    protected void accessCaveau(){
        System.out.println("welcome to Caveau");
    }
}
