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

}