package OopsConcepts;

public class privateStack {
	private int stack[] = new int[10];
	private int tos;
	
	privateStack() {
		tos = -1;
	}
	
	void push(int item) {
		if(tos == 9) System.out.println("stack is full");
		else stack[++tos] = item;
	}
	
	int pop() {
		if(tos == 0) {System.out.println("stack underflow");
		return 0;}
	
		else
			return stack[tos--];
	}
	
}
