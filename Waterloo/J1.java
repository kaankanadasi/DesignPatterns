package Waterloo;
import java.util.Scanner;

public class J1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int G = scan.nextInt();
        int B = scan.nextInt();
    
        int C = 0;
        C = R * 3 + G * 4 + B * 5;
        System.out.println(C);
        scan.close();
    }
}