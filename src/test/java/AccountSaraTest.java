import org.junit.Test;
import static org.junit.Assert.*;  

public class AccountSaraTest {
	
	
	@Test
	public void testCompte (){
		Account myCompte = new Account();
		assertEquals(0, myCompte.getCredit());
		assertEquals(0, myCompte.getDebit());
		
	}
	
	@Test
	public void testCreditIncrease() {
		Account myCompte = new Account();
		myCompte.credit(20);
		assertEquals(20, myCompte.getCredit());
	}
	
	@Test
	public void testDebitIncrease() {
		Account myCompte = new Account();
		myCompte.credit(20);
		myCompte.debit(10);
		assertEquals(10, myCompte.getDebit());
		
	}

}
