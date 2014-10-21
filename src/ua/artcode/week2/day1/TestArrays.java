package ua.artcode.week2.day1;

public class TestArrays {

	public static void main(String[] args) {

		// <type>[] <name> = new <type>[<size>];
		// <type>[] <name> = {<value>, <value>, <value>};
		
		int[] mas = new int[5];
		mas[0] = 78;
		mas[1] = 12;
		mas[2] = 88;
		
		System.out.println(mas[3]);
		
		int[] arr = {12,9,3,5,15,4};
		
		int sizeOfArr = arr.length;
		System.out.println(sizeOfArr);
		
	}

}
