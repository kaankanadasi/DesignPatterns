import java.util.Scanner;

public class J2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt(); // Dusa's starting size
        int R = D;

        while(scan.hasNext()) {
            int yobi = scan.nextInt();
            if(D > yobi) {
                R += yobi; // if Dusa is bigger it eats
            } else {
                break; // if encountered big Yobi break
            }
        }
        System.out.println(R);
        scan.close();  
    }
}