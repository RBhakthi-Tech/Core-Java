package com.tnsif.constructor;

public class ConstructorExample {
	ConstructorExample(int i){
		System.out.println("constructor with 1 parameter");
	}
	
	ConstructorExample(int i,int j){
		System.out.println("constructor with 2 parameter");
	}
	ConstructorExample(int i, String g , int w){
		System.out.println("constructor with 3 parameter");
	}
	public static void main(String[] args) {
		//ConstructorExample c=new ConstructorExample(9,"gfhg");
		ConstructorExample c1=new ConstructorExample(7,9);
		ConstructorExample c2=new ConstructorExample(5);
		ConstructorExample c3=new ConstructorExample(7,"rash",1.0f);
		
	}
}
