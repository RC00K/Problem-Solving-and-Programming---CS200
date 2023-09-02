    /**
     * Hangman Version #4
     * basic game setup
     * Ryder Cook
     * 4/14/2020
     */
    
    import java.util.*;
    import java.io.*;
    import java.io.File;
    import java.io.IOException;
    import java.security.*;
    
public class Hangman3
{  
    // class variables defined as private
    private String secretWord;
    private String disguisedWord;
    private String lettersRemaining;
    
    private int guessesMade;
    private int incorrectGuesses;
    private int wordCount = 5;
    private int playeroneWC = 5;
    private int playertwoWC = 5;
    
    
    private int[] randomPlayer1;
    private int[] randomPlayer2;
    
    private String[] player1;
    private String[] player2;
    private String[] solo = new String[5];

    private int playerOneScore = 0;
    private int playerTwoScore = 0;
    
    private int nextWordCount1 = 0;
    private int nextWordCount2 = 0;
    
    private boolean turn = true;
    private int countIt = 1;
    
    Scanner keyboard = new Scanner(System.in);
    Scanner inputStream = null;
    PrintWriter outputStream = null;
    
    
  public void multiplePlayerCount()
  {
      boolean f = false;
      while(f == false)
      {
          int test;
          System.out.println();
          System.out.println("How many words would player 1 and 2 like to enter?");
          try
          {
              test = Integer.parseInt(keyboard.nextLine());
              try
              {
                  if((test <= 0))
                  {
                      throw new InvalidGameException("Word count must be between 1 and 100!");
                  }
                  else if(test > 100)
                  {
                      throw new InvalidGameException("Word count must be between 1 and 100!");
                  }
                  else
                  {
                      f = true;
                      wordCount = test;
                  }
              }
              catch(InvalidGameException e)
              {
                  System.out.println("Word count must be between 1 and 100!");
              }
          }
          catch(Exception e)
          {
              System.out.println("Invalid Input");
          }
      }
  }
  
  // Load file for player one
  public void loadFile1PlayerOne()
  {
      System.out.println("Player 1: Do you have a file of words you would like to use?");
      System.out.println("1 = Yes and 2 = No");
      if(!gameKind())
      {
          System.out.println();
          System.out.println("Enter the name of the file (filename.txt): ");
          String fileName = keyboard.next();
          try
          {
              inputStream = new Scanner(new File(fileName));
          }
          catch(FileNotFoundException e)
          {
              System.out.println("File not found! Try Again!");
              loadFile1PlayerOne();
          }
          String[] test = null;
          int i = -1;
          while(inputStream.hasNextLine())
          {
              // Split line at comma
              String line = inputStream.nextLine();
              test = line.split(", ");
              
              for(String w:test)
              {
                  System.out.println(w);
                  i++;
              }
          }
          playeroneWC = (i + 1);
          randomPlayer1 = new int[playeroneWC + 1];
          player1 = new String[playeroneWC + 1];
          randomPlayer1 = uniqueNumber(playeroneWC);
          int n = 0;
          try
          {
              while(n < playeroneWC)
              {
                  player1[n] = test[n];
                  n++;
              }
              System.out.println('\f');
              System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+
                                 "\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
          }
          catch(Exception e)
          {
              System.out.println("Can't read file contents! Choose a new file!");
              loadFile1PlayerOne();
          }
      }
      else
      {
          System.out.println();
          System.out.println("Name your new file (newfilename.txt): ");
          try
          {
              String fileName = keyboard.nextLine();
              PrintWriter writer = new PrintWriter(fileName);
              System.out.println();
              System.out.println("Enter the words you want to use");
              System.out.println("and use comma and spaces (dog, cat, cow, goat)");
              String line = keyboard.nextLine();
              writer.println(line);
              writer.close();
              System.out.println();
              System.out.println("Load your new file: ");
              loadFile1PlayerOne();
          }
          catch(FileNotFoundException e)
          {
              System.out.println("ERROR CREATING FILE Try Again!");
              loadFile1PlayerOne();
          }
          catch(IOException e)
          {
              System.out.println("ERROR CREATING FILE Try Again!");
              loadFile1PlayerOne();
          }
      }
  }
  
