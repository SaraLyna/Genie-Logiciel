import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private List<SavingsAccount> savingsAccounts;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.savingsAccounts = new ArrayList<>();
    }

    public Account openAccount() {
        Account account = new Account(0);
        accounts.add(account);
        return account;
    }

    public SavingsAccount openSavingsAccount(double interestRate, int number) {
        SavingsAccount savingsAccount = new SavingsAccount(interestRate, number);
        savingsAccounts.add(savingsAccount);
        return savingsAccount;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }
    
    
    public Account getAccountByNumber(int accountNumber) {
        if (accountNumber >= 0 && accountNumber < accounts.size()) {
            return accounts.get(accountNumber);
        }
        throw new IllegalArgumentException("Invalid account number");
    }
    
    public SavingsAccount getSavingsAccountByNumber(int accountNumber) {
        if (accountNumber >= 0 && accountNumber < savingsAccounts.size()) {
            return savingsAccounts.get(accountNumber);
        }
        throw new IllegalArgumentException("Invalid account number");
    }

    
    
    public void creditAccount(int accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);
        account.credit(amount);
    }

    public void debitAccount(int accountNumber, double amount) {
        Account account = getAccountByNumber(accountNumber);
        account.debit(amount);
    }

    public void creditSavingsAccount(int accountNumber, double amount) {
        SavingsAccount savingsAccount = getSavingsAccountByNumber(accountNumber);
        savingsAccount.credit(amount);
    }

    public void debitSavingsAccount(int accountNumber, double amount) {
        SavingsAccount savingsAccount = getSavingsAccountByNumber(accountNumber);
        savingsAccount.debit(amount);
    }
    
    
    public void transferMoney(int sourceAccountNumber, int destinationAccountNumber, double amount) {
        Account sourceAccount = getAccountByNumber(sourceAccountNumber);
        Account destinationAccount = getAccountByNumber(destinationAccountNumber);

        if (sourceAccount instanceof SavingsAccount) {
            ((SavingsAccount) sourceAccount).debit(amount);
        } else {
            sourceAccount.debit(amount);
        }

        destinationAccount.credit(amount);
    }
}