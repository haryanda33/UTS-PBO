public class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor untuk menginisialisasi akun
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter untuk accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter untuk accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter untuk balance
    public double getBalance() {
        return balance;
    }

    // Method untuk menambah saldo
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " credited to account " + accountNumber);
        } else {
            System.out.println("Invalid credit amount.");
        }
    }

    // Method untuk mengurangi saldo
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " debited from account " + accountNumber);
        } else {
            System.out.println("Invalid debit amount or insufficient balance.");
        }
    }

    // Method untuk mentransfer saldo ke akun lain
    public void transferTo(Account anotherAccount, double amount) {
        if (anotherAccount != null && amount > 0 && amount <= balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
            System.out.println(amount + " transferred from account " + this.accountNumber + " to account " + anotherAccount.getAccountNumber());
        } else {
            System.out.println("Invalid transfer amount or insufficient balance.");
        }
    }

    // Method untuk menampilkan informasi akun
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        // Membuat dua akun
        Account acc1 = new Account("12345", "John Doe", 1000.0);
        Account acc2 = new Account("67890", "Jane Smith", 500.0);

        // Menampilkan informasi akun awal
        System.out.println("Initial Account Information:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();

        System.out.println();

        // Menambah saldo ke akun pertama
        acc1.credit(200.0);
        // Mengurangi saldo dari akun pertama
        acc1.debit(100.0);
        // Mentransfer saldo dari akun pertama ke akun kedua
        acc1.transferTo(acc2, 300.0);

        System.out.println();

        // Menampilkan informasi akun setelah transaksi
        System.out.println("Account Information After Transactions:");
        acc1.displayAccountInfo();
        acc2.displayAccountInfo();
    }
}
