public class ATM {
    private int balance;
    public ATM(int startingMoney){
        balance = startingMoney;
    }

    public ATM(){
        balance = 0;
    }

    public void printBalance(){
        System.out.println("Current Balance: $" + balance);
    }

    public void addMoney(int moneyEntered){
        balance += moneyEntered;
    }

    public void withDrawlMoney(int amount){
        balance -= amount;
    }
}
