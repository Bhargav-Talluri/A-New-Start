package OopsConcepts;

public class TestStack {

	public static void main(String[] args) {
		stack myStack1 = new stack();
		stack myStack2 = new stack();
		
		for(int i = 0 ; i<10; i++) {
			myStack1.push(i);
		}
		
		for(int i = 10;i<20;i++) {
			myStack2.push(i);
		}
		
		System.out.println("stack in mystack1:");
		for(int i = 0;i<10;i++) {
			System.out.println(myStack1.pop());
		}
		
		System.out.println("stack in mystack2:");
		for(int i = 0;i<10;i++) {
			System.out.println(myStack2.pop());
		}

	}

}
