package ua.artcode.week2.day2;

public class TestString {

	public static void main(String[] args) {
			
		String str1 = "some text 123 word";
		int len = str1.length();
		System.out.println("count of symbols = " + len);
		
		int index = 3;
		char c = str1.charAt(index);
		System.out.println("char at " + index + " index = " + c);
		
		String splited = str1.substring(0, 4);
		System.out.println("substring from [0,4) = " + splited);
		
		// String char
		boolean res = str1.contains("123");
		System.out.println("str contains 123 = " + res);
		
		int pos = str1.indexOf('x');
		System.out.println("Pos of x = " + pos);
		
		char[] mas = str1.toCharArray();
	}

}
