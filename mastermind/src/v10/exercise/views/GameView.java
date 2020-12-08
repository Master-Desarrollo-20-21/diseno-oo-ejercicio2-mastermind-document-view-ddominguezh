package v10.exercise.views;

import v10.exercise.models.Game;

public abstract class GameView extends SubView{

	protected Game game;
	
	public GameView(Game game) {
		this.game = game;
	}
	
}
