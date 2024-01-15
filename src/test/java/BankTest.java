import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	
	 @Test
	    public void testEmptyBank() {
	        Bank bank = new Bank();

	        assertTrue(bank.getAccounts().isEmpty());
	    }

}
