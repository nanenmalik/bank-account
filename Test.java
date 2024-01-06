//Test.java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount(1000.00, 0.0025);
        CheckingAccount checkingAccount = new CheckingAccount(1000.00, 10);

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
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 3);
    }

    private static void handleAccountOperations(Account account) {
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
                    break;
                    case 2:
                    System.out.println("Balance: RM " + account.getBalance());
                    break;
                    case 3:
                    System.out.print("Amount: RM ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 4);
    }
}
       /*  Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        System.out.println("\tBank Account"); 
        System.out.println("\n1.Saving");
        System.out.println("2. Checking");
        System.out.println("3. Exit");
        System.out.print("\nChoose your option: ");


        switch (option==1) {
            case "1":
                System.out.println("1. Deposit"); 
                double depositAmount = scanner.nextDouble();
                if(account.deposit(depositAmount)) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }   
                break;
            case "2":
                 System.out.println("2. Balance");

                if(account.getBalance() > 0.0) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }
                break;
            case "3":
                System.out.println("3. Withdraw");
                if(account.withdraw(withdrawAmount)) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }
                break;
            case "4":
                System.out.println("4. Return");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        switch (option==2) {
            case "1":
                System.out.println("1. Deposit"); 
                double depositAmount = scanner.nextDouble();
                if(account.deposit(depositAmount)) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }   
                break;
            case "2":
                 System.out.println("2. Balance");

                if(account.getBalance() > 0.0) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }
                break;
            case "3":
                System.out.println("3. Withdraw");
                if(account.withdraw(withdrawAmount)) {
                    System.out.printf("Balance: $%.2f%n", account.getBalance());
                }
                break;
            case "4":
                System.out.println("4. Return");
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
    
}*/