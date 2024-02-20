package Waterloo2019;
import java.util.Scanner;

/*
 *    1  2
 *    3  4
*/

public class J4 {
    public static void main(String[] args) {
        int[][] grid = {{1,2}, {3, 4}}; // 2-D array

        Scanner scan = new Scanner(System.in);
        String H_V = scan.nextLine();

        for(int i=0; i<H_V.length(); i++) {
            char one = H_V.charAt(i); // teker teker V mi H mı diye bak
            if (one == 'V') {
                // Vertical swap
                int temp = grid[0][0]; 
                grid[0][0] = grid[0][1];
                grid[0][1] = temp;
                temp = grid[1][0];
                grid[1][0] = grid[1][1];
                grid[1][1] = temp;

            } else if (one == 'H') {
                // Horizontal swap
                int[] temp = grid[0];
                grid[0] = grid[1];
                grid[1] = temp;
            }
        }

        // output
        for (int[] row : grid) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}