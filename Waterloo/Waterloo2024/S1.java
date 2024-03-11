import java.util.ArrayList;
import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=1101460&authcode=93f22c5845e76a0997b4206e3c20610e

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