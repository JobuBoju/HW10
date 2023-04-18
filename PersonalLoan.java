
public class PersonalLoan extends Loan {
	
	public PersonalLoan(int loanNumber,String lastName,double loanAmount,int term,double primeInterestRate) {
		super(loanNumber,lastName,loanAmount,term);
		setInterestRate(primeInterestRate + 0.02);
	}
}
