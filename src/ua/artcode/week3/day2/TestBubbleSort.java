package ua.artcode.week3.day2;

import ua.artcode.ArrayHelper;

public class TestBubbleSort {

	public static void main(String[] args) {
		int[] mas = ArrayHelper.genRandomMas(10, 100);
		System.out.println("Before SORT");
		ArrayHelper.printArr(mas);
		
		ArrayHelper.bubbleSort(mas);
		
		System.out.println("\nAfter SORT");
		ArrayHelper.printArr(mas);
		
		
	}

}
