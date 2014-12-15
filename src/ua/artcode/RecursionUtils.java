package ua.artcode;

public class RecursionUtils {

	
	public static void printMas(int[] mas, int i){
		if(i >= mas.length){
			return;
		} 
		
		System.out.print(mas[i] + " ");
		printMas(mas, i+1);
	}

	public static String reverse(String word){

		if(word.length() == 1){
			return word.charAt(0)+"";
		}

		char last = word.charAt(word.length()-1);

		return last + reverse(word.substring(0, word.length()));


	}
	
}
