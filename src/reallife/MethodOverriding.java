package reallife;
//parent class
class ReserveBankofIndia{
	final private double interestrate = 3.35;
	
	//this is the original method 
	void GetInterest() {
		System.out.println(interestrate);
	}
	
	void depositmoney() {}
	
	void withdrawmoney() {}
	
}

//child classes

class HDFC extends ReserveBankofIndia{
	final private double interestrate = 5.0;
	
	//this method is gonna be overridden
	void GetInterest() {
		System.out.println(interestrate);
	}
}

class SBI extends ReserveBankofIndia{
	final private double interestrate = 4.90;
	
	//this method is gonna be overridden again
	void GetInterest() {
		System.out.println(interestrate);
	}
}

class AXIS extends ReserveBankofIndia{
	final private double interestrate = 5.20;
	
	//this method is gonna be overridden once again
	void GetInterest() {
		System.out.println(interestrate);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		ReserveBankofIndia RBI = new ReserveBankofIndia();
		HDFC hdfc = new HDFC();
		SBI sbi = new SBI();
		AXIS axis = new AXIS();
		
		System.out.println("intrest rate set by RBI is :");              //here
		RBI.GetInterest();                                               // all the objects are
		                                                                 // calling the exact same method
		System.out.println("intrest rate of HDFC is :");                 // i.e GetInterest();
		hdfc.GetInterest();                                              // but the methods are overridden in each of the cases
		                                                                 // resulting in different outputs
		System.out.println("intrest rate of SBI is :");
		sbi.GetInterest();
		
		System.out.println("intrest rate of AXIS is :");
		axis.GetInterest();
		

	}

}
