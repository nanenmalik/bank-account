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

   /*  private double annualInterest;
   // annualInterest = 0.25;

    public SavingAccount( double balance, double annualInterest) {
        super( balance);
        this.annualInterest = annualInterest;
    }
    
    public void setAnnualInterest( double annualInterest) {
        this.annualInterest = annualInterest;
        annualInterest = 0.25;
    }

     public double getAnnualInterest() {
        return annualInterest;
    }

    public double MonthlyInterestDeposit() {
        double MonthlyInterestDeposit = (getBalance() * annualInterest) / 12;
        return MonthlyInterestDeposit;
    }


    @Override
    public boolean withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Insufficient funds");
            return false;
        } else {
            setBalance(getBalance() - amount);
            return true;
        }
    }
    

    @Override
    public String toString() {
        return "SavingAccount{" +
                "annualInterest=" + annualInterest +
                '}';
    }
}*/

