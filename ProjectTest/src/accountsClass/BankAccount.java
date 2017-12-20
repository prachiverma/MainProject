package accountsClass;

public class BankAccount implements AccountsInterface {
	public double initialDeposit;
	public double deposit;
	public double interest;
	public double balance;
	public double withdraw_Amount;
	public double totalBalance;
	
	BankAccount(double initialDeposit, double interest)
	{
		this.initialDeposit = initialDeposit;
		this.interest = interest;
	}

	@Override
	public double AddInterest() {
		if (deposit == 0)
		{
			totalBalance = initialDeposit * interest/100;
		}
		else
			totalBalance = totalBalance *interest/100;
		totalBalance = initialDeposit + totalBalance;
		
		return totalBalance;
		
	}

	@Override
	public double getBalance() {
		totalBalance = totalBalance - withdraw_Amount;
		return totalBalance;
	}

	@Override
	public void AddDeposit(double amount) {
		this.deposit = amount;
		totalBalance = (totalBalance + deposit);
		initialDeposit = totalBalance;
	}

	@Override
	public void WithDrawAmount(double amount) {
		withdraw_Amount = amount;
	}
	

}
