/**
 * VoteRecorder
 * Outputs the votes to the user.
 * @author (Ryder Cook)
 * @version (2/29/20)
 */
import java.util.Scanner;

public class VoteRecorder
{   
    public static void main(String[] args)
    {        
        VoteRecorderTest.setCandidatesPresident("Annie" , "Bob");

        VoteRecorderTest.setCandidatesVicePresident("John" , "Susan");
        
        VoteRecorderTest.resetVotes();
        
        boolean moreVotes = true;
        
        while(moreVotes)
        {
            System.out.println("Type yes if there is another voter");
            Scanner keyboard = new Scanner(System.in);
            moreVotes = keyboard.next().equals("yes");
        }
        System.out.println(VoteRecorderTest.currentVotePresident());
        System.out.println(VoteRecorderTest.currentVoteVicePresident());
    }
    
    public void getAndConfirmVotes()
    { 
        VoteRecorder aVoter = new VoteRecorder();
        aVoter.getAndConfirmVotes();
    }    
}
