package com.training;

public class BankAccount {

	public void display()
	{
		System.out.println("Hello world");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	private double balance = 2000;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public synchronized double deposit(double amt){ 
		balance = balance+amt;
		System.out.println("Insuffiecient Balance - will wait for transfer");
		notify();
		return balance; 
	}
	
	public synchronized double withdraw(double amt){ 
		if(balance < amt)
		{
			System.out.println("Insuffiecient Balance - will wait for transfer");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		balance = balance - amt;
		System.out.println("Insuffiecient Balance - will wait for transfer");
		return balance; 
	}
}
	
	
