package Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Banca Transilvania");
        bank.addBranch("RFN");
        bank.addBranch("Piata Marasti");
        bank.addCustomer("RFN","TikiMiki",1000.0);
        bank.addCustomer("Piata Marasti","TikiAnki",2000.0);
        bank.addCustomerTransaction("RFN","TikiMiki", 500.0);
        bank.addCustomerTransaction("Piata Marasti","TikiAnki", 700.0);
        bank.listCustomers("RFN",true);
        bank.listCustomers("Piata Marasti",true);



    }

}

