package reallife;

interface Company{
	void CompanyName();
}

interface Address{
	void CompanyAddress();
}

interface Mentor{
	void MentorName();
}

class Work implements Company,Address,Mentor{

	public void MentorName() {
		System.out.println("Mentor Name : Mullai Ezhil");
	}

	
	public void CompanyAddress() {
		System.out.println("Address : Estancia IT Park, Plot No. 140 & 151 GST Road, Vallancherry Village, Chengalpattu Taluk \n"
				+ "          Chennai, Tamil Nadu , 603202.");
		
	}

	
	public void CompanyName() {
		System.out.println("Company Name : Zoho Corporation");
		
	}
	
}


public class interfaces {

	public static void main(String[] args) {
		
		Work Bhargav = new Work();
		
		Bhargav.CompanyName();
		Bhargav.MentorName();
		Bhargav.CompanyAddress();

	}

}
