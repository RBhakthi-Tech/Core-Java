package com.tnsif.encapsulation;

public class EncapsulationDemo {
		
		int serialnumber;  //data members
		String name;
		int age;
		
		void show() {// member function
		System.out.println(serialnumber +" "+name+" "+age);	
		}
		
		public static void main(String[] args) {
			EncapsulationDemo d=new EncapsulationDemo();
			d.serialnumber=1;
			d.name="bhakthi";
			d.age=20;
			
			d.show();
		}

	}


