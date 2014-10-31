package ua.artcode.week3.day2;

import java.util.Arrays;

import ua.artcode.ArrayHelper;

public class ArrayCopyTest {

	public static void main(String[] args) {
		int[] src = ArrayHelper.genRandomMas(10_000_000, 100); 
		int[] dest = new int[src.length];
		
		long start1 = System.nanoTime();
		copy(src, dest);
		long end1 = System.nanoTime();
		long time1 = end1 - start1;
		System.out.println("Work Time of copy meth " + time1);
		
		int[] dest1 = new int[src.length];
		long start = System.nanoTime();
		System.arraycopy(src, 0, dest1, 0, src.length);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Work Time of arraycopy " + time);
		
		
	}
	
	public static void copy(int[] src, int[] dest){
		for(int i = 0; i < src.length; i++){
			dest[i] = src[i];
		}
	}

}
