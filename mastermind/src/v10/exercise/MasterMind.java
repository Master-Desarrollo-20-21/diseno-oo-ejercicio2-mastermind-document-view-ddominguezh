package v10.exercise;

import v10.exercise.views.View;

public class MasterMind {

	private View view;
	
	public MasterMind() {
		this.view = new View();
	}
	
	public void play() {
		this.view.interact();
	}
	
	public static void main(String[] args) {
		new MasterMind().play();
	}
	
}
