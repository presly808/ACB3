package ua.artcode.week3.day1;

import ua.artcode.ArrayHelper;
import ua.artcode.RecursionUtils;

public class RecTest {

	public static void main(String[] args) {
		int[] mas = ArrayHelper.genRandomMas(3, 10);
		RecursionUtils.printMas(mas, 0);
	}

}
