package Waterloo;
import java.util.Scanner;

public class J1 {
    int scores = 0;
    Scanner scan = new Scanner(System.in);
    int delivered = scan.nextInt();
    int collision = scan.nextInt();

    if (delivered > collision) {
        scores += 500;
    }
    
    scores += delivered * 50;
    scores -= collision * 10;
    
    public class Main {
        public static void main(String[] args) {
            System.out.println(scores);
        }
    }
}
