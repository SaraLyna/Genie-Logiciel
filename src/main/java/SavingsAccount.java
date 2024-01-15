import java.util.*;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super(); 
        this.interestRate = interestRate;
    }
    
    public double getInterestRate() {
    	return this.interestRate;
    }
    
    @Override
    public void debit(double amount) {
        if (amount > 0 && amount <= getSold()) {
            super.debit(amount);
        }else {
            throw new IllegalArgumentException("Le montant du débit est supérieur au solde.");
        }    
    }
    
    
    public void calculateInterest() {
    	double balance = getCredit() - getDebit();
    	double interest = balance * interestRate;
    	super.credit(interest);
    }
    
    public void echeance() {
        calculateInterest(); 
    }

    
    
}
