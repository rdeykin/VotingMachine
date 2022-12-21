
public class Candidate{
	String name;
	String affiliation;
	int voteCount;

/**
* this class creates a candidate object with methods to set and get the name of the candidate
* it also has methods to compare candidates and an ovverriden toString method
*/

	public Candidate(String name, String affiliation){
		this.name = name;
		this.affiliation = affiliation;
		voteCount = 0;
		/**
		this is the constructor which instatiates the variables name, affiliation and voteCount
		*/

	}
	/**
	this is the getter method for the variable name
	@return name
	*/
	public String getName(){
    return name;

	}
	/**
	this is the getter method for the varibale affiliation
	@return affiliation
	*/
	public String getAffiliation(){
    return affiliation;

	}
	/**
	this is the getter method for the variable voteCount
	@return votecount
	*/
	public int getVoteCount(){
    return voteCount;


	}
	/**
	this is a method to increment the voteCount variable for a selected candidate
	*/
	public void tallyVote(){
		voteCount ++;


	}
	/**
	this is a toString method which returns the selected candidates information in the proper format
	@return candidate in the proper format
	*/
	public String toString(){
    return (name + " " + "-" + " " + affiliation + " " + voteCount);


			}

			/**
			the compareTo method below takes two candidates and compares them based on how many votes they have
			it prints a 1 if the first candidate is winning
			it prints a -1 if the other candidate is winning
			it prints a 0 if the candidates are tied
			@param candidate object
			*/

	public int compareTo(Candidate otherCandidate){

		 if(this.getVoteCount() > otherCandidate.getVoteCount()){
			 return 1;
	}
	if(this.getVoteCount() < otherCandidate.getVoteCount()){
		return -1;
	}else{
		return 0;

	}
}
}
