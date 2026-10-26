public class BankAccount {
    private double balance;
    BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public boolean deposit(double amount){
        if (amount <=0){
            return false;
        }
        
        balance+=amount;
        return true;
        
    }
    public boolean withdraw(double amount){
        if (amount <= 0) {
            // throw new IllegalArgumentException("deposit amount cannot be negative");
            return false;
        }
        else if(balance < amount){
            return false;
        }
        else{
            balance-=amount;
            return true;
        }


    }

}
