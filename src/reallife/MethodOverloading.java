package reallife;

class PaymentMethods{
	
	void Payment(CreditCard CC) {                                    //same method name
		System.out.println("paid through credit card");              //but different types of parameters
	}                                                                // this is called method overloading
	
	void Payment(CashOnDelivery COD) {
		System.out.println("paid through cash");
	}
	
	void Payment(NetBanking GPAY) {
		System.out.println("paid through upi");
	}
	
}

//creating empty classes just to support my example
class NetBanking{}
class CashOnDelivery{}
class CreditCard{}


public class MethodOverloading {

	public static void main(String[] args) {
		
		NetBanking googlepay = new NetBanking();
		CashOnDelivery cash = new CashOnDelivery();
		CreditCard card = new CreditCard();
		
		PaymentMethods paymentmethod = new PaymentMethods();
		
		paymentmethod.Payment(cash);
		paymentmethod.Payment(card);
		paymentmethod.Payment(googlepay);

	}

}
