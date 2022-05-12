import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        accounts.add(new BankAccount("Sally", 10001, 3000));
        accounts.add(new BankAccount("Raj", 10002, 4000));
        accounts.add(new BankAccount("Ivan", 10003, 2000));

        System.out.println("Hello there, Welcome to the Bank!");
        System.out.println("Are you an existing customer? (-1 to exit) \n 1. Yes\n 2. No");

        int response = Integer.valueOf(scan.nextLine());

        while(response != -1) {
            if (response == 1) {
                System.out.println("Great! What is your account number?");
                int accountNum = Integer.valueOf(scan.nextLine());

                boolean isAccountHolder = false;
                int index = -1;

                for (int i = 0; i < accounts.size(); i++) {
                    BankAccount acc = accounts.get(i);
                    if (accountNum == acc.getAccountNumber()) {
                        isAccountHolder = true;
                        index = i;
                    }
                }

                if (isAccountHolder) {
                    mainMenu(accounts.get(index));
                } else {
                    System.out.println("Sorry, we couldn't find your account number, try again");
                }


            } else if (response == 2) {
                BankAccount newAccount = new BankAccount();
    
                System.out.println("Let's make an account!");
                System.out.println("What is the name on the account?");
                String responseName = scan.nextLine();
                newAccount.setAccountHolderName(responseName);
    
                double responseAmount = Double.valueOf(scan.nextLine());
                newAccount.setAccountBalance(responseAmount);
                
                accounts.add(newAccount);

                mainMenu(accounts.get(accounts.size() - 1));
    
            } else if (response == -1) {
    
                System.out.println("Good bye!");
                break;
            }

        }
        
    }

    public static void mainMenu(BankAccount acc) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello " + acc.getAccountHolderName());

        System.out.println("Welcome to the main menu, what would you like to do today?");
        System.out.println(" 1. To check account balance \n 2. To make a withdrawal \n 3. To make a deposit \n 4. To make a transfer to another account \n 0. To Exit");

        int response = Integer.valueOf(scan.nextLine());

        while (response != 0) {
            if (response == 1) {
                acc.getAccountBalance();

            } else if (response == 2) {
                double withdrawAmount = Double.valueOf(scan.nextLine());
                acc.withdrawal(withdrawAmount);
                System.out.println("The amount: " + withdrawAmount + " has been taken out.");

            } else if (response == 3) {
                double depositAmount = Double.valueOf(scan.nextLine());
                acc.deposit(depositAmount);
                System.out.println("The amount: " + depositAmount + " has been added to your account.");

            } else if (response == 4) {
                System.out.println("Please enter the account number to transfer to ");
                int accountToTransferTo = Integer.valueOf(scan.nextLine());

                BankAccount toTransferTo = new BankAccount();
                boolean isAccountHolder = false;
                int index = -1;

                for (int i = 0; i < accounts.size(); i++) {
                    BankAccount accs = accounts.get(i);
                    if (accountToTransferTo == accs.getAccountNumber()) {
                        toTransferTo = accs;
                        isAccountHolder = true;
                        index = i;
                    }
                }

                if (isAccountHolder) {
                    System.out.println("How much would you like to transfer ");
                    double transferAmount = Double.valueOf(scan.nextLine());

                    acc.transfer(toTransferTo, transferAmount);
                    System.out.println(acc.getAccountHolderName() + " moved " + transferAmount + " and now has " + acc.getAccountBalance());
                    System.out.println(toTransferTo.getAccountHolderName() + " was given " + transferAmount + " and now has " + toTransferTo.getAccountBalance());
                    break;
                } else {
                    System.out.println("Sorry, we couldn't find your account number, try again");
                }
                break;
            } else if (response == 0) {
                System.out.println("Good-bye!");
                break;
            }
        }
        

    }




}
