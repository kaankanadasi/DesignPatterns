package Waterloo.Waterloo2023;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // input to know number of days 
        char[][] a = new char[N][5]; // 2D array 

        for(int k=0; k<N; k++) {
            String input = scan.nextLine();
            for(int n=0; n<5; n++) {
                a[k][n] = input.charAt(k);
            }
        }

        int[] count = new int[5];

        for (int j=0; j<5; j++) {
            for (int i=0; i<N; i++) {
                if (a[i][j] == 'Y') {
                    count[j]++;
                }
            }
        }

        int maxCount = 0;
        for (int s = 0; s < 5; s++) {
            maxCount = Math.max(maxCount, count[s]);
        }

        for (int m=0; m<5; m++) {
            if (count[m] == maxCount) {
                System.out.print((m + 1) + ",");
            }
        }
        scan.close();
    }
}