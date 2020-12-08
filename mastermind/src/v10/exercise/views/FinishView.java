package v10.exercise.views;

import v10.exercise.utils.Console;
import v10.exercise.utils.Message;

public class FinishView extends AbstractView{

	private boolean isWinner;
	public FinishView(boolean isWinner) {
		this.isWinner = isWinner;
	}

	@Override
	public void interact() {
		if(isWinner) {
			Console.getInstance().write(Message.WINNER);
		}else {
			Console.getInstance().write(Message.LOST);
		}
	}

}
