
public abstract class Loan implements LoanConstants{
	private int loanNumber;
	private String lastName;
	private double loanAmount;
	private double interestRate;
	private int term;
	
	public Loan(int loanNumber, String lastName, double loanAmount, int term) {
		this.loanNumber = loanNumber;
		this.lastName = lastName;
		setLoanAmount(loanAmount);
		setTerm(term);
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		if(loanAmount > maxLoanAmount) {
			this.loanAmount = maxLoanAmount;
		}
		else {
			this.loanAmount = loanAmount;
		}
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		if(term == 1 || term == 3 || term == 5) {
			this.term = term;
		}
		else {
			this.term = 1;
		}
	}

	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", lastName=" + lastName + ", loanAmount=" + loanAmount
				+ ", interestRate=" + interestRate + ", term=" + term + ", totalAmountDue=" + (loanAmount * (interestRate/term) + loanAmount) + "]";
	}
	
	
	
	
	
	

}
