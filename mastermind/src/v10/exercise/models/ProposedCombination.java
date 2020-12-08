package v10.exercise.models;

public class ProposedCombination extends Combination{

	public ProposedCombination(String colors) {
		char[] chars = colors.toCharArray();
		this.colors = new Color[chars.length];
		for(int i = 0 ; i < chars.length ; i++ ) {
			this.colors[i] = Color.valueOf(chars[i]);
		}
	}
	
	public boolean isValidLength() {
		return this.colors.length == ProposedCombination.getWidth();
	}
	
	public boolean isValidColors() {
		for(Color color : this.colors) {
			if(color == null) {
				return false;
			}
		}
		return true;
	}
	
	public boolean haveRepeatingColors() {
    		for(int i = 0 ; i < this.colors.length ; i++) {
    			Color color = this.colors[i];
    			for( int j = i+1; j < this.colors.length ; j++) {
    				if(color.equals(this.colors[j])) {
    					return true;
    				}
    			}
    		}
    		return false;
    }

	@Override
	public String toString() {
		String result = "";
		for(Color color : this.colors) {
			result += ""+color.shortName();
		}
		return result;
	}
}