  // Load file for player two
  public void loadFile2PlayerTwo()
  {
      System.out.println("Player 2: Do you have a file of words you would like to use?");
      System.out.println("1 = Yes and 2 = No");
      if(!gameKind())
      {
          System.out.println();
          System.out.println("Enter the name of the file (filename.txt): ");
          String fileName = keyboard.next();
          try
          {
              inputStream = new Scanner(new File(fileName));
          }
          catch(FileNotFoundException e)
          {
              System.out.println("File not found! Try Again!");
              loadFile2PlayerTwo();
          }
          String[] test = null;
          int i = -1;
          while(inputStream.hasNextLine())
          {
              // Split line at comma
              String line = inputStream.nextLine();
              test = line.split(", ");
              
              for(String w:test)
              {
                  System.out.println(w);
                  i++;
              }
          }
          playertwoWC = (i + 1);
          randomPlayer2 = new int[playertwoWC + 1];
          player2 = new String[playertwoWC + 1];
          randomPlayer2 = uniqueNumber(playertwoWC);
          int n = 0;
          try
          {
              while(n < playertwoWC)
              {
                  player2[n] = test[n];
                  n++;
              }
              System.out.println('\f');
              System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+
                                 "\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
          }
          catch(Exception e)
          {
              System.out.println("Can't read file contents! Choose a new file!");
              loadFile2PlayerTwo();
          }
      }
      else
      {
          System.out.println();
          System.out.println("Name your new file (newfilename.txt): ");
          try
          {
              String fileName = keyboard.nextLine();
              PrintWriter writer = new PrintWriter(fileName);
              System.out.println();
              System.out.println("Enter the words you want to use");
              System.out.println("and use comma and spaces (dog, cat, cow, goat)");
              String line = keyboard.nextLine();
              writer.println(line);
              writer.close();
              System.out.println();
              System.out.println("Load your new file: ");
              loadFile2PlayerTwo();
          }
          catch(FileNotFoundException e)
          {
              System.out.println("ERROR CREATING FILE Try Again!");
              loadFile2PlayerTwo();
          }
          catch(IOException e)
          {
              System.out.println("ERROR CREATING FILE Try Again!");
              loadFile2PlayerTwo();
          }
      }
  }
  
  // Player one
  public void gamePlayer1()
  {
      int i = 1;
      while(i <= playeroneWC)
      {
          if(turn == true)
          {
              chooseWordType2PlayerTwo();
              playGamePlayerOne();
              nextWordFinish();
              i++;
          }
          else
          {
          }
      }
      resetNextWordCount1();
      countIt++;
      gamePlayer2();
  }
  
  // Player two
  public void gamePlayer2()
  {
      int i = 1;
      if(turn = true)
      {
          while(i <= playertwoWC)
          {
              chooseWordType1PlayerOne();
              playGamePlayerTwo();
              nextWordFinish();
              i++;
          }
      }
      else
      {
      }
  }
  
  // This is a void method that starts the game
  public void playGamePlayerOne()
  {
      if(!isFound())
      {
          System.out.println("We are playing hangman");
          while(!isFound())
          {
              System.out.println("\nThe disguised word is <" + disguisedWord +">");
              System.out.println("Guess a letter");
              Scanner reader = new Scanner(System.in);
              String guess = reader.next();
              if(guess.length()!= 1)
              {
                  System.out.println("Sorry, bad guess.  Need a single letter.");
              }
              else
              {
                  makeGuessTwoPlayer(new Character(guess.charAt(0)));
              }
              System.out.println("Guesses made " + guessesMade + " with " + incorrectGuesses + " wrong");
          }
          System.out.println("Congratulations, you found the secret word: " + secretWord);
          playerTwoScore++;
      }
  }
  
  // This is a void method that starts the game
  public void playGamePlayerTwo()
  {
      if(!isFound())
      {
          System.out.println("We are playing hangman");
          while(!isFound())
          {
              System.out.println("\nThe disguised word is <" + disguisedWord +">");
              System.out.println("Guess a letter");
              Scanner reader = new Scanner(System.in);
              String guess = reader.next();
              if(guess.length()!= 1)
              {
                  System.out.println("Sorry, bad guess.  Need a single letter.");
              }
              else
              {
                  makeGuessTwoPlayer(new Character(guess.charAt(0)));
              }
              System.out.println("Guesses made " + guessesMade + " with " + incorrectGuesses + " wrong");
          }
          System.out.println("Congratulations, you found the secret word: " + secretWord);
          playerOneScore++;
      }
  }
  
