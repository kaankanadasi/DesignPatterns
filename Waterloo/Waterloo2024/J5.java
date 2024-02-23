package Waterloo.Waterloo2024;
import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();

        Character[][] map = new Character[column][row];

        for(int i=0; i<column; i++) {
            String pump = scan.nextLine();
            for(int j=0; j <row; j++) {
                map[i][j] = pump.charAt(j);
            }
        }

        int manX = scan.nextInt();
        int manY = scan.nextInt();

        // olmaz:
        // for() loop x+, -x ve +y, -y posisyonlarına giderken "*" var mı diye bak 
        // if(there is "x") stop && if(row-manX==6 and columns - manY == 6) { stop }


        scan.close();
    }
}