package Waterloo2023;
import java.util.ArrayList;
import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        int total = 0;
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();
        ArrayList<String> ar = new ArrayList<String>();

        for (int i=0; i<loop; i++) {
            String al = scan.nextLine();
            ar.add(al);
        }

        for(String n : ar) {
            if (n == "Poblano") {
                total += 1500;
            } else if (n == "Mirasol") {
                total += 6000;
            }
            else if (n == "Serrano") {
                total += 15500;
            } else if (n == "Cayenne") {
                total += 40000;
            } else if (n == "Thai") {
                total += 75000;
            } else if (n == "Habanero") {
                total += 125000;
            } 
        }
        System.out.println(total);
        scan.close();
    }
}