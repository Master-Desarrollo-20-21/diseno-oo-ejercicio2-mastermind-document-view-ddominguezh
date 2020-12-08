package v10.exercise.utils;

public class YesNoDialog{

	private static enum VALID_CHARATERS{
		YES("Y"),
		NO("N");
		private String value;
		VALID_CHARATERS(String value){
			this.value = value;
		}
		public boolean equals(String compareValue) {
			return this.value.equalsIgnoreCase(compareValue);
		}
		public static boolean isValid(String value) {
			return YES.equals(value) || NO.equals(value);
		}
		public static boolean isNotValid(String value) {
			return !isValid(value);
		}
	}
	private Message message;
	private String answer;
	
	public YesNoDialog(Message message ) {
		this.message = message;
	}

	public void interact() {
		do
			this.answer =  Console.getInstance().readString(this.message);
		while(VALID_CHARATERS.isNotValid(this.answer));
	}
	
	public boolean isAnswerYes() {
		return VALID_CHARATERS.YES.equals(this.answer);
	}
}
