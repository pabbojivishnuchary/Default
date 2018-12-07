package com.ibs;

public class Welcome implements I1,I2 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		I1.super.display();
	}
	
	public static void main(String[] args) {
	
		Welcome welcome = new Welcome();
		welcome.display();
		System.out.println("Vishnu chary");
	}

}
