package v10.exercise.views;

import v10.exercise.utils.Console;
import v10.exercise.utils.Message;

public class StartView extends SubView{

	public void interact() {
		Console.getInstance().write(Message.START);
	}
	
}
