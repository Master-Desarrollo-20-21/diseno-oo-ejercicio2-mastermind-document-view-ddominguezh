package v10.exercise.views;

import v10.exercise.models.Game;
import v10.exercise.utils.YesNoDialog;
import v10.exercise.utils.Message;

public class ResumeView extends GameView {

	private YesNoDialog dialogView;
	public ResumeView(Game game) {
		super(game);
		this.dialogView = new YesNoDialog(Message.RESUME);
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
