/**
 * Hangman Version #1
 * Basic game setup
 * @author (Ryder Cook)
 * @version (2/11/2020)
 */

import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Hangman
{
    //Class variables defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    private int guessesMade;
    private int incorrectGuesses;
    
    //This method is void but expects a string to be sent in and does basic setup
    public void initialize(String word)
    {
        secretWord = word.toLowerCase().trim();
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
    }
    
    //This method returns a hidden word and takes in a string that is changed to said hidden word.
    public String createDisguisedWord(String word)
    {
        word = word.toLowerCase();
        
        word = word.replace('a', '_');
        word = word.replace('b', '_');
        word = word.replace('c', '_');
        word = word.replace('b', '_');
        word = word.replace('d', '_');
        word = word.replace('e', '_');
        word = word.replace('f', '_');
        word = word.replace('g', '_');
        word = word.replace('h', '_');
        word = word.replace('i', '_');
        word = word.replace('j', '_');
        word = word.replace('k', '_');
        word = word.replace('l', '_');
        word = word.replace('m', '_');
        word = word.replace('n', '_');
        word = word.replace('o', '_');
        word = word.replace('p', '_');
        word = word.replace('q', '_');
        word = word.replace('r', '_');
        word = word.replace('s', '_');
        word = word.replace('t', '_');
        word = word.replace('u', '_');
        word = word.replace('v', '_');
        word = word.replace('w', '_');
        word = word.replace('x', '_');
        word = word.replace('y', '_');
        word = word.replace('z', '_');
        
        return word;
    }
    
    //This method is void and takes in a character this is the letter guess and checking to if correct.
    public void makeGuess(Character c)
    {
        if(Character.isLetter(c))
        {
            String guess = "" + c;
            guess = guess.toLowerCase();
            int letterPosition = lettersRemaining.indexOf(guess);
            boolean goodGuess = letterPosition > -1;
            while(letterPosition > -1)
            {
                String before = lettersRemaining.substring(0, letterPosition);
                String after = lettersRemaining.substring(letterPosition+1);
                
                lettersRemaining = before + "#" + after;
                
                before = disguisedWord.substring(0, letterPosition);
                after = disguisedWord.substring(letterPosition+1);
                
                disguisedWord = before + guess + after;
                
                letterPosition = lettersRemaining.indexOf(guess);                
            }
            
            guessesMade++;
            
            if(!goodGuess)
                incorrectGuesses++;
            } else
                System.out.println("Sorry, your guess must be an alphabet character from a to z");
                
                if(incorrectGuesses >= 5)
                {
                    System.out.println("You Lose");
                    System.exit(99999999);
                }
    }
    
    //Accessor method for the hidden word
    public String getDisguisedWord()
    {
        return disguisedWord;
    }
    
    //Accessor method for the secret word
    public String getSecretWord()
    {
        return secretWord;
    }
    
    //Accessor method for guess
    public int getGuessCount()
    {
        return guessesMade;
    }
    
    //This method returns a boolean based on the hidden word being correct
    public boolean isFound()
    {
        return secretWord.equals(disguisedWord);
    }
    
    //This is a void method that starts the game
    public void playGame()
    {
        if(!isFound())
        {
            System.out.print("We are playing hangman");
            while(!isFound())
            {
                System.out.println("\nThe disguised word is <" + disguisedWord + ">");
                
                System.out.println("Guess a letter");
                
                Scanner reader = new Scanner(System.in);
                
                String guess = reader.next();
                if(guess.length()!= 1)
                    System.out.println("Sorry, bad guess.  Need a single letter.");
                else {
                    makeGuess(new Character(guess.charAt(0)));
                }
                System.out.println("Guesses made " + guessesMade + " with " + incorrectGuesses + " wrong.");
            }
            System.out.println("Congratulations, you found the secret word: " + secretWord);
        }
    }
}
