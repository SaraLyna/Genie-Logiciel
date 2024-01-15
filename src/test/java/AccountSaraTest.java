import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class AccountSaraTest {
     private Account account;

	@Before
	public void init() {
		account = new Account();
	}
	
	
	@Test
	public void testCompte(){
		//Account account = new Account();
		assertEquals(0, account.getCredit());
		assertEquals(0, account.getDebit());
		
	}
	
	@Test
	public void testCreditIncrease() {
		//Account account = new Account();
		account.credit(20);
		assertEquals(20, account.getCredit());
	}
	
	@Test
	public void testDebitIncrease() {
		//Account account = new Account();
		account.debit(10);
		assertEquals(10, account.getDebit());
		
	}
	
	
	@Test 
	public void testAlwaysPositiveCredit() {
		//Account account = new Account();
		account.credit(-10);
		assertEquals(0, account.getCredit());
	}
	
	
	@Test 
	public void testAlwaysPositiveDebit() {
		//Account account = new Account();
		account.debit(-10);
		assertEquals(0, account.getDebit());
	}
	
	@Test 
	public void testSoldAccount() {
		//Account account = new Account();
		account.credit(100);
		account.debit(20);
		account.credit(10);
		assertEquals(90,account.getSold());
		
		
		
	}
	
	@Test
	public void testHistorisationCreditsDebits() {
	        //Account account = new Account();
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
	    account.credit(50000);  // Total crédit : 100000
	    account.credit(1000);   // Cette opération doit être ignorée
	    assertEquals(100000, account.getCredit());
	}

	@Test
	public void testDebitMontantAutorise() {
	    Account account = new Account();
	    account.debit(50000);
	    account.debit(50000);  // Total débit : 100000
	    account.debit(1000);   // Cette opération doit être ignorée
	    assertEquals(100000, account.getDebit());
	}

}
