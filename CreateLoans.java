import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CreateLoans{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String interestString = JOptionPane.showInputDialog("Please enter the prime interest rate:");
		double primeInterestRate = Double.parseDouble(interestString);
		String loansString = JOptionPane.showInputDialog("Enter amount of loans you would like to create:");
		int amountOfLoans = Integer.parseInt(loansString);
		Loan[] loans = new Loan[amountOfLoans];
		for(int i = 0; i < amountOfLoans; i++) {
			String loanNumberString = JOptionPane.showInputDialog("Enter loan number:");
			int loanNumber = Integer.parseInt(loanNumberString);
			String customerString = JOptionPane.showInputDialog("Enter customer last name:");
			String lastName = customerString;
			String loanAmountString = JOptionPane.showInputDialog("Enter loan amount:");
			double loanAmount = Double.parseDouble(loanAmountString);
			String loanTermString = JOptionPane.showInputDialog("Enter loan term:");
			int loanTerm = Integer.parseInt(loanTermString);
			String loanTypeString = JOptionPane.showInputDialog("Enter loan type (B/P):");
			String loanType = loanTypeString;
			if(loanType.equals("B")) {
				loans[i] = new BusinessLoan(loanNumber,lastName,loanAmount,loanTerm,primeInterestRate);
			}
			else {
				loans[i] = new PersonalLoan(loanNumber,lastName,loanAmount,loanTerm,primeInterestRate);
			}
		}
		for(int i = 0; i < amountOfLoans; i++) {
			JOptionPane.showMessageDialog(null, loans[i].toString(), "Display Message", JOptionPane.INFORMATION_MESSAGE);
		}
		ProgramReview frame = new ProgramReview();
		frame.setTitle("ProgramReview");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,80);
		frame.setVisible(true);
	}
}
