package reallife;

public class studentTesting {

	public static void main(String[] args) {
		
		var student1 = new student("Sai Bhargav",15240);
		student1.m1 = 81;
		student1.m2 = 88;
		student1.m3 = 75;
		
		var student2 = new student("Pavan kumar",13227);
		student2.m1 = 100;
		student2.m2 = 99;
		student2.m3 = 98;
		
		var student3 = new student("Manikanta",15103);
		student3.m1 = 50;
		student3.m2 = 69;
		student3.m3 = 75;
		
		var student4 = new student("Rohit",13293);
		student4.m1 = 44;
		student4.m2 = 50;
		student4.m3 = 66;
		
		
		student1.details();
		student2.details();
		student3.details();
		student4.details();
		
	

	}

}
