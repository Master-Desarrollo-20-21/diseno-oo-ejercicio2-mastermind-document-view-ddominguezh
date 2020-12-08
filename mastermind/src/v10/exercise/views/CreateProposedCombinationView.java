package v10.exercise.views;

import v10.exercise.utils.Console;
import v10.exercise.utils.Message;
import v10.exercise.models.Color;
import v10.exercise.models.ProposedCombination;

public class CreateProposedCombinationView extends AbstractView {

	private ProposedCombination proposed;
	
	@Override
	public void interact() {
		do {
			String colors = Console.getInstance().readString(Message.PROPOSED);
			this.proposed = new ProposedCombination(colors);
		}while(!isValid());
		Console.getInstance().write();
	}

	private boolean isValid() {
		if(!proposed.isValidLength()) {
			Console.getInstance().write(Message.WRONG_LENGTH);
			return false;
		}
		if(!proposed.isValidColors()) {
			Console.getInstance().write(Message.WRONG_COLOR.replace(Color.shortNames()));
			return false;
		}
		if(proposed.haveRepeatingColors()) {
			Console.getInstance().write(Message.REPETEAD_COLORS);
			return false;
		}
		return true;
	}

	public ProposedCombination getProposed() {
		return proposed;
	}
	
}
