import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class BankTest {
	
	 @Test
	    public void testEmptyBank() {
	        Bank bank = new Bank();

	        assertTrue(bank.getAccounts().isEmpty());
	    }
	 
	 
	 @Test
	    public void testOpenAccount() {
	        Bank bank = new Bank();
	        Account account = bank.openAccount();

	        assertNotNull(account);
	        assertEquals(0, account.getCredit());
	        assertEquals(0, account.getDebit());
	    }
	 
	 
	 @Test
	    public void testOpenSavingsAccount() {
	        Bank bank = new Bank();
	        SavingsAccount savingsAccount = bank.openSavingsAccount(0.2,0); 

	        assertNotNull(savingsAccount);
	        assertEquals(0, savingsAccount.getCredit());
	        assertEquals(0, savingsAccount.getDebit());
	        assertEquals(0.2, savingsAccount.getInterestRate(), 0.01);
	    }
	 
	 
	 
	 @Test
	    public void testGetAccountByNumber() {
	        Bank bank = new Bank();
	        Account account1 = bank.openAccount();
	        Account account2 = bank.openAccount();

	        assertEquals(account1, bank.getAccountByNumber(0));
	        assertEquals(account2, bank.getAccountByNumber(1));
	    }

	    @Test
	    public void testGetSavingsAccountByNumber() {
	        Bank bank = new Bank();
	        SavingsAccount savingsAccount1 = bank.openSavingsAccount(0.2, 0);
	        SavingsAccount savingsAccount2 = bank.openSavingsAccount(0.3, 1); 


	        assertEquals(savingsAccount1, bank.getSavingsAccountByNumber(0));
	        assertEquals(savingsAccount2, bank.getSavingsAccountByNumber(1));
	    }

	    @Test
	    public void testCreditAccount() {
	        Bank bank = new Bank();
	        Account account = bank.openAccount();

	        bank.creditAccount(account.getNumber(), 100);
	        assertEquals(100, account.getSold());
	    }

	    @Test
	    public void testDebitAccount() {
	        Bank bank = new Bank();
	        Account account = bank.openAccount();
	        
	        bank.creditAccount(account.getNumber(), 200);
	        bank.debitAccount(account.getNumber(), 50);
	        assertEquals(150, account.getSold());
	    }
	    
	    @Test
	    public void testCreditSavingsAccount() {
	        Bank bank = new Bank();
	        SavingsAccount savingsAccount = bank.openSavingsAccount(0.2,0);

	        bank.creditSavingsAccount(savingsAccount.getNumber(), 100);
	        assertEquals(100, savingsAccount.getSold());
	    }

	    @Test
	    public void testDebitSavingsAccount() {
	        Bank bank = new Bank();
	        SavingsAccount savingsAccount = bank.openSavingsAccount(0.2,0);
	        
	        bank.creditSavingsAccount(savingsAccount.getNumber(), 200);
	        bank.debitSavingsAccount(savingsAccount.getNumber(), 50);
	        assertEquals(150, savingsAccount.getSold());
	    }
	    
	    
	    @Test
	    public void testGetAccountByInvalidNumber() {
	        Bank bank = new Bank();
	        bank.openAccount();
	        assertThrows(IllegalArgumentException.class, () -> bank.getAccountByNumber(22));
	        
	    }
	    
	    
	    @Test
	    public void testTransferMoneyBetweenAccounts() {
	        Bank bank = new Bank();
	        Account sourceAccount = bank.openAccount();
	        Account destinationAccount = bank.openAccount();

	        bank.creditAccount(1,200);
	        bank.transferMoney(sourceAccount.getNumber(), destinationAccount.getNumber(), 200);
	        assertEquals(0, sourceAccount.getSold());
	        assertEquals(200, destinationAccount.getSold());
	    }

	    @Test
	    public void testTransferMoneyFromSavingsAccount() {
	        Bank bank = new Bank();
	        SavingsAccount destinationAccount = bank.openSavingsAccount(0.2, 0);
	        Account sourceAccount = bank.openAccount();

	        bank.creditSavingsAccount(0,200);
	        bank.transferMoney(sourceAccount.getNumber(),destinationAccount.getNumber(), 200);
	        assertEquals(0, sourceAccount.getSold());
	        assertEquals(200, destinationAccount.getSold());
	    }

	    @Test
	    public void testTransferMoneyInvalidSourceAccount() {
	        Bank bank = new Bank();
	        Account destinationAccount = bank.openAccount();

	        assertThrows(IllegalArgumentException.class, 
	        		() -> bank.transferMoney(1, destinationAccount.getNumber(), 50));
	    }

	    @Test
	    public void testTransferMoneyInvalidDestinationAccount() {
	        Bank bank = new Bank();
	        Account sourceAccount = bank.openAccount();

	        assertThrows(IllegalArgumentException.class,
	                () -> bank.transferMoney(sourceAccount.getNumber(), 2, 50));
	    }
	    

}
