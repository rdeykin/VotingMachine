/*
this class contains a single static method readBallot.
*/
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.*;


public class BallotReader{
/**
this is a static method which takes in a ballot
from a correctly formatted file
parses it, and then takes that information and returns a properly created ballot.
@return ballot object
@throws IOException
*/

	public static Ballot readBallot(String filename) throws IOException {

			File file = new File(filename);
			Scanner scnr = new Scanner(file);

			// this initializes a new file and takes the file name as a parameter//

			String ballotName = scnr.nextLine();
			//sets the variable ballotName to the first line of the file being read
			Ballot newBallot = new Ballot(ballotName);
			/**
			creates a new ballot object named newBallot
			**/

			String stringNumCandidates = scnr.nextLine();
			int numCandidates = Integer.parseInt(stringNumCandidates);
			/** sets the variable numCandidates to the
			amount found on the second line of the file being read
			**/

			for(int i = 0; i < numCandidates; i++){
				String temporary = scnr.nextLine();
				// creates a temporary variable to store the candidate name and affiliation
				String[] candidateDetails = temporary.split(";");
				/** creates an array where the candidate name and cadidate affiliation
				will be temporarily stored **/
				String candidateName = candidateDetails[0];
				String candidateAffilliation = candidateDetails[1];
				newBallot.addCandidate(new Candidate(candidateName, candidateAffilliation));
			}
		return newBallot;


		}

	}
