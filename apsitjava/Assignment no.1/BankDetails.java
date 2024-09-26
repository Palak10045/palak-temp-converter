class Account {
    String customerName;
    int accountNumber;
    double balance;
    String accountType;

    Account(String customerName, int accountNumber, String accountType) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);
    }
}

// Derived class for Current Account
class CurrentAcct extends Account {
    private static final double MIN_BALANCE = 1000.0;
    private static final double SERVICE_CHARGE = 50.0;

    CurrentAcct(String customerName, int accountNumber) {
        super(customerName, accountNumber, "Current");
    }

    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
        } else {
            balance -= SERVICE_CHARGE;
            System.out.println("Insufficient balance or below minimum balance. Service charge applied.");
        }
        displayBalance();
    }
}

// Derived class for Savings Account
class SavingAcct extends Account {
    private static final double INTEREST_RATE = 0.05;

    SavingAcct(String customerName, int accountNumber) {
        super(customerName, accountNumber, "Savings");
    }

    void computeInterest() {
        balance += balance * INTEREST_RATE;
        System.out.println("Interest deposited. Updated balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
        displayBalance();
    }
}

public class BankDetails {
    public static void main(String[] args) {
        CurrentAcct currentAcct = new CurrentAcct("John Doe", 12345);
        currentAcct.deposit(1500.0);
        currentAcct.displayBalance();
        currentAcct.withdraw(500.0);

        SavingAcct savingAcct = new SavingAcct("Jane Doe", 67890);
        savingAcct.deposit(1000.0);
        savingAcct.displayBalance();
        savingAcct.computeInterest();
        savingAcct.withdraw(500.0);
    }
}
