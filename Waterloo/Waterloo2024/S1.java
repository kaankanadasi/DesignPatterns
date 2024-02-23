package Waterloo.Waterloo2024;
import java.util.ArrayList;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for(int i=0; i<N; i++) {
            int people = scan.nextInt();
            ar.add(people);
        }

        int count = 0;
        for(int j = 0; j < N-1; j++) {
            if(ar.get(j) != ar.get(j+1)) {
                count++;
            } else if (ar.get(j) == ar.get(j+1)) {
                count--;
            }
        }
        if(ar.get(0) != ar.get(N-1)) {
            count++;
        } 

        System.out.println(count);

        scan.close();
    }
}