import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertThrows;




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
        assertEquals(1000, savingsAccount.getCredit());
        savingsAccount.calculateSold();
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
        SavingsAccount savingsAccount = new SavingsAccount(0.2);

        savingsAccount.credit(900);

        assertThrows(IllegalArgumentException.class, () -> 
            savingsAccount.debit(1200)
        );

        assertEquals(900, savingsAccount.getSold()); 
    }
    
    @Test
    public void testInterestCalculation() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);

        savingsAccount.credit(1000); 
        savingsAccount.calculateSold();
        
        assertEquals(1200, savingsAccount.getSold(), 0.01);
    }
    
    @Test
    public void testEcheance() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);

        savingsAccount.credit(1000); 
        savingsAccount.echeance();
        
        assertEquals(1200, savingsAccount.getSold());
    }

    
    
}