package BTBuoi1;

        import java.util.Scanner;

public class Bai82 {
    public static void main(String[] args) {
        // Viết chương trình tìm số lớn nhất trong ba số thực a, b, c
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao cac so a, b, c: ");
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();
        if (a > b && a > c) {
            System.out.println("So lon nha la: " + a);
        } else if (b > a && b > c) {
            System.out.println("So lon nha la: " + b);
        }
        else System.out.println("So lon nha la: " + c);
    }
}