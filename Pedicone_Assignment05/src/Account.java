// Johnny Pedicone
import java.util.Date;
public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	Account()
	{
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		//dateCreated = ;
		
	}
	
	// getter and setters for the private variables
	public int getId() 
	{
		return id;
	}
	public void setId(int userId) 
	{
		id = userId;
	}
	public double getBal() 
	{
		return balance;
	}
	public void setBal(double newBal) 
	{
		balance = newBal;
	}
	public double getRate() 
	{
		return annualInterestRate;
	}
	public void setRate(double newRate) 
	{
		annualInterestRate = (newRate / 100);
	}
	public double getMonthlyInterestRate() 
	{
		return (annualInterestRate /12);
	}
	public double getMonthlyInterest() 
	{
		return (balance * getMonthlyInterestRate());
	}
	public void withdraw(double amountTake) // withdraws money from the account and sets the new total
	{
		balance -= amountTake;	
	}
	public void deposit(double amountGive) // deposits money into the account and sets the new total balance
	{
		balance += amountGive;
	}
	public void printItAll() //displays everything
	{
		System.out.println(" Welcome user: " + id);
		System.out.println(" This account was created on " + dateCreated.toString());
		System.out.printf(" The account balance is: $"+ "%.2f", balance);
		System.out.println("");
		System.out.printf(" Your monthly interest is: $" +"%.2f", getMonthlyInterest());
	}	
} 