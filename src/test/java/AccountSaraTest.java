import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;  

public class AccountSaraTest {
	//private Account account;
	
	//Refactoring , mais ça ne marche pas
//	@BeforeEach
//	public void init() {
//		account = new Account();
//	}
	
	
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
		account.credit(20);
		account.debit(10);
		assertEquals(10, account.getDebit());
		
	}
	
	
	@Test 
	public void testAlwaysPositiveCredit() {
		Account account = new Account();
		account.credit(-10);;
		assertEquals(0, account.getCredit());
	}
	
	
	@Test 
	public void testAlwaysPositiveDebit() {
		Account account = new Account();
		account.debit(-10);
		assertEquals(0, account.getDebit());
	}

}
