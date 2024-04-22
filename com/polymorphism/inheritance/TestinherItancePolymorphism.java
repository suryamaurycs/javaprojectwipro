package com.polymorphism.inheritance;

public class TestinherItancePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank;
		
		bank = new SBI();
		System.out.println("SBI Rate of Interest "+bank);
		
		bank = new ICICIBank();
		System.out.println("ICICI Rate of Interest is "+bank);
		
		
	}

}
