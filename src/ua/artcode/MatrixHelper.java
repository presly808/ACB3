package ua.artcode;

public class MatrixHelper {
	
	
	public static void printMatrix(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] genMat(int rows, int columns){
		int[][] mat = new int[rows][columns];
		for(int i = 0; i < mat.length; i++){
			mat[i] = ArrayHelper.genRandomMas(columns, 100);
		}
		return mat;
	}
	
	public static int[][] genSnakeRan(int rows, int columns, int sec){
		int[][] mat = new int[rows][columns];
		for(int i = 0; i < columns; i++){
			if(i % 2 == 0){
				for(int j = 0; j < rows; j++){
					mat[j][i] = ArrayHelper.genRandomNum(10, 100);
					printMatrix(mat);
					waitMethod(sec);
				}
			} else {
				for(int j = rows - 1; j >= 0; j--){
					mat[j][i] = ArrayHelper.genRandomNum(10, 100);
					printMatrix(mat);
					waitMethod(sec);
				}
			}
		}
		return mat;
		
	}
	
	private static void waitMethod(long sec){
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
