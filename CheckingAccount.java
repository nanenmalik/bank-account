//CheckingAccount.java

class CheckingAccount extends Account{

    private double insufficientFee;
    
    public CheckingAccount(double init_balance, double insufficientFee) {
        super(init_balance);
        this.insufficientFee = insufficientFee;
    }

      @Override
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            System.out.println("Overdraft! Insufficient funds.");
            balance -= insufficientFee;
            return false;
        }
    }
}

   

   




  
