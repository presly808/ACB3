package ua.artcode.week2.day1;

public class Task1_1 {

	public static void main(String[] args) {
		
		int lRange = 0;
		int rRange = 10;
		
		boolean way = true;
		for(int i = lRange; i >= lRange && i <= rRange; ){
			System.out.print(i + " ");
			if(i < rRange && way){
				i++;
			} else if(i == rRange) {
				way = false;
				i--;
			}else if(!way) {
				i--;
			} 
			
		}
		
	}

}
