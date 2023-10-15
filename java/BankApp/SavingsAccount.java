public class SavingsAccount extends BankAccount {
    // Value for the monthly interest
    private static final double MONTHLY_INTEREST = 0.1;
    // Value for the withdrawal fee
    private final double WITHDRAW_FEE = 5.00;

    /**
     * Create a savings account under a name and with a starting amount
     * @param accountHolder Name of account holder
     * @param startingBalance Starting balance of user
     */
    public SavingsAccount(String accountHolder, double startingBalance){
        super(accountHolder, startingBalance);
    }

    /**
     * Create a savings account under a name and with a starting amount of 0
     * @param accountHolder Name of account holder
     */
    public SavingsAccount(String accountHolder){
        super(accountHolder);
        balance = 0;
    }

    /**
     * Withdraw method with fee included
     * @param amount Amount to take
     * @return Amount from account
     */
    @Override
    public double withdraw(double amount){
        if (balance - amount > 0){
            balance -= (amount + WITHDRAW_FEE);
            return amount;
        }
        return 0.0;
    }

    /**
     * Override the toString() and give a description of the account
     * @return String describing the account
     */
    @Override
    public String toString(){
        String result;
        result = String.format("Name: %s\nAccount #%d\nBalance: $%.2f\nAccount Type: Savings\nWithdraw fee: $%.2f\nInterest Rate: %.2f%%", getAccountHolder(), getAccountNumber(), getBalance(), WITHDRAW_FEE, MONTHLY_INTEREST);
        return result;
    }
}
