package ua.artcode.week2.day2;

import ua.artcode.ArrayHelper;

public class Task2 {

	public static void main(String[] args) {
		int size = 10;
		int range = 50;
		int[] arr = 
				ArrayHelper.genRandomMas(size, range);
		ArrayHelper.printArr(arr);
	}

}
