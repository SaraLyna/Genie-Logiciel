import java.util.*;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super(); 
        this.interestRate = interestRate;
    }
    
    public void credit(double amount) {
        if (amount > 0) {
            super.credit(amount + amount * interestRate); // Ajoute le montant crédité plus les intérêts
        }
    }
    
    @Override
    public void debit(double amount) {
        if (amount > 0 && amount <= getSold()) {
            super.debit(amount);
        }else {
            throw new IllegalArgumentException("Le montant du débit est supérieur au solde.");
        }    
    }
    
    
    public void calculateSold() {
    	double balance = getCredit() - getDebit();
    	double interest = balance * interestRate;
    	super.credit(interest);
    }	
}
