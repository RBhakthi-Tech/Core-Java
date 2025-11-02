package finalkeyword;

public class Finaldemo {
	
	// demo for final keyword
	//variable
	//method
	//class

	static int a=8;  // u can't change value
		static {
			a=9 ;
		}
		final void display() { // can't override
			System.out.println("welcome to java");
		}

		

	}

public class Demo extends Finaldemo{
	
	@Override
	 void display() {
		System.out.println("welcome to python");
	}

}
