public class BankAccount {
    public int accountNumber = 0;
    public int bankBalance = 0;

    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.bankBalance = initialBalance;
        System.out.printf("The Bank Account %d has been created.", this.accountNumber);
    }

    public int deposit(int amount) {
        return this.bankBalance += amount;
    }
    public int withdraw(int amount) {
        return this.bankBalance -= amount;
    }
    public void checkBalance() {
        System.out.println();
        System.out.printf("The balance in Bank Account is %d", this.bankBalance);
        System.out.println();
    }
}





