package reallife;

class ComputerScience {
	  private String course; // this variable is hidden by choice
	  // getter method to access private variable
	  public String getCourse() {
	    return course;
	  }
	  // setter method to manipulate private variable
	  public void setCourse(String s) {
	    this.course = s;
	  }
	}
public class BasicEncapsulation {

	public static void main(String[] args) {
		//object creation
		 ComputerScience btech = new ComputerScience();
		 // using setter
		    btech.setCourse("Java");
		    //using getter
		    System.out.println(btech.getCourse());

	}

}
