//Task 1: Constructors 
//Implement a Matrix class that has a constructor which initializes the dimensions of 
//a matrix and a method to fill the matrix with values.
package Day4;

public class MatrixConstrcutor {
	
	 private int[][] matrix;

	    // Constructor to initialize the dimensions of the matrix
	    public MatrixConstrcutor(int rows, int cols) {
	        if (rows <= 0 || cols <= 0) {
	            throw new IllegalArgumentException("Dimensions must be positive integers");
	        }
	        matrix = new int[rows][cols];
	    }
	
	 public void fillMatrix(int[][] values) {
	        if (values.length != matrix.length || values[0].length != matrix[0].length) {
	            throw new IllegalArgumentException("Dimensions of values array must match matrix dimensions");
	        }
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                matrix[i][j] = values[i][j];
	            }
	        }
	    }
	 
	 public void printMatrix() {
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[0].length; j++) {
	                System.out.print(matrix[i][j] + "\t");
	            }
	            System.out.println();
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		MatrixConstrcutor matrix = new MatrixConstrcutor(3, 3);
        matrix.fillMatrix(values);
        matrix.printMatrix();

	}

}
