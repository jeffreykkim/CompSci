import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    private static final boolean I_AM_DEBUGGING = true;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        /* *** TO BE MODIFIED IN ACTIVITY 11 *** */
        if (selectedCards.size() == 2 && findPairSum11(selectedCards).size() > 0) {
            return true;
        } else if (selectedCards.size() == 3 && findJQK(selectedCards).size() == 3) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        /* *** TO BE MODIFIED IN ACTIVITY 11 *** */
        List<Integer> cIndexes = cardIndexes();
        if (findPairSum11(cIndexes).size() == 2 || findJQK(cIndexes).size() == 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Look for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return a list of the indexes of an 11-pair, if an 11-pair was found;
     *         an empty list, if an 11-pair was not found.
     */
    private List<Integer> findPairSum11(List<Integer> selectedCards) {
        List<Integer> returnList = new ArrayList(2);
        for (int i = 0; i < 2; i++)
        {
            returnList.add(0);
        }
        for (int sk1 = 0; sk1 < selectedCards.size(); sk1++) {
            int k1 = selectedCards.get(sk1).intValue();
            for (int sk2 = sk1 + 1; sk2 < selectedCards.size(); sk2++) {
                int k2 = selectedCards.get(sk2).intValue();
                if (cardAt(k1).pointValue() + cardAt(k2).pointValue() == 11) {
                    returnList.set(0,sk1);
                    returnList.set(1,sk2);
                    return returnList;
                }
            }
        }
        return new ArrayList();
    }

    /**
     * Look for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return a list of the indexes of a JQK, if a JQK was found;
     *         an empty list, if a JQK was not found.
     */
    private List<Integer> findJQK(List<Integer> selectedCards) {
        /* *** TO BE CHANGED INTO findJQK IN ACTIVITY 11 *** */
        boolean foundJack = false;
        boolean foundQueen = false;
        boolean foundKing = false;
        List<Integer> returnList = new ArrayList(3);
        for (int i = 0; i < 3; i++)
        {
            returnList.add(0);
        }
        for (Integer kObj : selectedCards) {
            int k = kObj.intValue();
            if (cardAt(k).rank().equals("jack")) {
                returnList.set(0,kObj);
                foundJack = true;
            } else if (cardAt(k).rank().equals("queen")) {
                returnList.set(1,kObj);
                foundQueen = true;
            } else if (cardAt(k).rank().equals("king")) {
                returnList.set(2,kObj);
                foundKing = true;
            }
        }
        if(foundJack&&foundQueen&&foundKing)
        {
            return returnList;
        }
        else
        {
            return new ArrayList();
        }
    }

    /**
     * Looks for a legal play on the board.  If one is found, it plays it.
     * @return true if a legal play was found (and made); false othewise.
     */
    public boolean playIfPossible() {

        if (anotherPlayIsPossible() && deckSize() > 0)
        {
            if(playJQKIfPossible(cardIndexes()) || playPairSum11IfPossible(cardIndexes()))
            {
                return true;
            }
            return false;
        }
        else 
        {
            return false;
        }
    }

    /**
     * Looks for a pair of non-face cards whose values sum to 11.
     * If found, replace them with the next two cards in the deck.
     * The simulation of this game uses this method.
     * @return true if an 11-pair play was found (and made); false othewise.
     */
    private boolean playPairSum11IfPossible(List<Integer> selectedCards) {
        if(findPairSum11(selectedCards).size() == 2)
        {
            replaceSelectedCards(findPairSum11(selectedCards));
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Looks for a group of three face cards JQK.
     * If found, replace them with the next three cards in the deck.
     * The simulation of this game uses this method.
     * @return true if a JQK play was found (and made); false othewise.
     */
    private boolean playJQKIfPossible(List<Integer> selectedCards) {
        if(findJQK(selectedCards).size() == 3)
        {
            replaceSelectedCards(findJQK(selectedCards));
            return true;
        }
        else
        {
            return false;
        }
    }
}
