package OopsConcepts;

public interface interfaceStack {
	void push(int i);
	int pop();
	
}

package OopsConcepts;

public class dynamicStack implements interfaceStack {
	private int stck[];
	private int tos;
	
	dynamicStack(int size){
	stck = new int[size];
	tos = -1;
	}
	
	public void push(int item) {
		if(tos==stck.length-1) {
			int temp[] = new int[stck.length*2];
			for(int i=0;i<stck.length;i++) {
				temp[i]=stck[i];}
				stck = temp;
				stck[++tos]=item;
			
		}else stck[++tos]=item;
	}
	
	public int pop(){
		if (tos < 0) {
			System.out.println("stack underflow");
			return 0;
		}else return stck[tos--];
	}
}

package OopsConcepts;

public class testingDynamicStack {

	public static void main(String[] args) {
		var mystack1 = new dynamicStack(10);
		var mystack2 = new dynamicStack(18);
		
		for(int i =0 ; i <12;i++) {
			mystack1.push(i);
		}
		for(int i=0;i<20;i++) {
			mystack2.push(i);
		}
		
		System.out.println("Stack1: ");
		for(int i = 0; i<12;i++) {
			System.out.println(mystack1.pop());
		}
		
		System.out.println("Stack2: ");
		for(int i = 0; i<12;i++) {
			System.out.println(mystack2.pop());
		}
		
		

	}

}
