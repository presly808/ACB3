package ua.artcode;

public class ArrayHelper {

	public static int genRandomNum(int lRange, int rRange){
		return lRange + (int)(Math.random() * (rRange - lRange));
	}
	
	public static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] genRandomMas(int size, int range){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * range);
		}
		return mas;
	}
	
	public static int[] genRandomMas(int size, int lRange, int rRange){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			mas[i] = genRandomNum(lRange, rRange);
		}
		return mas;
	}
	
	public static int countChar(String src, char c){
		int count = 0;
		for(int i = 0; i < src.length(); i++){
			char spec = src.charAt(i);
			if(spec == c){
				count++;
			}
		}
		return count;
	}
	
}
