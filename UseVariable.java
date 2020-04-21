package basic;

import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class UseVariable {

	
	// variable: is a container which can hold value
	// Integer is data type
	// DataType variableName = value
	
	//global variable / not static 
	int x=5;
	int p=7;

	
	
	// class variable
	static int z=10;
	
	// declare variable 
	int a;
	
	//declare and initialize value
	int b=80;
	
	//constant variable:
	String MAX_width="44";
	final String MIN_width="36";
	
	// Variable type
	// Global Variable : inside of a class but outside of method
	// Local Variable : inside of a method
	// class variable : static keyword is used
	
	public static void main(String[] args) {
		int y=6;
		
		System.out.println(UseVariable.z);
		
		// need to create object then call it by object name
		
		// ClassName objectName = mew constractorOfClass();
		
		UseVariable obj= new UseVariable();
		//obj.p = 14;
		System.out.println(obj.p); //call by object name 
		
	
	
}
	
	
	
	
	
}
