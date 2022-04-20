package OopsConcepts;

public class BoxDemo {
	
	
	public static void main(String[] args) {
		Box mybox1 = new Box(10,10,10);
		Box mybox2 = new Box();
		Box myCube = new Box(10.5);
		//volume of firstbox
		
		System.out.println("volume is "+mybox1.volume());
		
		// volume of secondbox
		
		System.out.println("volume is "+mybox2.volume());
		
		// volume of cube
		
		System.out.println("volume is "+myCube.volume());
	}
}
