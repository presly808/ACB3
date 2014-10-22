package ua.artcode.week2.day2;

import java.util.Scanner;

import ua.artcode.ArrayHelper;

public class CountCharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input some string");
		String seq = sc.nextLine();
		
		System.out.println("Input some char");
		String str = sc.nextLine();
		char c = str.charAt(0);
		int count = ArrayHelper.countChar(seq, c);
		
		System.out.println("In string = " + seq);
		System.out.println("count of " + c + " = " + count);
	}

}
