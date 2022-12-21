import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class BallotTests{

  @Test
  public void testGetOfficeName(){
    Ballot testerballot = new Ballot("testerballot");
    assertEquals("testerballot", testerballot.getOfficeName());
  }


  @Test
  public void testAddCandidate(){
    Ballot testerballot = new Ballot("testerballot");
    Candidate temp = new Candidate("tester", "affiliation");
    testerballot.addCandidate(temp);
    assertEquals(1, testerballot.getCandidates().size());
  }
// ask about this one in the help session tomorrow
  @Test
  public void testGetCandidates(){
    Ballot testerballot = new Ballot("testerballot");
    Candidate temp = new Candidate("tester", "affiliation");
    testerballot.addCandidate(temp);
    assertTrue(testerballot.equals(testerballot));
  }

  /* ASK ABOUT THIS ONE IN THE HELP SESSION TOMORROW
  @Test
  public void testPrintElements(){
    Ballot testerballot = new Ballot("testerballot");
    Candidate temp = new Candidate("tester", "affiliation");
    testerballot.addCandidate(temp);
    Candidate temp2 = new Candidate("tester2", "affiliation2");
    testerballot.addCandidate(temp2);
    assertEquals("tester - affiliation 0 tester2 - affiliation2 0 ", testerballot.printElements());
  }
  */
}
