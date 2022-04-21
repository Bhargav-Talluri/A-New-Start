package reallife;

public class student {
	
	int rollno;
	String name;
	String course;
	int m1,m2,m3;
	
	student(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
		
	}
	
	int total() {
		return m1+m2+m3;
	}
	
	double avg() {
		return total()/3;
	}
	
	char grade() {
		char grade = 'F';
		if(avg()>50) grade = 'D';
		if(avg()>60) grade = 'C';
		if(avg()>70) grade = 'B';
		if(avg()>80) grade = 'A';
		if(avg()>90) grade = 'S';
		
		return grade;
		
		
	}
	
	void details() {
		System.out.println("Name : "+name);
		System.out.println("Roll number : "+rollno);
		System.out.println("Marks in Maths : "+m1);
		System.out.println("Marks in Physics : "+m2);
		System.out.println("Marks in Chemistry : "+m3);
		System.out.println("Total marks : "+total());
		System.out.println("Average Marks : "+avg());
		System.out.println("Grade : "+grade());
		System.out.println();
	}

}
