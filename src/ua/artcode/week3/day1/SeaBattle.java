package ua.artcode.week3.day1;

public class SeaBattle {

	
	public static char[][] genSeaField(int size, char grad){
		char[][] field = new char[size][size];
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[i].length; j++){
				field[i][j] = grad;
			}
		}
		return field;
	}
	
	public static int[] setTarget(char[][] field, char symb){
		int i = (int)(Math.random() * field.length);
		int j = (int)(Math.random() * field.length);
		
		field[i][j] = symb;
		
		return new int[]{i,j};
	}
	
	public static boolean isShooted(char[][] field, char symb, int i, int j){
		if(field[i][j] == symb){
			field[i][j] = 'W';
			return true;
		} else {
			field[i][j] = '*';
			return false;
		}
	}
	
	public static String drawField(char[][] field, char target, char grad){
		String res = "  ";
		for(int i = 0; i < field.length; i++){
			res += i + "|";
		}
		res += "\n";
		
		for(int i = 0; i < field.length; i++){
			res += i + "|";
			for(int j = 0; j < field[i].length; j++){
				if(target != field[i][j]){
					res += field[i][j] + "|";
				} else {
					res += grad + "|";
				}
			}
			res += "\n";
		}
		return res;
	}
	
	public static String help(int actualI, int actualJ, 
			int targetI, int targetJ){
		String res = "";
		//ternary operator
		res += actualI < targetI ? " DOWN " : actualI > targetI ? " UP " : "";
		res += actualJ < targetJ ? " RIGHT " : actualJ > targetJ ? " LEFT " : "";
		return res;
		
	}
	
}
