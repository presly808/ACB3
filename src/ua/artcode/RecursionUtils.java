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

		int index = word.length() - 1;

		char last = word.charAt(index);

		String returnedPart = reverse(word.substring(0, index));

		return last + returnedPart;


	}

	public static int count7(int val){
		return val == 0 ? 0 : ((val % 10 == 7) ? 1 : 0) + count7(val / 10);
	}

	public static int countTrace7(int val){
		if(val == 0){
			return 0;
		}

		int methodRes = (val % 10 == 7 ? 1 : 0);
		int returnedResult = count7(val / 10);
		return methodRes + returnedResult;

	}
	
}
