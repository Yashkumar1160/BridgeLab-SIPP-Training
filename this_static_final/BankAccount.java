class BankAccount {
    static String bankName = "State Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Amit", 101);
        BankAccount b2 = new BankAccount("Neha", 102);
        b1.display();
        b2.display();
        getTotalAccounts();
    }
}
