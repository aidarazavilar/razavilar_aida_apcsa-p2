/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card test = new Card("Jack", "Spades", 10);
		System.out.println(test);
		
		Card test2 = new Card("Queen", "Hearts", 12);
		System.out.println(test2.matches(test));
		System.out.println(test2);

	
		Card test3 = new Card("Nine", "Clubs", 9);
		System.out.println(test3.matches(test2));		
		System.out.println(test3);
		
		System.out.println(test.matches(test3));
	}
}
