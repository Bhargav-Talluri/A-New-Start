package OopsConcepts;

public class TestPrivateStack {

	public static void main(String ...args) {
		
		var mystack1 = new stack();
		var mystack2 = new stack();
		
		for(int i = 0;i<10;i++) {
			mystack1.push(i);
		}
		
		for(int i = 0;i<10;i++) {
			mystack2.push(i);
		}
		
		System.out.println("stack in mystack1:");
		for(int i = 0;i<10;i++) {
			System.out.println(mystack1.pop());
		}
		
		System.out.println("stack in mystack2:");
		for(int i = 0;i<10;i++) {
			System.out.println(mystack2.pop());
		}
		
		

	}

}
