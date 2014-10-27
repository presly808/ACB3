package ua.artcode;

public class RecursionUtils {

	
	public static void printMas(int[] mas, int i){
		if(i >= mas.length){
			return;
		} 
		
		System.out.print(mas[i] + " ");
		printMas(mas, i+1);
	}
	
}
