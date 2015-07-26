/**
 * 
 */
package training;

/**
 * @author prashant
 *
 */
public class overriddenException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Animalexcep bh = new Dog(); 
		Dog dg = new Dog();
	//	bh.eat();  // compile error unreported exception
		dg.eat();
		

	}

}
	  class Animalexcep {
	
	public void eat() throws Exception{
		
		System.out.println("generic animal eating generic");
	}
}

class Dog extends Animalexcep{
	
public void eat(){// No exception
		
		System.out.println("Dog eating");
	}
}