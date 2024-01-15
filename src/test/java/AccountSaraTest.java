import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;

import java.util.List;  

public class AccountSaraTest {
//     Account account;
//
//	@BeforeEach
//	public void init() {
//		account = new Account();
//	}
//	Refactoring ne marche pas
	
	@Test
	public void testCompte(){
		Account account = new Account();
		assertEquals(0, account.getCredit());
		assertEquals(0, account.getDebit());
		
	}
	
	@Test
	public void testCreditIncrease() {
		Account account = new Account();
		account.credit(20);
		assertEquals(20, account.getCredit());
	}
	
	@Test
	public void testDebitIncrease() {
		Account account = new Account();
		account.debit(10);
		assertEquals(10, account.getDebit());
		
	}
	
	
	@Test 
	public void testAlwaysPositiveCredit() {
		Account account = new Account();
		account.credit(-10);
		assertEquals(0, account.getCredit());
	}
	
	
	@Test 
	public void testAlwaysPositiveDebit() {
		Account account = new Account();
		account.debit(-10);
		assertEquals(0, account.getDebit());
	}
	
	@Test 
	public void testSoldAccount() {
		Account account = new Account();
		account.credit(100);
		account.debit(20);
		account.credit(10);
		assertEquals(90,account.getSold());
		
		
		
	}
	
	@Test
	public void testHistorisationCreditsDebits() {
	        Account myCompte = new Account();
	        myCompte.credit(200);
	        myCompte.credit(50);
	        myCompte.debit(50);
	        myCompte.debit(100);
	        myCompte.credit(200);

	        List<Double> credits = myCompte.getCreditsHistory();
	        assertEquals(200, credits.get(0), 0.01);
	        assertEquals(50, credits.get(1), 0.01);
	        assertEquals(200, credits.get(2), 0.01);
	        

	        List<Double> debits = myCompte.getDebitsHistory();
	        assertEquals(50, debits.get(0), 0.01);
	        assertEquals(100, debits.get(1), 0.01);
	}

}
