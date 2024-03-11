import java.util.Scanner;

// https://cccgrader.com/getproblem.php?fid=1101457&authcode=28d70512cee3442f6e649832cf58bf81

public class J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();

        char[][] map = new char[column][row];

        for(int i=0; i<column; i++) {
            String pump = scan.nextLine();
            for(int j=0; j <row; j++) {
                map[i][j] = pump.charAt(j);
            }
        }

        // int manX = scan.nextInt();
        // int manY = scan.nextInt();

        scan.close();
    }
}