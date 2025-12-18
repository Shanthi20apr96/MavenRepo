package inheritancepath;

public class GoldLoan extends Bank {
	int goldAccno = 98765;
	public void print() {
		System.out.println("Gold Loan Acc Number =" + goldAccno);
		System.out.println("Bank account number =" + custNo);
	}
}
