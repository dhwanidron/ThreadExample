package com.training;

public class PrintStrings {

	
	
	public synchronized static void printString(String str1, String str2){
		
		System.out.println(Thread.currentThread().getId()+ " :Entering");
		System.out.println(str1);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(str2);
		System.out.println(Thread.currentThread().getId()+ " :Leaving");
		
	}
	
}
