package Waterloo.Waterloo2019;
import java.util.Scanner;

// https://www.cemc.uwaterloo.ca/contests/computing/past_ccc_contests/2019/stage%201/juniorEF.pdf

public class J1 {
    public static void main(String[] args) {
        int applesScores = 0;
        int bananasScores = 0;
        Scanner scan = new Scanner(System.in);
        int[] sc = new int[6];
    
        for(int i = 0; i < 6; i++) {
            sc[i] = scan.nextInt();
        }

        applesScores = sc[0] + sc[1] + sc[2];
        bananasScores = sc[3] + sc[4] + sc[5];

        if (applesScores > bananasScores) {
            System.out.println("A");
        } else if (bananasScores > applesScores) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
        
        scan.close();
    }
}