package ua.artcode.week2.day1;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input dec number");
		
		int num = sc.nextInt();
		
		String bin = decToBin(num);
		System.out.println("binary = " + bin);
		
		int res = binToDec(bin);
		
		System.out.println("dec = " + res);
	}
	
	public static String decToBin(int dec){
		int div = dec;
		int mod = 0;
		String res = "";
		
		while(div >= 1){ //exit condition
			mod = div % 2; 
			res = mod + res; // action
			div = div / 2; // way condition
		}
		
		return res;
	}
	
	public static int binToDec(String bin){
		int res = 0;
		for(int i = bin.length() - 1, pow = 1; i >= 0; i--, pow <<= 1){
			int num = (bin.charAt(i) == '0' ? 0 : 1);
			res = res + num * pow;
		}
		return res;
		
	}

}
