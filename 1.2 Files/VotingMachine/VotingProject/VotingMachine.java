
/**
 * Write a description of class VotingMachine here.
 *
 * @author Jeffrey Kim
 * @version 9/29/17
 */
public class VotingMachine
{
    private String[] candArray;
    private int[] allVotesArray;
    private int totalVotes;
    /**
     * Constructor for objects of class VotingMachine
     */
    public VotingMachine()
    {
        /**
         * Instantation of 2016 Pres. Candidates in an array and each vote counts
         * as well.
         */
        candArray = new String[] {"Trump/Pence - Repbulican", "Clinton/Kaine - Democrat"
        , "Johnson / Weld - Libertarian", "Stein / Baraka - Green"
        , "Castle / Bradley - Constitution"};
        allVotesArray = new int[candArray.length];
        for (int i = 0; i < candArray.length; i++)
        {         
            allVotesArray[i] = 0;
        }
    }
}
