
public class Account {
        String accountNumber;
        String accountName;
        double balance;

    public Account(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not Vaild.");
        }
    }

    public void transferTo(Account anotherAccount, double amount) {
        if (balance >= amount) {
            debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Not Vaild .");
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account("001", "Osama", 1000.0);
        Account account2 = new Account("002", "Ahmed", 500.0);

        System.out.println(account1.getAccountName() + "'s balance: " + account1.getBalance());
        System.out.println(account2.getAccountName() + "'s balance: " + account2.getBalance());

        account1.transferTo(account2, 200.0);

        System.out.println(account1.getAccountName() + "'s balance after transfer: " + account1.getBalance());
        System.out.println(account2.getAccountName() + "'s balance after transfer: " + account2.getBalance());
    }
}
