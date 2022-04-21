package OopsConcepts;

public class nestedClasses {//outerclass
	
	int i = 15;
	
	void showInnerClass() {
		innerClass legit = new innerClass();
		legit.display();
	}
	
	class innerClass {
		
		void display() {
			System.out.println("iam inner class");
			System.out.println("i can access outer outer class's vars and meths "+i);
		}
	}

}
