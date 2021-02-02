package org.fujitsu.training.codes;

public class TestSavingsAccount {

	public static void main(String[] args) {
		
		SavingsAccount interest = new SavingsAccount();
		
		System.out.println(interest.getInitialBalance());
		System.out.println(interest.getInterestRate());
		
		interest.deposit(10000.00);
		System.out.printf("Balance: %s\n", interest.getInitialBalance());
		
		try {
			interest.withdraw(1000.00);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("Balance: %s\n", interest.getInitialBalance());
		
		interest.deposit(1000.00);
		System.out.printf("Balance: %s\n", interest.getInitialBalance());
		
		interest.addInterest(24.00);
		System.out.printf("Balance: %s\n", interest.getInitialBalance());

	}

}
