package v10.exercise.views;

import v10.exercise.models.Game;

public class View extends AbstractView{

	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;
	
	public View() {
		Game game = new Game();
		this.startView = new StartView();
		this.playView = new PlayView(game);
		this.resumeView = new ResumeView(game);
	}

	@Override
	public void interact() {
		do {
			this.startView.interact();
			this.playView.interact();
			this.resumeView.interact();
		} while(this.resumeView.isResume());
	}
	
}
