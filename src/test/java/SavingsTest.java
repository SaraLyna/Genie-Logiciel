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

    @Test
    public void testDebitThrowsException() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);

        savingsAccount.credit(900);// crédite 900 + 180 d'interets

        assertThrows(IllegalArgumentException.class, () -> 
            savingsAccount.debit(1200)
        );

        assertEquals(1080, savingsAccount.getSold()); // donc credit total = 1080
    }
    
    @Test
    public void testInterestCalculation() {
        SavingsAccount savingsAccount = new SavingsAccount(0.2);

        savingsAccount.credit(1000); 
        savingsAccount.calculateInterest(); 

  
        assertEquals(1200, savingsAccount.getSold(), 0.01);
    }

    
    
}