public class Main {
    public static void main(String[] args){
        ATM account1 = new ATM();
        ATM account2 = new ATM(5800);

        account1.addMoney(46000);
        account1.printBalance();

        account2.withDrawlMoney(3000);
        account2.printBalance();
    }
}
