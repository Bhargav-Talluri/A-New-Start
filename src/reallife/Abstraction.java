package reallife;

//this is an abstract class
abstract class CalculatorMethods{  
	
	CalculatorMethods() {     // this is a constructor 
		System.out.println("hey there!\n"
				+ "this calculator can do 4 functionalities\n"
				+ "1) addition\n"
				+ "2) substraction\n"
				+ "3) multiplication\n"
				+ "4) division\n"
				+ "your input format should be : C.<function>(number1,number2)");
	}
	
	void division(double a , double b) { // this is a concrete method so it can directly be inherited to the subclasses
		System.out.println(a/b);
	}
	
	abstract void addition(double a , double b);              // these are
	abstract void substraction(double a , double b);          // abstract methods 
	abstract void multiplication(double a , double b);        // they have no body
	 
}

class Calculator extends CalculatorMethods{ // this class inherits an abstract class which forces it to deploy the abstract methods
	
	Calculator(){
		super();
	}
	
	void addition(double a , double b) {
		System.out.println(a+b);
	}
	void substraction(double a , double b) {// these abstract methods cannot be used without overriding/implementing them
		System.out.println(a-b);
	}
	void multiplication(double a , double b) {
		System.out.println(a*b);
	}

	
}
public class Abstraction {

	public static void main(String[] args) {
		
		Calculator C = new Calculator();
		
		C.division(9999, 135); // this method is inherited from the parent class
		
		C.addition(112, 13);
		C.substraction(1892, 938);
		C.multiplication(45, 57);
		
		

	}

}
