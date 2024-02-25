package Waterloo.Waterloo2024;
import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=1101456&authcode=79add7606a1afc4075ad21ac0a4b5636

public class J4 {
    public static void main(String[] args) {
        // quiet key -> not displayed
        // silly key -> falsely types
        Scanner scan = new Scanner(System.in);
        String initialInput = scan.nextLine().toLowerCase();
        String finalInput = scan.nextLine().toLowerCase();

        // ikisini array'e almak???;

        char quietKey = ' ';
        char sillyKey = ' ';
        for(int i=0; i<initialInput.length()-1; i++) {
            if(initialInput.charAt(i) != finalInput.charAt(i)) {
                if(initialInput.charAt(i+1) != finalInput.charAt(i+1)) {
                    quietKey = initialInput.charAt(i);
                } 
            }
        }
        scan.close();
        System.out.println(quietKey + " " + sillyKey);
    }
}