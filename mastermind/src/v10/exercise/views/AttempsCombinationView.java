package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.Console;

public class AttempsCombinationView extends GameView {

	public AttempsCombinationView(Game game) {
		super(game);
	}

	@Override
	public void interact() {
		for(int i = 0 ; i < this.game.getNumAttempts() ; i++ ) {
			Console.getInstance().write(this.game.getResult(i));
		}
	}

}
