package OopsConcepts;

public class areasTesting {

	public static void main(String[] args) {
		var figure = new methodOverRiding(2,4);
		var rectangle = new rectangle(5,5);
		var triangle = new triangle(10,8);
		
		
		System.out.println(figure.area());
		System.out.println(rectangle.area());
		System.out.println(triangle.area());
		
		

	}

}
