package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.Message;
import v6.exercise.Console;

public class PlayView extends GameView{

	private SecretCombinationView secretCombinationView;
	public PlayView(Game game) {
		super(game);
		this.secretCombinationView = new SecretCombinationView();
	}

	@Override
	public void interact() {
		do {
			Console.getInstance().write(Message.ATTEMPT.replace(this.game.getNumAttempts()));
			this.secretCombinationView.interact();
			new AttempsCombinationView(this.game.getAttempts()).interact();
			CreateProposedCombinationView createProposedCombinationView = new CreateProposedCombinationView();
			createProposedCombinationView.interact();
			this.game.add(createProposedCombinationView.getProposed());
		}while(!this.game.finish());
		new FinishView(game.isWinner()).interact();
	}

}
