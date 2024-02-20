package CollegeBoard;

public class anlamadim {
// 12-2-19: What would the contents of matrix, a 2-D array of integers, be after a call to alter(1)? The method alter is defined below.
  private int[][] matrix;

  /* matrix looks like this initially
  1 3 5 7
  2 4 6 8
  3 5 7 9
  */

  public void alter(int c) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = c + 1; j < matrix[0].length; j++) {
        matrix[i][j - 1] = matrix[i][j];
      }
    }
  } 
}


/* 
Answer:
  1 5 7 7
  2 6 8 8
  3 7 9 9

  Method alter shifts the values in the columns, starting at column c + 1, one column to the left. It also overwrites column c. 
  Here are the replacements made for the method call alter(1): matrix[0][1] = matrix[0][2], matrix[0][2] = matrix[0][3], 
  matrix[1][1] = matrix[1][2], matrix[1][2] = matrix[1][3], matrix[2][1] = matrix[2][2], matrix[2][2] = matrix[2][3]
*/