package ua.artcode.week2.day2;

import java.util.Scanner;
import ua.artcode.ArrayHelper;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input array size");
		int size = sc.nextInt();
		
		int[] mas = new int[size];
		
		ArrayHelper.printArr(mas);//call
		System.out.println();
		
		int mid = mas.length / 2;
		
		/*for(int i = 0, num = 0; i < mid; i++){
			mas[i] = num++;
			mas[mid + i] = num++;
		}*/
		
		//first part
		for(int i = 0, num = i; i < mid; i++, num += 2){
			mas[i] = num;
		}
		
		//second part
		for(int i = mid, num = 1; i < mas.length; i++, num += 2){
			mas[i] = num;
		}
		
		System.out.print("Array = ");
		
		ArrayHelper.printArr(mas);
		
	}

}
