class app {
	public String accountNumber;
	public String accountHolderName;
	private double balance;

	public app(String accountNumber, String accountHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public void displayBalance() {
		System.out.printf("Account holder: %s%nBalance: %.2f%n", accountHolderName, balance);
	}

	// === MAIN METHOD ADDED HERE ===
	public static void main(String[] args) {
		// 1. Create a new bank account instance
		app account = new app("BAC12345", "Alex Mercer", 1000.00);

		// 2. Display the initial balance
		System.out.println("--- Initial State ---");
		account.displayBalance();

		// 3. Test a deposit
		System.out.println("\n--- Depositing $500.50 ---");
		account.deposit(500.50);
		account.displayBalance();

		// 4. Test a successful withdrawal
		System.out.println("\n--- Withdrawing $200.00 ---");
		boolean success1 = account.withdraw(200.00);
		System.out.println("Withdrawal successful? " + success1);
		account.displayBalance();

		// 5. Test a failed withdrawal (insufficient funds)
		System.out.println("\n--- Attempting to overdraw $2000.00 ---");
		boolean success2 = account.withdraw(2000.00);
		System.out.println("Withdrawal successful? " + success2);
		account.displayBalance();
	}
}
