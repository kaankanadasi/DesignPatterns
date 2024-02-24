package Waterloo.Waterloo2024;
import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=1101455&authcode=a9057f1284ef34425e213093a9c09162

public class J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] ar = new int[N];

        // initializing the values in the array
        for(int i = 0; i < N; i++) {
            int score = scan.nextInt();
            ar[i] = score;
        }

        // sorting in descending order
        for(int j = 0; j < ar.length; j++) {
            for(int z = j+1; z < ar.length; z++) {
                int temp = 0;
                if(ar[j] < ar[z]) {
                    temp = ar[j];
                    ar[j] = ar[z];
                    ar[z] = temp;
                }
            }
        }

        // finding the third highest score
        int thridHighest = ar[0];
        int count = 0; 
        for(int n = 0; n < ar.length-1; n++) {
            if(ar[n] > ar[n+1]) {
                count++;
            }
            if(count == 2) {
                thridHighest = ar[n+1];
            }
        }

        // counting the number of third highest score
        int thridCount = 0;
        for(int score : ar) {
            if (score == thridHighest) {
                thridCount++;
            }
        }

        System.out.println(thridHighest + " " + thridCount);
        scan.close();
    }
}