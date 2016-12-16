package com.tasks.triangle;

public class PascalTriangle {

     
	  public static int[][] buildPascalTriangle(int rows) {
		  int[][] triangle = new int[rows + 1][];
		  for (int i = 0; i <= rows; i++) {
			  triangle[i] = new int[i + 1];
		  }
		  for (int i = 0; i <= rows; i++) {
			  for (int j = 0; j <= i; j++) {
				  if (i == j || j == 0) {
					  triangle[i][j] = 1;
				  } else {
					  triangle[i][j] = (int)(countFactorial(i) / (countFactorial(j) * countFactorial(i - j)));
				  }
			  }
		  }
		  return triangle;
	  }
	  
	  public static long countFactorial(long n) {
		  if (n == 0 || n == 1) {
			  return n;
		  } else {
			  return n * countFactorial(n - 1);
		  }
		  
	  }
	  
	  public static void printPascalTriangle(int[][] triangle) {
		  for (int i = 0; i < triangle.length; i++) {
			  for (int j = 0; j <= i; j++) {
				 System.out.print(triangle[i][j] + "  ");
			  }
			  System.out.println();
		  }	  
	  }
		 
    
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		printPascalTriangle(buildPascalTriangle(17));
			  
	}

}
