package OopsConcepts;

public class TestingStatic {

	public static void main(String[] args) {
		
		//can access static methods without creating any object
		// syntax :-  classname.method();
		
		UseStatic.meth();
		
		// can access static variables without creating any object
		//syntax :- classname.var;
		
		System.out.println("b= "+UseStatic.b);

	}

}
