package basic;

import com.sun.tools.javac.launcher.Main;

public class UseAccessModifier {
	
	// access modifier / access specifier : class, variable,method
	// Private :only we call or use within the class where it is located
	// public: we can call or use within the class where it is located and from any other class
	// protected: only accessible from all the class of that particular package.
	
	// Access Modifier:
	
	// public
	// private
	// protected
	// default
	
	
	
	public static String name="James";
	static String ssn="567-232-457";
	protected static int mobileNumber=585858585;
	
	String fname="james";
	
	public static void main(String[] args) {
		//type main and then ctrl+space+enter >> main method
	
		System.out.println(UseAccessModifier.ssn);
		
		// type sysout ctrl+space+enter
		
	}

}
