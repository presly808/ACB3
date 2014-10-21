package ua.artcode.week2.day1;

public class DecToBin {

	public static void main(String[] args) {
		int dec = 1234;
		// dec / 10  dec % 10
		
		int div = dec;
		int mod = 0;
		String res = " ";
		
		while(div >= 1){ //exit condition
			mod = div % 2; 
			res = mod + res; // action
			div = div / 2; // way condition
		}
		
		System.out.println(res);
		
		
	}

}
