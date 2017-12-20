package accountsClass;

public class TestAccount extends BankAccount{

	TestAccount(double deposit, double interestRate) {
		super(deposit, interestRate);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double amount;
		//Creating instances of TestAccount class
		TestAccount account1,account2; 
		//Calling parameterized constructor of TestAccount class
		account1 = new TestAccount(2000, 4.5);
		//Calling AddInterest method
		amount = account1.AddInterest();
		System.out.println("Interest on Initial Balance:" + amount);
		//Calling AddDeposit method
		account1.AddDeposit(500);
		amount = account1.AddInterest();
		System.out.println("Value after adding Deposit:" + amount);
		//Calling WithDraw method
		account1.WithDrawAmount(398.50);
		//Getting the balance
		amount = account1.getBalance();
		System.out.println("Total balance after withdrawal:" + amount);
		
		//Calling parameterized constructor of TestAccount class
		account2= new TestAccount(2850.60, 4);
		//Calling AddInterest method
		amount = account2.AddInterest();
		System.out.println("Interest on Initial Balance:" + amount);
		//Calling AddDeposit method
		account2.AddDeposit(500.75);
		amount = account2.AddInterest();
		System.out.println("Value after adding Deposit:" + amount);
		//Calling WithDraw method
		account2.WithDrawAmount(398);
		//Getting the balance
		amount = account2.getBalance();
		System.out.println("Total balance after withdrawal:" + amount);
		
		
		
		

	}

}
