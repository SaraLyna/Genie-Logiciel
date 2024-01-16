import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
	        SavingsAccount savingsAccount = bank.openSavingsAccount(0.2); 

	        assertNotNull(savingsAccount);
	        assertEquals(0, savingsAccount.getCredit());
	        assertEquals(0, savingsAccount.getDebit());
	        assertEquals(0.2, savingsAccount.getInterestRate(), 0.01);
	    }

}
