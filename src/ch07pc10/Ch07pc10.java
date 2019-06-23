package ch07pc10;
import java.util.Scanner;

/**
 * Play the lottery
 */
public class Ch07pc10 {

    public static void main(String[] args) {
        // Variables
        int[] userPicks = new int[5]; 
        int[] lottoPicks = new int[5];
        
        // Instantiate Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // Instantiate the lottery Class
        Lottery lotto = new Lottery();
        
        // Request user input
        System.out.println("Welcome to the lottery!");
        for (int i = 0; i < 5; i++)
        {
            System.out.printf("Enter your pick for slot %d. ", (i + 1));
            userPicks[i] = keyboard.nextInt();
        }
        
        // Display results
        System.out.print("Your lottery pick was: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(userPicks[i] + " ");
        }
        System.out.println();
        
        // Call the getLotteryNumbers method and print the results
        lottoPicks = lotto.getLotteryNumbers();
        System.out.print("The lottery number was: ");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(lottoPicks[i] + " ");
        }
        System.out.println();
        
        System.out.printf("You had %d matches.\n", lotto.comparePicks(userPicks));
        
        if (lotto.comparePicks(userPicks) == 5)
            System.out.println("Congratulations!  You are the grand winner!");
    }
    
}
