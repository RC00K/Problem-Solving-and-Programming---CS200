/**
 * Hangman Version #4 Main Method
 * runs the game
 * Ryder Cook
 * 4/14/2020
 */

import java.util.*;

public class HangmanDemo3 
{
    public static void main(String[] args) throws InvalidGameException
    {
       Scanner keyboard = new Scanner(System.in);
       System.out.println();
       System.out.println("Welcome to Hangman!");
       System.out.println("How many players 1 or 2?");
       
       Hangman3 game = new Hangman3();
       if(!game.gameKind())
       {
           game.soloList();
           for(int i = 0; i < 5; i++)
           {
               game.chooseWordType1();
               game.playGame();
           }
           System.exit(0);
       }
       else
       {
           game.loadFile1PlayerOne();
           game.loadFile2PlayerTwo();
           game.gamePlayer1();
       }
       game.showScore();
    }
}
