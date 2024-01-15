import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public Account openAccount() {
        Account account = new Account();
        accounts.add(account);
        return account;
    }

    public SavingsAccount openSavingsAccount(double interestRate) {
        SavingsAccount savingsAccount = new SavingsAccount(interestRate);
        accounts.add(savingsAccount);
        return savingsAccount;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }
}