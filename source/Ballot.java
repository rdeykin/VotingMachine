
import java.util.ArrayList;

public class Ballot{
	String officeName;
  ArrayList<Candidate> voterBallot;

/**
this is a constructor that instatiates the variable officeName, which is the position that is being voted on
*/
	public Ballot(String officeName){
		this.officeName = officeName;
		voterBallot = new ArrayList<Candidate>();
	}
/**
getter method for the variable officeName
@return officename
*/
	public String getOfficeName(){
    return officeName;
	}
/**
method to add candidates to the ballot
@param candidate object
*/
	public void addCandidate(Candidate c){
		if(!voterBallot.contains(c)){
		voterBallot.add(c);
	}
	else{
		System.out.println("candidate has already been added");
	}

	}
/**
returns the arraylist which contains the candidates
@return ballot object
*/
	public ArrayList<Candidate> getCandidates(){
    return voterBallot;
	}
/**
this method returns all the elements contained within the arraylist each on thier own line
*/
	public void printElements(){
		for(Candidate a: voterBallot){
			System.out.println(a + " ");
		}
	}

}
