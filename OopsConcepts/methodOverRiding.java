package OopsConcepts;

public class methodOverRiding {
	double dimension1;
	double dimension2;
	
	public methodOverRiding(double a, double b) {
		dimension1 = a;
		dimension2 = b;
	}


	double area() {
		System.out.println("no area");
		return 0;
	}
}
