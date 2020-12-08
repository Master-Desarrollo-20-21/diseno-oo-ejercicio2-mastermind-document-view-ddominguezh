package v10.exercise.views;

import v10.exercise.models.Game;

public abstract class GameView extends AbstractView{

	protected Game game;
	
	public GameView(Game game) {
		this.game = game;
	}
	
}
