// Johnny Pedicone
import java.util.Date;
public class Problem0907_Runner {

	public static void main(String[] args) 
	{
		Account myAccount = new Account(); 
		myAccount.setId(1122); //sets the id for the account
		myAccount.setBal(20000); //sets the balance for the account
		myAccount.setRate(4.5); //sets the annualInterestRate for the account
		
		myAccount.getMonthlyInterestRate(); //Calls the method in the other class to calculate the interest rate (and say welcome because I thought it would look nice)
		myAccount.getMonthlyInterest(); //
		myAccount.withdraw(2500);
		myAccount.deposit(3000);
		myAccount.printItAll(); // prints out what was done in the Class

	}

}
