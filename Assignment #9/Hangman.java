
/**
 * Hangman Version #3
 * Basic game setup
 * @author (Ryder Cook)
 * @version (4/7/2020)
*/
        
import java.util.*;
        
public class Hangman
{
    // class variables defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    private String[] player1;
    private String[] player2;
    private String[] solo;
    
    private boolean turn = true;
    
    private int totalTurns;
    private int countIt;
    private int playerOne;
    private int playerTwo;
    private int guessesMade;
    private int incorrectGuesses;
    private int playeroneScore;
    private int playertwoScore;
    private int turnCount = 0;

    public boolean players;
    public int numbs1 = 0;
    public int numbs2 = 0;
    public int playerNumbers;
    public String cont = "Y";
    
    // This method is void but expects 2 integers for number of words and a boolean to be sent in and does basic setup
    // This is the initializer for a 2 player game.
    public void initialize(int numbers, int numbers2, boolean players) {
        player1 = new String[numbers-1];
        player1 = fillIt(numbers, "Player One ");
        player2 = new String[numbers2-1];
        player2 = fillIt(numbers2, "Player Two ");
        totalTurns = numbers + numbers2;
        turn = getTurn(turn);
        totalTurns = gameOver(totalTurns);
        secretWord = theWord(turn, numbers, numbers2, player1, player2);
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
        countIt = 0;
        playerOne = 0;
        playerTwo = 0;
    }
    
    // this method is void but expects a boolean sent in and is the set up for a 1 player game.
    public void initialize(boolean players) {
        if(players)
        {
        int totalHeld = 6;
        solo = new String[totalHeld];
        solo = soloList(totalHeld);
        totalTurns = totalHeld;
        }
        totalTurns = gameOver(totalTurns);
        secretWord = theWord(6, solo);
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
        countIt = 0;
    }
    
    //This is my list of words to be used for a 1 person game.
    // expects an integer to be passed in and returns an array.
    public String [] soloList(int totalHeld)
    {
        String[] temp = new String[totalHeld];
        temp[0] = "technology";
        temp[1] = "fundamentals";
        temp[2] = "contemporary";
        temp[3] = "discovering";
        temp[4] = "programming";
        temp[5] = "algorithms";
        return temp;
    }
    
    //This method fills the arrays in a 2 player game and expects the size to be passed in.
    public String[] fillIt(int numbs, String player)
    {
        Scanner keyboard = new Scanner(System.in);
        String[] temp = new String[numbs];
        countIt=0;
        System.out.println(player + "Enter your words");
        for(int counter = 0; counter <= numbs-1; counter++)
        {
            System.out.print ('\f');
            countIt++;
            System.out.println(player + "Please enter your words: " + countIt);
            temp[counter] = keyboard.nextLine();
            
        }
        return temp;
    }
    
    //This sets up the secret word for a 1 person game and expects the number and the array
    //to be passed in and returns the word
    public String theWord(int numbers, String[] theList)
    {
        String secretWord = " ";
        
        secretWord = choose(numbers, theList);
        return secretWord; 
        
    }
    
    //This sets up the secret word for a 2 player game expects a boolean to deside on turn
    //The size of both arrays being used and the arrays themselves.
    public String theWord(boolean checkTurn, int numbers, int numbers2, String[] theList, String[] theList2)
    {
        boolean temp = checkTurn;
        String secretWord = " ";
        if(temp)
        {
            secretWord = choose(numbers, theList);
            return secretWord;
        }
        else
        {
            secretWord = choose(numbers2, theList2);
            return secretWord;
        }  

    }
    
    //This method makes the selection of the word from the array.
    public String choose(int numbs, String[] theList)
    {
        String theWord = " ";
        boolean checker = true;
        while(checker)
        {
        int selection = (int)(( numbs) * Math.random());
        if(isOnList(selection, numbs, theList))
        {
           theWord = theList[selection];
           checker = false;
           theList[selection] = " ";
        }
        }
        return theWord;
    }
    
    public boolean isOnList (int selection, int numbers, String[] anArray)
    {
        boolean found = true;
        String selection2 = anArray[selection];
            if(selection2.equals(" "))
               {
                found = false;
               }
            else
               {
                   
                   found = true;
            }
            return found; 
        
    }
    
    //This method sets the turn
    public boolean getTurn(boolean turn)
    {
        boolean temp = turn;
        
        if(temp)
        {
            temp = false;
        }
        else
        {
            temp = true;
        }
        return temp;
    }
    
