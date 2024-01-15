import org.junit.Test;
import static org.junit.Assert.*;

public class SavingsTest {

    @Test
    public void testCreationSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount(0.02);// taux d'interets à 2%
        
        assertEquals(0, savingsAccount.getCredit());
        assertEquals(0, savingsAccount.getDebit());
        assertEquals(0, savingsAccount.getSold());
    }
    
    @Test
    public void testCreditAndCalculateSold() {
        SavingsAccount savingsAccount = new SavingsAccount(0.02); 
        
        savingsAccount.credit(1000);
        assertEquals(1020, savingsAccount.getSold(), 0.01);
        savingsAccount.calculateSold();
        assertEquals(1040.4, savingsAccount.getSold(), 0.01);
    }

}