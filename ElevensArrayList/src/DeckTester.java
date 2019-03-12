/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String [] ranks = {"1", "2","3","4","5","6","7","8","9","10","Queen","King","Ace"};
		String [] suits = {"Spade","Hearts", "Clubs", "Diamonds"};
		int [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck test = new Deck(ranks, suits, values);
		
		for (int i=0; i< 52; i++)
		{
			System.out.println(test.deal());	
		}
		
		Deck test1 = new Deck(ranks, suits, values);
		System.out.println(test1.isEmpty());
		
		Deck test2 = new Deck(ranks, suits, values);
		System.out.println(test2.size());

		
			
	}
}
