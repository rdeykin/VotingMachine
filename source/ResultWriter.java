

/*
this class contains a single static method writeResults
*/
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import java.util.Collections;


public class ResultWriter{

	/**
	this is a single static method which takes in a filename as a string and a ballot.
	this method then parses the ballot for the information on the candidateTags.
	then the winner information is then written in the proper format to the output
	file with the name that was passed as a parameter to the method.
	@param filename
	@param ballot
	@throws IOException
	*/

	public static void writeResults(String filename, Ballot ballot)
	throws IOException {

		FileWriter resultWriter = new FileWriter (filename);
		ArrayList<Candidate> tempArr1 =  ballot.getCandidates();
		String winnerName = "";
		String winnerAffiliation = "";
		int winnerVotes = 0;
		String candidateTag = "";
		String candidateNumber = "";


		ArrayList<String> candidateTags = new ArrayList<String>();

		for (int i = 0; i < tempArr1.size(); i++){
			candidateTags.add(tempArr1.get(i).getName() + " - " + tempArr1.get(i).getAffiliation());
		}

		String longestTag = candidateTags.get(0);
		for(int q = 0; q < candidateTags.size(); q++){
			if (candidateTags.get(q).length() > longestTag.length()){
				longestTag = candidateTags.get(q);
			}
		}

		int numColumns = longestTag.length() + 12;

		resultWriter.write("RESULTS - " + ballot.getOfficeName() + "\n");
		String line = ("RESULTS - " + ballot.getOfficeName());

		for (int i = 0; i < line.length()-1; i++){
			resultWriter.write("-");
			}
		resultWriter.write("\n");

		Candidate winner = tempArr1.get(0);

		for(int e = 0; e < tempArr1.size(); e++){
			if((tempArr1.get(e)).getVoteCount() > winner.getVoteCount()){
				winner = tempArr1.get(e);
			}
		}

		String spacer = " ";
		for(int i = 0; i < candidateTags.size(); i++){
			candidateTag = String.format("%s", candidateTags.get(i));
			candidateNumber = String.valueOf(tempArr1.get(i).getVoteCount());

			int numSpacesToWrite = numColumns - (candidateTags.get(i)).length();

			resultWriter.write(candidateTag);
			resultWriter.write(spacer.repeat(numSpacesToWrite));
			resultWriter.write(candidateNumber);
			resultWriter.write("\n");
		}

		ArrayList<Integer> maxVote = new ArrayList<Integer>();
		for(int t = 0; t < tempArr1.size(); t++){
			maxVote.add((tempArr1.get(t)).getVoteCount());
		}

		int maxValue = Collections.max(maxVote);
		int testValue = 0;
		for(int d = 0; d < tempArr1.size(); d ++){
				if(tempArr1.get(d).getVoteCount() == maxValue){
					testValue++;

			}
		}

		resultWriter.write("\n");
		if(testValue >= 2){
			resultWriter.write("WINNER - NO WINNER");
	  }
		else{
			resultWriter.write("WINNER - " + winner.getName());
		}

		resultWriter.flush();
		resultWriter.close();
	}
}
