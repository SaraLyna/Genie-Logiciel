import java.util.ArrayList;
import java.util.List;

public class Account {
	private int credit;
	private int debit;
	private List<Double> creditsHistory;
    private List<Double> debitsHistory;
	
	public Account() {
		this.credit=0;
		this.debit=0;
		this.creditsHistory = new ArrayList<>();
        this.debitsHistory = new ArrayList<>();
	}
	
	public int getCredit() {
		return this.credit;
	}
	
	public int getDebit() {
		return this.debit;
	}
	
	public void credit(int n) {
		if (n >= 0) {
			this.credit += n;
		 	creditsHistory.add((double) n);
		}
	}
	
	public void debit(int n) {
		if (n >= 0) {
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
