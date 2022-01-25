package com.bank;

public class costomer extends BankMaster {

	@Override
	public double credit(double amount) {
		setDepAmount(getDepAmount()+amount);
		return getDepAmount();
	}

	@Override
	public double debit(double amount) {
		if(amount>getDepAmount()) {
			System.out.println("Insufficient Balance"+getDepAmount());
			return getDepAmount();
		}
		else {
			setDepAmount(getDepAmount()-amount);
				return getDepAmount();
			}
		}
	

	public static void main(String[] args) {
		costomer cust = new costomer();
		cust.openAccount("Vijay", 150000);
		cust.viewDetails();
		System.out.println("After Deposit Current Amount >> "+cust.credit(5000));
		System.out.println("After Withdraw Current Amount >> "+cust.debit(1500034));
		IntrestCalculator fd =new IntrestCalculator(cust.getDepAmount(),4.95f,3);
		System.out.println("Intrest Amount >> "+fd.intrAmount());
		System.out.println("Maturity Amount >> "+(cust.getDepAmount()+fd.intrAmount()));


		
					

	}

}
