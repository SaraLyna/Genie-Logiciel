
public class Account {
	private int credit;
	private int debit;
	
	public Account() {
		this.credit=0;
		this.debit=0;
	}
	
	public int getCredit() {
		return this.credit;
	}
	
	public int getDebit() {
		return this.debit;
	}
	
	public void credit(int n) {
		this.credit += n;
	}
	
	public void debit(int n) {
		this.debit += n;
	}

}
