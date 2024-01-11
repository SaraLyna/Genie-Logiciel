
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
		if (n >= 0) {
			this.credit += n;
		}
	}
	
	public void debit(int n) {
		if (n >= 0) {
			this.debit += n;
		}
	}

}
