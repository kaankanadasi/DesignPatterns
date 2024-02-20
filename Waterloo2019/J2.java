package Waterloo2019;
import java.util.Scanner;

// ben yazamadım chat yazdı 
public class J2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int L = scan.nextInt();
        int[] N_values = new int[L];
        String[] x_values = new String[L];

        for (int i = 0; i < L; i++) {
            int N = scan.nextInt();
            String x = scan.next(); // nextLine demiyip next diyince aynın line'da alıyor - ln'siz system.out.print gibi
            N_values[i] = N;
            x_values[i] = x;
        }

        for (int i = 0; i < L; i++) {
            int N = N_values[i];
            String x = x_values[i];
            for (int j = 0; j < N; j++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}