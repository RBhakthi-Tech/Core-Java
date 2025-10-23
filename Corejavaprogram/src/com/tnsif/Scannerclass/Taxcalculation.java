package com.tnsif.Scannerclass;

public class Taxcalculation {
	
	public void Calculatetax(Person p) {
		if(p.getIncome()<=1600) {
			p.setTax(0);
		}
		else if(p.getIncome()>1600 && p.getIncome()<50000) {
			p.setTax(5);
		}
		else {
			p.setTax(10);
		}
	}

}
