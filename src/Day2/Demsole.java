package Day2;

import java.util.Scanner;

public class Demsole {

        //Co bao nhieu so le trong khoang (a, b)
        public static void main (String[]args){
            // Bước 1: Nhập dữ liệu
            Scanner in = new Scanner(System.in);
            System.out.print("a, b = ");
            long a = in.nextLong();
            long b = in.nextLong();
            in.close();
            if (a >= b) {
                System.out.println("Không thoả mãn");
                System.exit(0);
            }
            // Bước 2: Vòng lặp (a, b)
            long count = 0;
            for (long i = a + 1; i < b; i++) {
                if (i % 2 != 0) {
                    count = count + 1;
                }
            }
            System.out.printf("Có tất cả %d số lẻ trong (%d, %d)", count, a, b);
        }
    }