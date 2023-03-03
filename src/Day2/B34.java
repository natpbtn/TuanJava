package Day2;

import java.util.Scanner;

public class B34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        in.close();
        if (n < 1) {
            System.out.println("Không thoả mãn");
            System.exit(0);
        }
        double D = 0;
        for (int i = 1; i <= n; i++) {
            D = Math.sqrt(D+i);
        }
        System.out.printf("D = %f", D);
    }
}
