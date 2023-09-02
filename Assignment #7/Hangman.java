/**
 * Hangman Version #2
 * Basic game setup
 * @author (Ryder Cook)
 * @version (3/12/2020)
*/
        
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.util.Random;
        
public class Hangman
{
    //Class variables defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    private String randomWords[] = {"programming","apple","google","drumming","solving"};
    private String[] playeroneWords = new String[100];
    private String[] playertwoWords = new String[100];
            
    private int guessesMade;
    private int incorrectGuesses;
    private int playerCount;
    private int wordcountplayerOne;
    private int wordcountplayerTwo;
    private int playeroneScore = 0;
    private int playertwoScore = 0;
    private int turnCount = 0;
            
    private boolean switchPlayer = false; 
        
    //Start Game
    public void startGame()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many players 1 or 2?");
        playerCount = keyboard.nextInt();
        Hangman game = new Hangman();
        if(playerCount == 1)
            pickwordOne();
         else
            inputWords();
    }
        
    //One Player Game
    public void onePlayer()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many players are there 1 or 2?");
            
        playerCount = keyboard.nextInt();
        if(playerCount == 1)
            pickwordonePlayer();
        else
            inputWords();
    }
        
    //Random word for one player
    public void pickwordonePlayer()
    {
        Scanner keyboard = new Scanner(System.in);
        
        int random = 0;
        System.out.println("Enter the amount of words you want to guess 1 - 5");

        wordcountplayerOne = keyboard.nextInt();
        while(turnCount < wordcountplayerOne)
        {
            random = (int)(Math.random() * wordcountplayerOne);
            while(randomWords[random] == "")
            
                random = (int)(Math.random() * wordcountplayerOne);
                initialize(randomWords[random]);
                randomWords[random] = "";
                playGame();
            
        }
        System.out.println("You guessed " + playeroneScore + " words right!");
    }
    
    //Player one enter your words
    public void pickwordOne()
    {
       Scanner keyboard = new Scanner(System.in);
        
        int random = 0;
        switchPlayer = false;
        System.out.println("Enter the amount of words you want to guess 1 - 5");

        wordcountplayerOne = keyboard.nextInt();
        while(turnCount < wordcountplayerOne)
        {
            random = (int)(Math.random() * wordcountplayerOne);
            while(randomWords[random] == "")
            
                random = (int)(Math.random() * wordcountplayerOne);
                initialize(randomWords[random]);
                playeroneWords[random] = "";
                playGame();
            
        }
    }
    
    //Input words
    public void inputWords()
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Player one how many words do you want?");
        wordcountplayerOne = keyboard.nextInt();
        
        for(int i = 0; i < wordcountplayerOne; i++)
        {
            System.out.println("Player one enter in a word.");
            playeroneWords[i] = keyboard.next();
            System.out.print("\f");
        }
        
        System.out.print("Player two how many words do you want?");
        wordcountplayerTwo = keyboard.nextInt();
        
        for(int i = 0; i < wordcountplayerTwo; i++)
        {
            System.out.println("Player two enter in a word.");
            playertwoWords[i] = keyboard.next();
            System.out.println("\f");
        }
        pickwordTwo();
    }
    
    //Player two enter your words
    public void pickwordTwo()
        {
        int random = 0;
        while(turnCount < wordcountplayerOne + wordcountplayerTwo)
        if(switchPlayer == false)
        {
            random = (int)(Math.random() * wordcountplayerOne);
            while(playeroneWords[random] == "")
            
                random = (int)(Math.random() * wordcountplayerOne);
                initialize(playeroneWords[random]);
                playeroneWords[random] = "";
                playGame();
            }   
            else
            {
                random = (int)(Math.random() * wordcountplayerTwo);
                while(playertwoWords[random] == "")
                {
                    random = (int)(Math.random() * wordcountplayerTwo);
                    initialize(playertwoWords[random]);
                    playertwoWords[random] = "";
                    playGame();
                }
            }
       }

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
                //5 Incorrect Guesses 
                System.out.println(" __________ ");
                System.out.println("|     |     |");
                System.out.println("|     O     |");
                System.out.println("|    /|\\    |");
                System.out.println("|    / \\    |");
                System.out.println(" __________ ");
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
            if(switchPlayer == false)
            {
                System.out.println();
                System.out.println("Player one it's your turn.");
            }
            else
            {
                System.out.println();
                System.out.println("Player two it's your turn.");
            }
            while(!isFound() && incorrectGuesses < 5)
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
                
                if(incorrectGuesses == 1)
                {
                    //1 Incorrect Guess 
                    System.out.println(" __________ ");
                    System.out.println("|     |     |");
                    System.out.println("|     O     |");
                    System.out.println("|           |");
                    System.out.println("|           |");
                    System.out.println(" __________ ");
                }else if(incorrectGuesses == 2)
                {
                    //2 Incorrect Guesses 
                    System.out.println(" __________ ");
                    System.out.println("|     |     |");
                    System.out.println("|     O     |");
                    System.out.println("|     |     |");
                    System.out.println("|           |");
                    System.out.println(" __________ ");
                }else if(incorrectGuesses == 3)
                {
                    //3 Incorrect Guesses 
                    System.out.println(" __________ ");
                    System.out.println("|     |     |");
                    System.out.println("|     O     |");
                    System.out.println("|     |     |");
                    System.out.println("|    /      |");
                    System.out.println(" __________ ");
                }else if(incorrectGuesses == 4)
                {
                    //4 Incorrect Guesses 
                    System.out.println(" __________ ");
                    System.out.println("|     |     |");
                    System.out.println("|     O     |");
                    System.out.println("|     |     |");
                    System.out.println("|    / \\    |");
                    System.out.println(" __________ ");
                }
            }
            System.out.println("Congratulations, you found the secret word: " + secretWord);
            System.out.println("Player one your score is " + playeroneScore);
            System.out.println("Player two your score is " + playertwoScore);
            if(switchPlayer == false)
                    playeroneScore++;
                else
                    playertwoScore++;
                    
            if(switchPlayer == false)
                    switchPlayer = true;
                else
                    switchPlayer = false;
                    turnCount++;
        }
    }
}