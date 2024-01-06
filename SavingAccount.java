//SavingAccount.java

 class SavingAccount extends Account {

    private double annualInterest;

    public SavingAccount(double init_balance, double annualInterest) {
        super(init_balance);
        this.annualInterest = annualInterest;
    }

    public boolean monthlyInterestDeposit() {
        double monthlyProfit = balance * (annualInterest / 12);
        balance += monthlyProfit;
        return deposit(monthlyProfit);
    }

    @Override
    public boolean withdraw(double amount) {
        if (super.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }
}

 
