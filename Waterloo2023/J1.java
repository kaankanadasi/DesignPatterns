package Waterloo2023;
// https://www.cemc.uwaterloo.ca/contests/computing/past_ccc_contests/2023/ccc/juniorEF.pdf
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int delivered = scan.nextInt();
        int obstacle = scan.nextInt();

        total = delivered * 50 + obstacle * -10;
        if (delivered > obstacle) {
            total += 500;
        }

        System.out.println(total);
        scan.close();
    }
}
