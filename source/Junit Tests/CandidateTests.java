
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions.*;

public class CandidateTests{



  @Test
  public void testGetName(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
      assertEquals("tester", test.getName());
    }

  @Test
  public void testGetAffiliation(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
    assertEquals("affiliation", test.getAffiliation());
  }

  @Test
  public void testGetVoteCount(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
    assertEquals(2, test.getVoteCount());
  }

  @Test
  public void testTallyVote(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
    test.tallyVote();
    assertEquals(3, test.getVoteCount());
  }

  @Test
  public void testToString(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    assertEquals("tester - affiliation 1", test.toString());
  }

  @Test
  public void testCompareToGreaterThan(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
    Candidate test2 = new Candidate("null", "null");
    test2.tallyVote();
    assertEquals(1, test.compareTo(test2));
  }

  @Test
  public void testCompareToLessThan(){
    Candidate test = new Candidate("tester", "affiliation");
    test.tallyVote();
    test.tallyVote();
    Candidate test2 = new Candidate("null", "null");
    test2.tallyVote();
    assertEquals(-1, test2.compareTo(test));
  }

  @Test
  public void testCompareToEqualTo(){
    Candidate test3 = new Candidate("null", "null");
    test3.tallyVote();
    Candidate test4 = new Candidate("null", "null");
    test4.tallyVote();
    assertEquals(0, test3.compareTo(test4));
  }

}
