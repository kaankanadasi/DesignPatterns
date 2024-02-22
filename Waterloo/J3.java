package Waterloo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class J3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> ar = new ArrayList<Integer>();

        for(int i=0; i<N; i++) {
            int score = scan.nextInt();
            ar.add(score);
        }

        Collections.sort(ar);
        Collections.reverse(ar);

        int count = 0;
        int check = 0;
        int countThird = 0;
        for(int n=1; n<ar.size(); n++) {
            if(ar.get(check) > ar.get(n)) {
                check = n;
                count++;
                if((count == 2) && (ar.get(check) == ar.get(n))) {
                        countThird++;
                }
                if(count == 2) {
                    System.out.println(ar.get(n) + " " + countThird);
                }
            }
        }
        
        scan.close();
    }
}