package v10.exercise.models;

import v10.exercise.models.SecretCombination;

public class Game {

	private final static int MAX_ATTEMTPS = 10;
	private SecretCombination secret;
	private Attempt[] attempts;
	private int numAttempts;
	
	public Game() {
		this.secret = new SecretCombination();
		this.attempts = new Attempt[MAX_ATTEMTPS];
		reset();
	}
	
	public void reset() {
		this.secret.generate();
		this.numAttempts = 0;
	}
	
	public int getNumAttempts() {
		return this.numAttempts;
	}
	
	public Attempt[] getAttempts() {
		return Arrays.copyOfRange(this.attempts, 0, this.numAttempts);
	}

	public void add(ProposedCombination proposed) {
		this.attempts[this.numAttempts] = new Attempt(proposed, secret.compare(proposed));
		this.numAttempts++;
	}

	public boolean finish() {
		return isWinner() || this.numAttempts == MAX_ATTEMTPS;
	}
	
	public boolean isWinner() {
		return lastAttempt().isWinner();
	}
	
	private Attempt lastAttempt() {
		assert(this.numAttempts >= 1 && this.numAttempts < MAX_ATTEMTPS);
		return this.attempts[this.numAttempts - 1];
	}

}
