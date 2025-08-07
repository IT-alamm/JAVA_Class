// // package Encapsulation;
// import java.util.Scanner;

// class BankAccount {
//     // Data Hiding using private access modifier
//     private String customerName;
//     private String accountNumber;
//     private double balance;

//     // Constructor
//     public BankAccount(String customerName, String accountNumber, double initialBalance) {
//         this.customerName = customerName;
//         this.accountNumber = accountNumber;
//         this.balance = initialBalance;
//     }
   

//     // Deposit method
//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("₹" + amount + " deposited successfully.");
//         } else {
//             System.out.println("Invalid amount. Deposit failed.");
//         }
//     }

//     // Withdraw method
//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance) {
//             balance -= amount;
//             System.out.println("₹" + amount + " withdrawn successfully.");
//         } else {
//             System.out.println("Insufficient balance or invalid amount.");
//         }
//     }

//     // Customer enquiry method
//     public void showCustomerDetails() {
//         System.out.println("------ Customer Details ------");
//         System.out.println("Name: " + customerName);
//         System.out.println("Account No.: " + accountNumber);
//         System.out.println("Current Balance: ₹" + balance);
//         System.out.println("------------------------------");
//     }
// }

// public class BankApplication {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

        
//         System.out.print("Enter Customer Name: ");
//         String name = sc.nextLine();
//         System.out.print("Enter Account Number: ");
//         String accNo = sc.nextLine();
//         System.out.print("Enter Initial Balance: ₹");
//         double balance = sc.nextDouble();

//         BankAccount account = new BankAccount(name, accNo, balance);
       

//         int choice;
//         do {
//             System.out.println("\n===== Bank Menu =====");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Customer Enquiry");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");
//             choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter amount to deposit: ");
//                     double depositAmount = sc.nextDouble();
//                     account.deposit(depositAmount);
//                     break;
//                 case 2:
//                     System.out.print("Enter amount to withdraw: ");
//                     double withdrawAmount = sc.nextDouble();
//                     account.withdraw(withdrawAmount);
//                     break;
//                 case 3:
//                     account.showCustomerDetails();
//                     break;
//                 case 4:
//                     System.out.println("Thank you for using the Bank Application!");
//                     break;
//                 default:
//                     System.out.println("Invalid choice! Try again.");
//             }

//         } while (choice != 4);

//         sc.close();
//     }
// }



import java.util.Scanner;

class BankAccount {
    // Data Hiding using private access modifier
    private String customerName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println(" " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println(" " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Customer enquiry
    public void showCustomerDetails() {
        System.out.println("------ Customer Details ------");
        System.out.println("Name: " + getCustomerName());
        System.out.println("Account No.: " + getAccountNumber());
        System.out.println("Current Balance:  " + getBalance());
        System.out.println("------------------------------");
    }
}

public class BankApplicationWithGetSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a new account
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Initial Balance:  ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, accNo, balance);

        int choice;
        do {
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Customer Enquiry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit:  ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw:  ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.showCustomerDetails();
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Application!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}