    public int gameOver(int totalTurns)
    {
        if(totalTurns <= 0)
        {
            System.out.println("Game over all words have been used");
            if(playerOne>playerTwo)
            System.out.println("Player 1 wins");
            else if(playerTwo>playerOne)
            System.out.println("Player 2 wins");
            else
            System.out.println("It's a tie");
            System.exit(0);
        }
        totalTurns --;
        return totalTurns;
    }
    
    // This method returns a hidden word and takes in a string that is changed to said hidden word.
    public String createDisguisedWord(String word)
    {
        word = word.toLowerCase();
        word = word.replace('a', '?');
        word = word.replace('b', '?');
        word = word.replace('c', '?');
        word = word.replace('d', '?');
        word = word.replace('e', '?');
        word = word.replace('f', '?');
        word = word.replace('g', '?');
        word = word.replace('h', '?');
        word = word.replace('i', '?');
        word = word.replace('j', '?');
        word = word.replace('k', '?');
        word = word.replace('l', '?');
        word = word.replace('m', '?');
        word = word.replace('n', '?');
        word = word.replace('o', '?');
        word = word.replace('p', '?');
        word = word.replace('q', '?');
        word = word.replace('r', '?');
        word = word.replace('s', '?');
        word = word.replace('t', '?');
        word = word.replace('u', '?');
        word = word.replace('v', '?');
        word = word.replace('w', '?');
        word = word.replace('x', '?');
        word = word.replace('y', '?');
        word = word.replace('z', '?');
        
        return word;
    }
    
    // This method is void and takes in a character this is the letter guess and checking to see if correct.
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

    
    //accessor method for the hidden word
    public String getDisguisedWord()
    {
        return disguisedWord;
    }
    
    // accessor method for the secret word
    public String getSecretWord()
    {
        return secretWord;
    }
    
    // accessor method for the guess
    public int getGuessCount()
    {
        return guessesMade;
    }
    
    // this method returns a boolean based on the hidden word being correct
    public boolean isFound()
    {
        return secretWord.equals(disguisedWord);
    }
    
    public void startGame()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");
        //Try catch for choosing 1 or 2 players
        try
        {
            System.out.print("Will this be a one or two player game?: ");
            int playerNumbers = keyboard.nextInt();
            if(playerNumbers < 1 || playerNumbers > 2)
            {
                System.out.println("You must enter either 1 or 2");
                startGame();
            }
            else if(playerNumbers > 1)
            {
                //Try catch for choosing how many words to play
                try
                {
                    players = true;
                    System.out.println("Great how many words would player 1 like to enter? ");
                    numbs1 = keyboard.nextInt();
                    if(numbs1 < 1 || numbs1 > 6)
                    {
                        System.out.println("You must choose 1 to 6 words.");
                        numbs1 = keyboard.nextInt();
                    }
                    
                    System.out.println("How many words would player 2 like to enter? ");
                    numbs2 = keyboard.nextInt();
                    if(numbs2 < 1 || numbs2 > 6)
                    {
                            System.out.println("You must choose 1 to 6 words.");
                            numbs2 = keyboard.nextInt();
                    }
                    else
                    {
                        initialize(numbs1, numbs2, players);
                    }
                }
                catch(NumberFormatException e)
                {
                    System.out.println("Invalid Input");  
                }
            }
            else
            {
                players = true;
                initialize(players);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input");
        }
    }
    
    // This is a void method that starts the game
    public void playGame()
    {
        if(!isFound())
        {
            if(turn == false)
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
            if(turn == false)
                    playeroneScore++;
                else
                    playertwoScore++;
                    
            if(turn == false)
                    turn = true;
                else
                    turn = false;
                    turnCount++;
        }
    }
    
    public void cont()
    {
        if (playerNumbers > 1)
        {
        while(cont.equalsIgnoreCase("Y"))
        {
            System.out.println("Continue y or n? ");
            Scanner keyboard2 = new Scanner(System.in);
            cont = keyboard2.nextLine();
        if(cont.equalsIgnoreCase("Y"))
        {
                players = false;
                initialize(numbs1, numbs2, players);
                startGame();
        }
        else
        {
            totalTurns=-1;
            gameOver(totalTurns);
        }
        }
        }
        else
        {
           while(cont.equalsIgnoreCase("Y"))
           {
              System.out.println("Continue y or n? ");
              Scanner keyboard2 = new Scanner(System.in);
              cont = keyboard2.nextLine();  
              if(cont.equalsIgnoreCase("Y"))
              {
                  startGame();
              } 
            }
        }
    }   
}