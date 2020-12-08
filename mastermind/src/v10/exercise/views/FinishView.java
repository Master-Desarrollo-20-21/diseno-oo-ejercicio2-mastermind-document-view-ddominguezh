package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.Console;
import v10.exercise.utils.Message;

public class FinishView extends GameView{

	public FinishView(Game game) {
		super(game);
	}

	@Override
	public void interact() {
		if(this.game.isWinner()) {
			Console.getInstance().write(Message.WINNER);
		}else {
			Console.getInstance().write(Message.LOST);
		}
	}

}
