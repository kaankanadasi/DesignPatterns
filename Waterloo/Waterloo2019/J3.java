package Waterloo.Waterloo2019;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        // Plan: input aldığın sayı kadar String inputu al, seçtiğin char sonraki char ile aynı referansa sahip mi diye bak
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();

        for(int i=0; i<loop; i++) {
            String lines = scan.nextLine();
            char currentChar = lines.charAt(0);
            int count = 1;
            
            for(int n=0; n<lines.length(); n++) { 
                if(currentChar == lines.charAt(n)) {
                    count++;
                } else {
                    System.out.print(count + " " + currentChar + " ");
                    currentChar = lines.charAt(n);
                    count = 1;
                }
            }
            System.out.print(count + " " + currentChar + " "); // "last equence için" - chat
        }
        scan.close();
    }
}