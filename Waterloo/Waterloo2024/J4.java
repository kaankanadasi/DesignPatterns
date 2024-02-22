package Waterloo.Waterloo2024;
import java.util.Scanner;

public class J4 {
    public static void main(String[] args) {
        // quiet key -> not displayed
        // silly key -> falsely types
        Scanner scan = new Scanner(System.in);
        String initialInput = scan.nextLine();
        String finalInput = scan.nextLine();

        // ikisini array'e almak???;

        // OLMAZ. sıkıntı lengthlerinin aynı olmama durumu
        for(int i=0; i<initialInput.length(); i++) {
            if(initialInput.charAt(i) != finalInput.charAt(i)) {
                System.out.println(initialInput.charAt(i) + " " + finalInput.charAt(i));
                break;
            }
        }
        scan.close();
    }
}