  // This method is void and takes in a character this is the letter guess and checking to see if correct.
    public void makeGuessTwoPlayer(Character c)
    {
        if(Character.isLetter(c))
        {
            String guess = "" + c;
            guess = guess.toLowerCase();
            int letterPosition = lettersRemaining.indexOf(guess);
            //System.out.println(letterPosition);
            boolean goodGuess = letterPosition > -1;
            while(letterPosition > -1)
            {
                //System.out.println(letterPosition);
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
            {
                incorrectGuesses++;
            }
        } 
        else
        {
            System.out.println("Sorry, your guess must be an alphabet character from a to z");
        }
        if (incorrectGuesses >=5 )
        {
            System.out.println("You lose");
            System.out.println(secretWord + " was the correct word.");
            if(countIt == 2)
            {
                showScore();
                System.exit(0);
            }
            else
            {
                countIt++;
                gamePlayer2();
                
                turn = false;
            }
        }
    }
  
    // This is my list of words to be used for a 1 person game.
    // expects an integer to be passed in and returns an array.
    public void soloList()
    {
        randomPlayer1 = new int[6];
        solo = new String[6];
        randomPlayer1 = uniqueNumber(5);
        resetNextWordCount1();
        try
        {
            inputStream = new Scanner(new File("randomwords.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found! Try Again!");
            soloList();
        }
            String[] test = null;
            int i = 0;
            while(inputStream.hasNextLine())
            {
                String line = inputStream.nextLine();
                test = line.split(", ");
            }
        try
        {
            while(i < 5)
            {
                solo[i] = test[i];
                i++;
            }
        }
        catch(Exception e)
        {
            System.out.println("Can't read contents! Choose a new file!");
            soloList();
        }
    }
  
  // Player one
  public void chooseWordType1PlayerOne()
  {
      System.out.println();
      System.out.println("Player One: ");
      initialize(player2[randomPlayer2[nextWordCount1]]);
      nextWordCount1++;
  }
    
  // Player two
  public void chooseWordType2PlayerTwo()
  {
      System.out.println();
      System.out.println("Player Two: ");
      initialize(player1[randomPlayer1[nextWordCount2]]);
      nextWordCount2++;
  }
    
    public void chooseWordType1()
    {
        initialize(solo[randomPlayer1[nextWordCount1]]);
        nextWordCount1++;
    }
    
    public static int[] uniqueNumber(int n1)
    {
        int[] a = new int[n1];
        for(int c = 0; c < n1; c++)
        {
            a[c] = c;
        }
        
        int result[] = new int[n1];
        int x = n1;
        SecureRandom rd = new SecureRandom();
        for(int c = 0; c < n1; c++)
        {
            int num = rd.nextInt(x);
            result[c] = a[num];
            a[num] = a[x - 1];
            x--;
        }
        return result;
    }
        
    public void initialize(String word)
    {
        secretWord = word.toLowerCase().trim();
        lettersRemaining = secretWord;
        disguisedWord = createDisguisedWord(secretWord);
        guessesMade = 0;
        incorrectGuesses = 0;
    }
    
    public boolean gameKind()
  {
      boolean i = false;
      while(i == false)
      {
          Scanner keyboard = new Scanner(System.in);
          
          try
          {
              int A = Integer.parseInt(keyboard.nextLine());
              if(A == 2)
              {
                  i = true;
                  return true;
              }
              else if(A == 1)
              {
                  i = true;
                  return false;
              }
              else
              {
                  throw new InvalidGameException("Not Valid: 1 or 2");
              }
          }
          catch(Exception e)
          {
              System.out.print("Not Valid: 1 or 2");
          }
      }
      System.out.println("No Response");
      return false;
  }
    
    // This method returns a hidden word and takes in a string that is changed to said hidden word.
    public String createDisguisedWord(String word){
        word = word.toLowerCase();
        word = word.replace('a', '_');
        word = word.replace('b', '_');
        word = word.replace('c', '_');
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
    
    // This method is void and takes in a character this is the letter guess and checking to see if correct.
    public void makeGuess(Character c){
        if(Character.isLetter(c))
        {
            String guess = "" + c;
            guess = guess.toLowerCase();
            int letterPosition = lettersRemaining.indexOf(guess);
            //System.out.println(letterPosition);
            boolean goodGuess = letterPosition > -1;
            while(letterPosition > -1)
            {
                //System.out.println(letterPosition);
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
            {
                incorrectGuesses++;
            }
        } 
        else
        {
            System.out.println("Sorry, your guess must be an alphabet character from a to z");
        }
        if (incorrectGuesses >=5)
        {
            System.out.println("You lose");
            System.out.println(secretWord + " was the correct word.");
            chooseWordType1();
            playGame();
            //System.exit(99999999);
        }
    }
    
    public void nextWordFinish()
    {
        System.out.println("Next Word");
    }
    
    //accessor method for the hidden word
    public String getDisguisedWord(){
        return disguisedWord;
    }
    
    // accessor method for the secret word
    public String getSecretWord(){
        return secretWord;
    }
    
    // accessor method for the guess
    public int getGuessCount(){
        return guessesMade;
    }
    
    public int getplayeroneWC()
    {
        return playeroneWC;
    }
    
    public int getplayertwoWC()
    {
        return playertwoWC;
    }
    
    public void setplayeroneWC(int newwordCount)
    {
        playeroneWC = newwordCount;
    }
    
    public void setplayertwoWC(int newwordCount)
    {
        playertwoWC = newwordCount;
    }
  
    // this method returns a boolean based on the hidden word being correct
    public boolean isFound(){
        return secretWord.equals(disguisedWord);
    }
    
  // This is a void method that starts the game
  public void playGame()
  {
      if(!isFound())
      {
          System.out.println("We are playing hangman");
          while(!isFound())
          {
              System.out.println("\nThe disguised word is <" + disguisedWord +">");
              System.out.println("Guess a letter");
              Scanner reader = new Scanner(System.in);
              String guess = reader.next();
              if(guess.length()!= 1)
              {
                  System.out.println("Sorry, bad guess.  Need a single letter.");
              }
              else
              {
                  makeGuess(new Character(guess.charAt(0)));
              }
              System.out.println("Guesses made " + guessesMade + " with " + incorrectGuesses + " wrong");
          }
          System.out.println("Congratulations, you found the secret word: " + secretWord);
        }
  }
  
  public void showScore()
  {
      System.out.println("SCORE");
      System.out.println("Player One: " + playerOneScore);
      System.out.println("Player Two: " + playerTwoScore);
  }
  
  public void resetNextWordCount1()
  {
      nextWordCount1 = 0;
  }
}