package ClassesObjectMethods.ex8;


import ClassesObjectMethods.ex8.Bank.Bank;
import ClassesObjectMethods.ex8.Bank.Manager;

public class Customer {
    public void accessCaveau(Bank bank){
        //bank.accessCaveau();
    }
    public void accessCaveau(Bank bank, Manager manager){
        manager.accessCaveau(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank();
        Manager manager = new Manager();

        customer.accessCaveau(bank);
        customer.accessCaveau(bank,manager);
    }

}
