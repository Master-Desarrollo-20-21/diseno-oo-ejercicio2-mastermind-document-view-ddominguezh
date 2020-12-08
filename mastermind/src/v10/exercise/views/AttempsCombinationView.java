	package v10.exercise.views;

import v10.exercise.models.Attempt;
import v10.exercise.utils.Console;

public class AttempsCombinationView extends AbstractView {

	private Attempt[] attemps;
	public AttempsCombinationView(Attempt[] attemps) {
		this.attemps = attemps;
	}

	@Override
	public void interact() {
		for(int i = 0 ; i < attemps.length ; i++ ) {
			Console.getInstance().write(attemps[i].getResult());
		}
	}

}
