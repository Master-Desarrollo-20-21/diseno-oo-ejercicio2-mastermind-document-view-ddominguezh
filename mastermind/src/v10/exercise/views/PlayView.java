package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.Message;
import v6.exercise.Console;

public class PlayView extends GameView{

	private SecretCombinationView secretCombinationView;
	private FinishView finishView;
	private CreateProposedCombinationView createProposedCombinationView;
	private AttempsCombinationView attempsCombinationView;
	
	public PlayView(Game game) {
		super(game);
		this.secretCombinationView = new SecretCombinationView();
		this.finishView = new FinishView(game);
		this.attempsCombinationView = new AttempsCombinationView(this.game);
		this.createProposedCombinationView = new CreateProposedCombinationView();
	}

	@Override
	public void interact() {
		do {
			Console.getInstance().write(Message.ATTEMPT.replace(this.game.getNumAttempts()));
			this.secretCombinationView.interact();
			this.attempsCombinationView.interact();
			this.createProposedCombinationView.interact();
			this.game.add(this.createProposedCombinationView.getProposed());
		}while(!this.game.finish());
		this.finishView.interact();
	}

}
