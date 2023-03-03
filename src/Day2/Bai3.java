package Day2;

import java.util.Scanner;

public class Bai3 {
    //Tinh tong tu 1 den n
    public static void main (String[]args) {
        // Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        long n = in.nextLong();
        in.close();
        if(n < 1){
            System.out.println("Không thoả mãn");
            System.exit(0);
        }
        double total = 0;
        for (long i = 1; i <= n ; i++){
            total = total + 1.0/i;
        }
        System.out.println(total);
    }
}

