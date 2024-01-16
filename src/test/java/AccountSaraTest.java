import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountSaraTest {
     private Account account;

	@BeforeEach
	public void init() {
		account = new Account();
	}
	
	
	@Test
	public void testCompte(){
		assertEquals(0, account.getCredit());
		assertEquals(0, account.getDebit());
		
	}
	
	@Test
	public void testCreditIncrease() {
		account.credit(20);
		assertEquals(20, account.getCredit());
	}
	
	@Test
	public void testDebitIncrease() {
		account.debit(10);
		assertEquals(10, account.getDebit());
		
	}
	
	
	@Test 
	public void testAlwaysPositiveCredit() {
		account.credit(-10);
		assertEquals(0, account.getCredit());
	}
	
	
	@Test 
	public void testAlwaysPositiveDebit() {
		account.debit(-10);
		assertEquals(0, account.getDebit());
	}
	
	@Test 
	public void testSoldAccount() {
		account.credit(100);
		account.debit(20);
		account.credit(10);
		assertEquals(90,account.getSold());
		
		
		
	}
	
	@Test
	public void testHistorisationCreditsDebits() {
	        account.credit(200);
	        account.credit(50);
	        account.debit(50);
	        account.debit(100);
	        account.credit(200);

	        List<Double> credits = account.getCreditsHistory();
	        assertEquals(200, credits.get(0), 0.01);
	        assertEquals(50, credits.get(1), 0.01);
	        assertEquals(200, credits.get(2), 0.01);
	        

	        List<Double> debits = account.getDebitsHistory();
	        assertEquals(50, debits.get(0), 0.01);
	        assertEquals(100, debits.get(1), 0.01);
	}
	
	@Test
	public void testCreditZero() {
	    account.credit(0);
	    assertEquals(0, account.getCredit());
	}

	@Test
	public void testDebitZero() {
	    account.debit(0);
	    assertEquals(0, account.getDebit());
	}
	
	@Test
	public void testCreditMontantAutorise() {
	    Account account = new Account();
	    account.credit(50000);
	    account.credit(50000);  
	    account.credit(1000);   // Cette opération doit être ignorée
	    assertEquals(100000, account.getCredit());
	}

	@Test
	public void testDebitMontantAutorise() {
	    Account account = new Account();
	    account.debit(50000);
	    account.debit(50000);  
	    account.debit(1000);   // Cette opération doit être ignorée
	    assertEquals(100000, account.getDebit());
	}

}
