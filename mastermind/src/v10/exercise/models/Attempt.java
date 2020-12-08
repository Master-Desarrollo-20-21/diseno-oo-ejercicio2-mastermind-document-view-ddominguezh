package v10.exercise.models;

import v10.exercise.models.Pig;
import v10.exercise.utils.Message;

public class Attempt {

	private ProposedCombination proposed;
	private Pig[] results;
	
	public Attempt(ProposedCombination proposed, Pig[] results) {
		this.proposed = proposed;
		this.results = results;
	}

	private int numPigs(Pig foundPig) {
		int count = 0;
		for(Pig pig : this.results) {
			if(foundPig.equals(pig)) {
				count++;
			}
		}
		return count;
	}

	public boolean isWinner() {
		return numPigs(Pig.BLACK) == this.results.length;
	}

	public String getResult() {
		return Message.RESULT.replace(this.proposed.toString(), numPigs(Pig.BLACK), numPigs(Pig.WHITE));
	}
	
}
