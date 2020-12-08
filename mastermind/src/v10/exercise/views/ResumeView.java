package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.DialogYesNoView;
import v10.exercise.utils.Message;

public class ResumeView extends GameView {

	private DialogYesNoView dialogView;
	public ResumeView(Game game) {
		super(game);
		this.dialogView = new DialogYesNoView(Message.RESUME);
	}

	@Override
	public void interact() {
		this.dialogView.interact();
		if(isResume()) {
			this.game.reset();
		}
	}

	public boolean isResume() {
		return this.dialogView.isAnswerYes();
	}

}
