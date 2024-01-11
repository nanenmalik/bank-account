//Test.java

//NAME      : NURUL NASREEN BINTI ABDUL MALIK
//MATRIC NO : 2217464
//SECTION   : 2
//LECTURER  : TS DR. MUHAMAD SADRY ABU SEMAN

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1000,10);

        int option;
        do {
            System.out.println("Bank Account");
            System.out.println("1. Saving");
            System.out.println("2. Checking");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    handleAccountOperations(savingAccount);
                    break;
                case 2:
                    handleAccountOperations(checkingAccount);
                    break;
                case 3:
                    System.out.println("Exiting ....");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 3);
    }

    private static void handleAccountOperations(Account account) {
        DecimalFormat df = new DecimalFormat("#.##"); // Decimal format with two decimal places
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Return");
            System.out.print("Choose your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Amount: RM ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    if (account instanceof SavingAccount) {
                        ((SavingAccount) account).monthlyInterestDeposit();
                        System.out.println("Monthly interest deposited.");
                    } else {
                        System.out.println("This option is only applicable for Saving Account.");
                    }
                    break;
                case 2:
                    System.out.println("Balance: RM " + df.format(account.getBalance()));
                    break;
                case 3:
                    System.out.print("Amount: RM ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                case 4:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);
    }
}
      
