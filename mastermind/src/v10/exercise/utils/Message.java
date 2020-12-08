package v10.exercise.utils;

public enum Message {
	START("-------------- MASTERMIND --------------"),
	RESUME("Do you want to play again? (Y/N): "), 
	ATTEMPT(":0 attempt(s)"), 
	PROPOSED("Propose a combination: "),
	WRONG_LENGTH("Wrong proposed combination length"),
	WRONG_COLOR("Wrong colors they must be: :0"),
	REPETEAD_COLORS("Wrong proposed, can not repeat color."), 
	RESULT(":0 --> :1 blacks and :2 whites"),
	WINNER("You're winner :-)!!"), 
	LOST("You loose :-(");
	
	private String value;
	Message(String value){
		this.value = value;
	}
	
	public String getMessage() {
		return this.value;
	}
	
	public String replace(Object ...values) {
		String replacedMessage = this.getMessage();
		for(int i = 0; i < values.length ; i++) {
			replacedMessage = replacedMessage.replace(":"+i, values[i].toString());
		}
		return replacedMessage;
	}
	
	public boolean equals(String compareValue) {
		return this.value.equalsIgnoreCase(compareValue);
	}
	
	public boolean notEquals(String compareValue) {
		return !equals(compareValue);
	}
	
}
