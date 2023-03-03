package Day2;

import java.util.Scanner;

public class Bai1 {

    //Tinh tong tu 1 den n
    public static void main (String[]args) {
        // Bước 1: Nhập dữ liệu
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        long n = in.nextLong();
        in.close();
        long total = 0;
        if(n < 1){
            System.out.println("Không thoả mãn");
            System.exit(0);
        }
        for (long i = 0; i <= n ; i++){
            total = total + i;
        }
        System.out.printf("Tong cac so tu 1 den %d la %d", n, total);
    }
}