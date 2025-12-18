package inheritancepath;

public class Loan extends GoldLoan,VehicleLoan {
	int loanId = 100;
	public static void main(String[] args) {
		Loan ln = new Loan();
		ln.print();
		
	}
}

	

