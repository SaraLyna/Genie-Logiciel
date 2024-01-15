import org.junit.Test;
import static org.junit.Assert.*;

public class SavingsTest {

    @Test
    public void testCreationSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);// taux d'interets à 20%
        
        assertEquals(0, savingsAccount.getCredit());
        assertEquals(0, savingsAccount.getDebit());
        assertEquals(0, savingsAccount.getSold());
    }
    
    @Test
    public void testCreditAndCalculateSold() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2); 
        
        savingsAccount.credit(1000);
        assertEquals(1200, savingsAccount.getCredit());
        savingsAccount.calculateSold();
        assertEquals(1440, savingsAccount.getCredit());
    }
    
//    @Test
//    public void testDebitGreaterThanBalance() {
//        SavingsAccount savingsAccount = new SavingsAccount(0.2);
//        
//        savingsAccount.credit(1000); 
//        savingsAccount.debit(1200);
//        assertEquals(0, savingsAccount.getSold());
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testDebitThrowsException() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);
        
        savingsAccount.credit(1000);
        savingsAccount.debit(1200);
    }
}