package Day2;

import java.util.Random;
import java.util.Scanner;

public class VD3mang {
    //tao 1 mang ngau nhien gom n so tu nhien tu 0 -> 9999
    //in ra so lon nhat va be nhat trong mang
    //tinh trung binh cong cac gia tri trong mang
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap kich thuoc mang: ");
        int n = in.nextInt();
        in.close();
        if (n < 1){
            System.out.println("kich thuoc cua mang khong hop le!");
            System.exit(0);
        }
        Random random = new Random();
        //tao mang
        int[] arr = new int[n];
        //lap n lan
        //moi lan gan gia tri ngau nhien cho mang vua lap
        for (int i = 0; i < n; i++){
            arr[i] = random.nextInt(10000);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] %d \n", i, arr[i]);
        }
        //in ra so lon nhat va be nhat
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("SLN cua mang la: %d \n", max);
        System.out.printf("SBN cua mang la: %d \n", min);
        //tinh trung binh cong
        int t = 0;
        for (int i = 0; i < n; i++){
            t = t + arr[i];
        }
        System.out.printf("TBC cua mang la: %d\n", t/n);
    }
}
