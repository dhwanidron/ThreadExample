package com.training;

public class Application2 {

	public static void main(String[] args) {
		
		final BankAccount bk1 = new BankAccount();
		
		Thread t1 = new Thread(){
			
			public void run(){
				bk1.withdraw(3000);
			}
			
		};
		t1.start();
		
		Thread t2 = new Thread(){
			
			public void run(){
				bk1.deposit(2000);
			}
			
		};
		t2.start();
	}

}
