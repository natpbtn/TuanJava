package BTBuoi1;

import java.util.Scanner;

public class B96 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Nhap X");
        int x =  in.nextInt();
        int  kq;
        if(x >= 5) {
            kq = 2 * (x * x) + 5 * x + 9;
        }else {
            kq = -2 * (x * x) + 4 * x - 9;
        }
        System.out.println(kq);
    }
}