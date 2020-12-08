package v10.exercise.views;

import v10.exercise.models.SecretCombination;
import v10.exercise.utils.Console;

public class SecretCombinationView extends AbstractView{

	@Override
	public void interact() {	
		String result = "";
		for(int i = 0 ; i < SecretCombination.getLength(); i++ ) {
			result += "x";
		}
		Console.getInstance().write(result);
	}

}
