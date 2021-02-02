package org.fujitsu.training.codes;

public class SavingsAccount {
	
	private Double initialBalance;
	private Float interestRate;
	private Double deposit;
	private Double withdraw;
	private Double interest;
	
	//constructor for initializing values to 0
	public SavingsAccount() {
		this(0.00, 0.00F);
	}
	
	//constructor for initializing values depending on the user input
	public SavingsAccount(Double initialBalance, Float interestRate) {
		this.initialBalance  = initialBalance;
		this.interestRate = interestRate;
	}

	//getters and setters
	public Double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(Double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public Float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Float interestRate) {
		this.interestRate = interestRate;
	}
	
	public Double getDeposit() {
		return deposit;
	}

	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}

	public Double getInterest() {
		return interest;
	}

	public void setInterest(Double interest) {
		this.interest = interest;
	}

	//deposit method
	public Double deposit(Double deposit) {
		this.deposit = deposit;
		this.initialBalance += deposit;
		return this.initialBalance;
	}
	
	//withdrawal method
	public Double withdraw(Double withdraw) throws Exception{
		this.withdraw = withdraw;
		if(this.withdraw > this.initialBalance) {
			throw new Exception("Invalid input.");
		}else {
			this.initialBalance -= withdraw;
			return this.initialBalance;
		}
	}
	
	//adding interest method
	public Double addInterest(Double interest) {
		this.interest = interest;
		this.initialBalance = this.initialBalance * (this.interest / 12);
		return this.initialBalance;
		
	}
	
	
	

}
