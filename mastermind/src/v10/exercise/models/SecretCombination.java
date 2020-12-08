package v10.exercise.models;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import v10.exercise.models.Color;
import v10.exercise.models.Pig;

public class SecretCombination extends Combination{
	
	public void generate() {
		List<Color> values = Arrays.asList(Color.values());
	    Collections.shuffle(values);
	    this.colors = new Color[SecretCombination.getWidth()];
		for( int i = 0 ; i < this.colors.length ; i++) {
			this.colors[i] = values.get(i);
		}
	}

	public Pig[] compare(ProposedCombination combination) {
		Pig[] pigs = new Pig[this.colors.length];
		for(int i = 0 ; i < this.colors.length ; i++ ) {
			int index = indexOf(this.colors[i], combination);
			if(index == i) {
				pigs[i] = Pig.BLACK;
			}else if(index > -1) {
				pigs[i] = Pig.WHITE;
			}
		}
		return pigs;
	}

	private int indexOf(Color color, Combination combination) {
		for (int i = 0 ; i < combination.colors.length ; i++ ) {
			if(color.equals(combination.colors[i])) {
				return i;
			}
		}
		return -1;
	}
	
}
