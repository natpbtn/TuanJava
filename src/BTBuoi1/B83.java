package BTBuoi1;

import java.util.Scanner;

public class B83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap 2 so ");
        int a =  in.nextInt();
        int b = in.nextInt();
        if((a > 0 && b >0) || (a < 0 && b <0) || (a==0 && b==0)) {
            System.out.print("Cung dau");
        }else {
            System.out.print("Khac dau");
        }
    }
}
