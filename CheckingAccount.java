//CheckingAccount.java

//NAME      : NURUL NASREEN BINTI ABDUL MALIK
//MATRIC NO : 2217464
//SECTION   : 2
//LECTURER  : TS DR. MUHAMAD SADRY ABU SEMAN

class CheckingAccount extends Account{

    private double insufficientFee;
    
    public CheckingAccount(double init_balance, double insufficientFee) {
        super(init_balance);
        this.insufficientFee = insufficientFee;
    }
    
    // Method to update CheckingAccount's initial balance based on SavingAccount
    public void updateInitialBalance(SavingAccount savingAccount) {
        double savingAccountBalance = savingAccount.getBalance();
        balance += savingAccountBalance;
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

   

   




  
