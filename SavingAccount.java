//SavingAccount.java

//NAME      : NURUL NASREEN BINTI ABDUL MALIK
//MATRIC NO : 2217464
//SECTION   : 2
//LECTURER  : TS DR. MUHAMAD SADRY ABU SEMAN

 import java.text.DecimalFormat;

class SavingAccount extends Account {

    private static final double annualInterest = 0.0025;

    public SavingAccount(double init_balance) {
        super(init_balance);
        
    }
    
    public boolean monthlyInterestDeposit() {
        double interest = balance * ( annualInterest / 12 );
        return deposit(interest);
    }

    @Override
    public boolean withdraw(double amount) {
        DecimalFormat df = new DecimalFormat("#.##"); // Decimal format with two decimal places
        if (super.withdraw(amount)) {
            System.out.println("Withdrawal successful.");
            return true;
        } else {
            balance -= amount;
            System.out.println("Balance: RM " + df.format(balance));
            return false;
        }
    }
}

 
