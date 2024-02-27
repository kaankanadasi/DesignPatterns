package Waterloo.Waterloo2024;
import java.util.Scanner;

// YSC çözümü:

public class J4 {
    public static void main(String[] args) {
        // quiet key -> not displayed
        // silly key -> falsely types
        Scanner scan = new Scanner(System.in);
        String initialInput = scan.nextLine().toLowerCase();
        String finalInput = scan.nextLine().toLowerCase();

        if(initialInput.length() == finalInput.length()) {
            int x = 0;
            for(int i=0; i<initialInput.length(); i++) {
                if(initialInput.charAt(i) != finalInput.charAt(i)) {
                    x = i; // eğer size aynı ise silly key'in yeri iki inputta da aynı olacak 
                }
            }
            System.out.println(initialInput.charAt(x) + " " + finalInput.charAt(x));
            System.out.println("-");

        } else {
            int q = 0;
            int d = 0;
            int z = 0;
            int f = 0;
            for (int i = 0; i < finalInput.length(); i++) {
                if (initialInput.indexOf(finalInput.charAt(i)) == -1) {
                    q = i; // stores the index of the first character in finalInput that does not exist in initialInput
                }
            }
            boolean n = true;
            while (n) {
                if (f == finalInput.length()) { 
                    // if true - the loop has iterated through all characters in finalInput, and there are no differing characters found
                    d = initialInput.length() - 1;
                    n = false; // terminate the loop
                } else { 
                    // if the loop hasn't reached the end of the finalInput
                    if (finalInput.charAt(f) != finalInput.charAt(q)) {
                        if (finalInput.charAt(f) != initialInput.charAt(f)) {
                            d = f; // index of the first differing character in initialInput
                            n = false; // terminate the loop
                        }
                    }
                }
                f += 1; // to move to the next character in finalInput
            }
            for (int i = 0; i < initialInput.length(); i++) {
                if (initialInput.charAt(i) != initialInput.charAt(d)) {
                    if (finalInput.indexOf(initialInput.charAt(i)) == -1) {
                        z = i; // stores the index of the extra character in initialInput that does not exist in finalInput
                    }
                }
            }
            System.out.println(initialInput.charAt(z) + " " + finalInput.charAt(q));
            System.out.println(initialInput.charAt(d));
        }
        scan.close(); 
    }
}