import org.junit.Test;
import static org.junit.Assert.*;  

public class AccountSaraTest {
	
	
	@Test
	public void testCompte (){
		Account myCompte = new Account();
		assertEquals(0, myCompte.getCredit());
		assertEquals(0, myCompte.getDebit());
		
	}

}
