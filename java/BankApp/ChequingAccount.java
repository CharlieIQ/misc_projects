public class ChequingAccount extends BankAccount {
    // Double representing the interest rate
    private static final double MONTHLY_INTEREST = 0.015;
    // Double representing the withdrawal fee
    private final double WITHDRAW_FEE = 1.00;

    /**
     * Create a chequing account under a name and with a starting amount
     * @param accountHolder Name of account holder
     * @param startingBalance Starting balance of user
     */
    public ChequingAccount(String accountHolder, double startingBalance){
        super(accountHolder, startingBalance);
    }

    /**
     * Create a chequing account under a name and with a starting amount of 0
     * @param accountHolder Name of account holder
     */
    public ChequingAccount(String accountHolder){
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
        return 0;
    }

    /**
     * Override the toString() and give a description of the account
     * @return String describing the account
     */
    @Override
    public String toString(){
        String result;
        result = String.format("Name: %s\nAccount #%d\nBalance: $%.2f\nAccount Type: Chequing\nWithdraw fee: $%.2f\nInterest Rate: %.2f%%", getAccountHolder(), getAccountNumber(), getBalance(), WITHDRAW_FEE, MONTHLY_INTEREST);
        return result;
    }
}
