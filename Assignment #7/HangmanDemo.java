 /**
 * Hangman Version #2 Main Method
 * Runs the game
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */

import java.util.*;

public class HangmanDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Hangman game = new Hangman();
        game.initialize("Happiness");
        game.playGame();
        
        System.out.println("Enter a word to be added");
        String extraWord = keyboard.nextLine();
        game.initialize(extraWord);
        System.out.println("Lets play a round of hangman.");
        game.playGame();
        
        game.initialize("I'll be back.");
        System.out.println("\nLets play a second round of hangman.");
        game.playGame();
    }
}