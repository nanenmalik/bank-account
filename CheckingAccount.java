//CheckingAccount.java

class CheckingAccount extends Account{

    private double insufficientFee;
    //double overdraftFee = 10.00;
    public CheckingAccount(double init_balance, double insufficientFee) {
        super(init_balance);
        this.insufficientFee = insufficientFee;
    }

   /*  public void overdraftFee(double withdrawAmount) {
        if(withdrawAmount > balance) {
            balance = balance - overdraftFee;
        }
    }*/

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

   

   




    /*double overdraftFee = 10.00;

    private double insufficientFee;

    public CheckingAccount( double balance, double insufficientFee) {
        super(balance);
        this.insufficientFee = insufficientFee;
    }

    public overdraftFee() {
        if(withdrawAmount > balance) {
            balance = balance - overdraftFee;
        }
    }


    @Override
    public boolean withdraw (double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            setBalance(getBalance() - amount);
            return true;
        }
        if (amount > getBalance()) {
            super.withdraw(insufficientFee);
        }
        super.withdraw(amount);
    }


}*/