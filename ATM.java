import java.util.Scanner;

public class ATM {
    private int correctPin;
    private double balance;

    public ATM(int correctPin, double initialBalance) {
        this.correctPin = correctPin;
        this.balance = initialBalance;
    }

    // Method to check PIN with a maximum of 3 attempts
    public boolean authenticate() {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your 4-digit ATM PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == correctPin) {
                System.out.println("PIN verified successfully!\n");
                return true;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts remaining: " + attempts);
            }
        }

        System.out.println("\nToo many incorrect attempts. Your account has been locked.");
        return false;
    }

    // Method to display balance
    public void displayBalance() {
        System.out.printf("Current Balance: ₹%.2f%n", balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Successfully deposited ₹%.2f%n", amount);
            displayBalance();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.printf("Successfully withdrawn ₹%.2f%n", amount);
                displayBalance();
            } else {
                System.out.println("Error: Insufficient balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Main menu simulation
    public static void main(String[] args) {
        // Initialize ATM with PIN 1234 and an initial balance of ₹10,000
        ATM myAtm = new ATM(1234, 10000.0);

        // First step: Check PIN (max 3 attempts)
        if (myAtm.authenticate()) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\n--- ATM Menu ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.print("Choose an option (1-4): ");
                
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        myAtm.displayBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ₹");
                        double depositAmount = scanner.nextDouble();
                        myAtm.deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ₹");
                        double withdrawAmount = scanner.nextDouble();
                        myAtm.withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose between 1 and 4.");
                }
            } while (choice != 4);

            scanner.close();
        }
    }
}