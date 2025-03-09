import java.util.*;

class BankAccount{
    double balance;


void withdraw(double amount){
    if (amount <= 0){ 
        System.out.println("invalid amount please enter correct amount.");
    } else if (amount > balance){
        System.out.println("insufficient Balance please enter the correct amount.");
    } else {
        balance = balance - amount;
        System.out.println("withdrawal done successfully! New Balance : Rs. " + balance);
    }
}

void deposit(double amount){
    if (amount < 0){
        System.out.println("invalid amount please enter correct amount.");
    } else {
        balance += amount;
        System.out.println("deposit done successfully! New Balance : Rs. " + balance);
    }
}

void checkBalance(){
    System.out.println("Your current Balance : Rs. " + balance);
}

}

class ATM {
    BankAccount account;
    Scanner sc = new Scanner(System.in);
    int acc_no;
    int pin_no;
    
    ATM (BankAccount account){
        this.account = account;
    }

    void start(){
        System.out.println("PLease enter your 7 digit account number : ");
         acc_no = sc.nextInt();

        System.out.println("please enter your 4 digit pin : ");
         pin_no = sc.nextInt();
    }


     void display_menu(){
     while(true) {
        System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
     }

     }
}

public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    myAccount.balance = 5000;  // Initial balance
    ATM atm = new ATM(myAccount);
    atm.start();
    atm.display_menu();
}
}