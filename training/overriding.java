/**
 * 
 */
package training;

/**
 * @author prashant
 *
 */
public class overriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animal an = new Animal();
		Animal bh = new Horse(); //  Animal reference but Horse object
		an.eat();  //runs animal version
		bh.eat();  // runs horse version
	//	bh.buck; //  can't  invloke : Animal doesnot have  this method
 	}

}


class Animal {
	
	public void eat() {
		
		System.out.println("generic animal eating generic");
	}
}

class Horse extends Animal {
	
	public void eat(){
		
		System.out.println("Horsing eating");
	}
	public void buck() {
		
		System.out.println("calling buck");
	}
}
