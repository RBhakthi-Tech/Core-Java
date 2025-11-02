
package com.tnsif.interfacedemo;

public class RBI implements Bank{

	@Override
	public float rateofinterest() {
		// TODO Auto-generated method stub
		return 5.6f;
	}
	public static void main(String[] args) {
		//PNB p=new PNB();
		Bank b=new RBI();
		System.out.println(b.rateofinterest());
	}

}

