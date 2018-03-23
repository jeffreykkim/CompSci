/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] rank = {"One", "Two", "Three", "Four", "Five", "Six"
            , "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        int[] pointValue = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck e = new Deck(rank, suit, pointValue);
        
        
        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + e.toString());
        System.out.println("  isEmpty: " + e.isEmpty());
        System.out.println("  size: " + e.size());
        System.out.println();
        System.out.println();
        
        System.out.println("**** Deal Rest Of Cards ****");
        for (int i = 0; i < 52; i++) {
            System.out.println("  deal: " + e.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After Cards Dealt ****");
        System.out.println("  toString:\n" + e.toString());
        System.out.println("  isEmpty: " + e.isEmpty());
        System.out.println("  size: " + e.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + e.deal());
        System.out.println();
        System.out.println();
    }
}
