/**
 * TODO:
 * - Implement GUI
 * - Create bank class
 * - Create account type subclasses
 * - Create account comparator methods
 */
public class BankTester {

    public static void main(String[] args){
        BankAccount sv1 = new SavingsAccount("Charlie", 25000);
        BankAccount sv2 = new SavingsAccount("Dave");
        BankAccount cq1 = new ChequingAccount("Bob", 25000);
        BankAccount cq2 = new ChequingAccount("Al");
        BankAccount cq3 = new ChequingAccount("Three", 92000);

        sv1.deposit(25000);
        sv1.withdraw(5000);
        System.out.println(sv1);

        cq1.deposit(25000);
        cq1.withdraw(5000);
        System.out.println(cq2);
    }
}
