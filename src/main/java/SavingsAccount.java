//import java.util.*;

public class SavingsAccount extends Account {
    private double interestRate;
    private int number;

    public SavingsAccount(double interestRate, int number) {
        super(number); 
        this.interestRate = interestRate;
        this.number = number;
    }
    
    public double getInterestRate() {
    	return this.interestRate;
    }
    
    
    public int getNumber() {
    	return this.number;
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
