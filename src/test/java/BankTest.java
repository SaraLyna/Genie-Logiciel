import static org.junit.Assert.*;

import org.junit.Test;

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

}
