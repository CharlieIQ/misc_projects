public class BankAccount {
    // Account balance
    protected double balance;
    // Account number
    private final int ACCOUNT_NUMBER;
    // To increment the account number
    private static int nextAccountNumber;
    // Name of account holder

    private String accountHolder;

    /**
     * Create a bank account under a name and account number
     * @param accountHolder Name of account holder
     * @param startingBalance Starting balance
     */
    public BankAccount(String accountHolder, double startingBalance){
        this.accountHolder = accountHolder;
        balance = startingBalance;
        ACCOUNT_NUMBER = nextAccountNumber;
        nextAccountNumber++;
    }

    /**
     * Create a bank account under a name and set balance to 0
     * @param accountHolder Name of account holder
     */
    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        balance = 0;
        ACCOUNT_NUMBER = nextAccountNumber;
        nextAccountNumber++;
    }

    /**
     * Deposit money to account
     * @param amount Amount of money to add
     */
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    /**
     * Method to take money out of account
     * @param amount Amount to take
     * @return Amount from account
     */
    public double withdraw(double amount){
        if ((balance - amount) > 0){
            balance -= amount;
            return amount;
        }
        return 0.0;
    }

    /**
     * Get current account balance
     * @return Current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Get the account number of an account
     * @return An account's number
     */
    public int getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    /**
     * Getter for the name of the account holder
     * @return The name of the account holder
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Method to check if 2 accounts are the same
     * @param other Other object
     * @return True if accounts are equal false of not
     */
    public boolean equals(Object other){
        // Early return
        if (this == other){
            return true;
        }

        if (!(other instanceof  BankAccount)){
            return false;
        }
        BankAccount otherAccount = (BankAccount) other;

        if (ACCOUNT_NUMBER == otherAccount.ACCOUNT_NUMBER){
            return true;
        }

        return false;
    }

    /**
     * Override the toString() and give a description of the account
     * @return String describing the account
     */
    public String toString(){
        String result;
        result = String.format("Name: %s\nAccount #%d\nBalance: $%.2f", getAccountHolder(), getAccountNumber(), getBalance());
        return result;
    }
}
