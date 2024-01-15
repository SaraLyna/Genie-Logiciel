import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;




public class SavingsTest {
	private SavingsAccount savingsAccount;

	@Before
	public void init() {
		savingsAccount = new SavingsAccount(0.2);//20% taux d'interets
	}

    @Test
    public void testCreationSavingsAccount() {
  
        assertEquals(0, savingsAccount.getCredit());
        assertEquals(0, savingsAccount.getDebit());
        assertEquals(0, savingsAccount.getSold());
    }
    
    @Test
    public void testCreditAndCalculateSold() {
        
        savingsAccount.credit(1000);
        assertEquals(1000, savingsAccount.getCredit());
        savingsAccount.calculateInterest();
        assertEquals(1200, savingsAccount.getCredit());
    }
    
//    @Test
//    public void testDebitGreaterThanBalance() {
//        SavingsAccount savingsAccount = new SavingsAccount(0.2);
//        
//        savingsAccount.credit(1000); 
//        savingsAccount.debit(1200);
//        assertEquals(0, savingsAccount.getSold());
//    }

    @Test
    public void testDebitThrowsException() {
       
    	savingsAccount.credit(900);

        assertThrows(IllegalArgumentException.class, () -> 
            savingsAccount.debit(1200)
        );

        assertEquals(900, savingsAccount.getSold()); 
    }
    
    @Test
    public void testInterestCalculation() {
  
        savingsAccount.credit(1000); 
        savingsAccount.calculateInterest();
        
        assertEquals(1200, savingsAccount.getSold(), 0.01);
    }
    
    @Test
    public void testEcheance() {
      
        savingsAccount.credit(1000); 
        savingsAccount.echeance();
        
        assertEquals(1200, savingsAccount.getSold());
    }

    
    
}