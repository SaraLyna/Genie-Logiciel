import java.util.ArrayList;
import java.util.List;

public class Account {
	private int credit;
	private int debit;
	private List<Double> creditsHistory; //utilisation de listes
    private List<Double> debitsHistory;
    private static final int AUTHORIZED = 100000;
    private int number;
	
	public Account(int number) {
		this.credit=0;
		this.debit=0;
		this.creditsHistory = new ArrayList<>();//ArrayList 
        this.debitsHistory = new ArrayList<>();
        this.number = number;
	}
	
	public int getCredit() {
		return this.credit;
	}
	
	public int getDebit() {
		return this.debit;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public void credit(double n) {
		if (n > 0 && (credit + n) <= AUTHORIZED) {
			this.credit += n;
		 	creditsHistory.add((double) n);
		}
	}
	
	public void debit(double n) {
		if (n > 0 && (debit + n) <= AUTHORIZED) {
			this.debit += n;
			debitsHistory.add((double) n);
		}
	}
	
	public int getSold() {
		return this.credit-this.debit;
	}
	
	public List<Double> getCreditsHistory() {
        return new ArrayList<>(creditsHistory);
    }

    public List<Double> getDebitsHistory() {
        return new ArrayList<>(debitsHistory);
    }

}
