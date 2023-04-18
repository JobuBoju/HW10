
public class BusinessLoan extends Loan{
	
	public BusinessLoan(int loanNumber,String lastName,double loanAmount,int term,double primeInterestRate) {
		super(loanNumber,lastName,loanAmount,term);
		setInterestRate(primeInterestRate + 0.01);
	}
}
