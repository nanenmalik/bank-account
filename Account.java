//Account.java

//NAME      : NURUL NASREEN BINTI ABDUL MALIK
//MATRIC NO : 2217464
//SECTION   : 2
//LECTURER  : TS DR. MUHAMAD SADRY ABU SEMAN

class Account {
        protected double balance;
            
        public Account(double init_balance) {
            this.balance = init_balance;
           
        }
    
        public double getBalance() {
            return balance;
        }
    
        public boolean deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                return true;
            }
            return false;
        }
    
        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
                balance -= amount;  // Deduct the amount even if withdrawal is not successful
                return false;
        }

}
    
