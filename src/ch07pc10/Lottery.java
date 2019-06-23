package ch07pc10;
import java.util.Random;

/**
 * Lottery class
 */
public class Lottery {
    // Fields
    private int[] lotteryNumbers;
    
    // Constructor
    public Lottery()
    {
        setLotteryNumbers();
    }
    
    // Methods
    /**
     * Get the lottery numbers created by the class
     * @return int[] The array of lottery numbers
     */
    public int[] getLotteryNumbers()
    {
        return lotteryNumbers;
    }
    
    /**
     * Set the lottery numbers via random number generation
     */
    private void setLotteryNumbers()
    {
        lotteryNumbers = new int[5];
        Random rand = new Random();
        
        for (int i = 0; i < 5; i++)
        {
            lotteryNumbers[i] = rand.nextInt(10);
        }
    }
    
    /**
     * Compare the user's selection to the lottery
     * @param userPicks int[] The array of user picks
     * @return int The number of matching picks
     */
    public int comparePicks(int[] userPicks)
    {
        //variables
        int correct = 0;
        
        for (int i = 0; i < lotteryNumbers.length; i++)
        {
            if (lotteryNumbers[i] == userPicks[i])
                correct++;
        }
        
        return correct;
    }
}
