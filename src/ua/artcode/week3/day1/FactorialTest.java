package ua.artcode.week3.day1;

public class FactorialTest {

	public static void main(String[] args) {
		int x = 5;
		int value = fact(x);
		System.out.println("!" + x + " = " + value);
	}
	
	public static int fact(int num){
		if(num < 2){
			return 1;
		} 
		
		int returned = fact(num - 1);
		int res = num * returned;
		return res;
	}

}
