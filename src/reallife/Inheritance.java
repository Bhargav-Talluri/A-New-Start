package reallife;


//parent class
class Animal{
	
	void eat() {}                                        //                   (parent class)
	                                                     //                       animal
	void move() {}                                       //                        | |
	                                                     //                 _______| |_______     
}                                                        //                 |                |
                                                         //                 |                |
//child class                                            //                 V                V
class lion extends Animal{                               //                lion            rabbit 
	                                                     //               (child)          (child)
	void roar() {}
	
	void hunt() {}
}

class rabbit extends Animal{
	
	void runaway() {}
}

public class Inheritance {

	public static void main(String[] args) {
		
		lion simba = new lion();
		simba.eat();          // simba can eat , eat is inherited as it is an animal.
		simba.move();         // simba can move , all animals can move so this is also an inherited property
		simba.roar();         // simba can roar and hunt ...now this can only be done by a lion
		simba.hunt();         // simba is a lion (object of lion class) ..so it can roar and hunt
		
		rabbit bunny = new rabbit();
		bunny.eat();          // bunny is an animal so it can eat and move (inherited property)
		bunny.move();         // bunny can runaway
		bunny.runaway();      // but bunny can't roar or hunt because bunny is not a lion.

	}

}
