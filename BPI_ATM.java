public class BPI_ATM {

    public static void main(String[] args) {

        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        int amount = 2970; 

        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10.");
            return;
        }

        System.out.println("Requested Amount: " + amount);
        atmDispenser.dispense(new Currency(amount));
    }
}