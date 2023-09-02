
 /**
 * Hangman Version #3 Main Method
 * Runs the game
 * @author (Ryder Cook)
 * @version (4/7/2020)
 */

import java.util.*;

public class HangmanDemo
{
   public static void main(String[] args)
   {
       Hangman game = new Hangman();
        
       game.startGame();
       
       game.playGame();
       
       game.cont();

    }
}