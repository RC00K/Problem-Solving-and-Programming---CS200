/**
 * VoteRecoderTest
 * Test Class that records the votes.
 * @author (Ryder Cook)
 * @version (2/29/20)
 */
import java.util.Scanner;

public class VoteRecorderTest
{
    private static String nameCandidatePresident1;
    private static String nameCandidatePresident2;
    private static int votesCandidatePresident1;
    private static int votesCandidatePresident2;
    
    private static String nameCandidateVicePresident1;
    private static String nameCandidateVicePresident2;
    private static int votesCandidateVicePresident1;
    private static int votesCandidateVicePresident2;

    public static void setCandidatesPresident(String name1, String name2)
    {
        nameCandidatePresident1 = name1;
        nameCandidatePresident2 = name2;
    }
    
    public static String currentVotePresident()
    {
        return nameCandidatePresident1 + " has " + votesCandidatePresident1 + " votes: "
        + nameCandidatePresident2 + " has " + votesCandidatePresident2 + " votes: ";
    }
    
    public static void setCandidatesVicePresident(String name1, String name2)
    {
        nameCandidateVicePresident1 = name1;
        nameCandidateVicePresident2 = name2;
    }
    
    public static String currentVoteVicePresident()
    {
        return nameCandidateVicePresident1 + " has " + votesCandidatePresident2 + " votes: " 
        + nameCandidateVicePresident2 + " has " + votesCandidateVicePresident2 + " votes: ";
    }
    
    public static void resetVotes()
    {
        votesCandidateVicePresident1 = 0;
        votesCandidateVicePresident2 = 0;
    }
    
    private int myVoteForPresident;
    private int myVoteForVicePresident;
    
    public void VoteRecorder()
    {
        votesCandidatePresident1 = 0;
        votesCandidatePresident2 = 0;
        myVoteForPresident = 0;
        myVoteForVicePresident = 0;
    }
    
    public void recordVotes()
    {
        switch(myVoteForPresident)
        {
            case 0:
            break;
            
            case 1:
            votesCandidatePresident1++;
            break;
            
            case 2:
            votesCandidatePresident2++;
            break;
        }
        
        switch(myVoteForVicePresident)
        {
            case 0:
            break;
            
            case 1:
            votesCandidateVicePresident1++;
            break;
            
            case 2:
            votesCandidateVicePresident2++;
            break;
        }        
    }
    
    private int getAVote(String name1, String name2)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int answer = 0;
        boolean goodAnswer = false;
        while(!goodAnswer)
        {
            System.out.println("Please choose a candidate: ");
            System.out.println(" 0 - No one ");
            System.out.println(" 1 - " + name1);
            System.out.println(" 2 - " + name2);
            
            answer = keyboard.nextInt();
            goodAnswer = answer >= 0 && answer <= 2;
        }
        return answer;
    }
    
    private void getVotes()
    {
        System.out.println("You are voting for president ");
        myVoteForPresident = getAVote(nameCandidatePresident1, nameCandidatePresident2);
        
        System.out.println("You are voting for vice president ");
        myVoteForVicePresident = getAVote(nameCandidateVicePresident1, nameCandidateVicePresident2);
    }
    
    private boolean confirmVotes()
    {
        System.out.println("Your vote for president is: ");
        switch(myVoteForPresident)
        {
            case 0:
            System.out.println("No one");
            break;
            
            case 1:
            System.out.println(nameCandidatePresident1);
            break;
            
            case 2:
            System.out.println(nameCandidatePresident2);
            break;
        }
        
        System.out.println("Your vote for vice president is: ");
        switch(myVoteForVicePresident)
        {
            case 0:
            System.out.println("No one");
            break;
            
            case 1:
            System.out.println(nameCandidateVicePresident1);
            break;
            
            case 2:
            System.out.println(nameCandidateVicePresident2);
            break;
        }
        System.out.println("Type yes if you are pleased with your votes");
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next().equals("yes");
    }
    
    public void getAndConfirmVotes()
    {
        boolean voteFinished = false;
        while(!voteFinished)
        {
            getVotes();
            voteFinished = confirmVotes();
        }
        recordVotes();
    }
}
