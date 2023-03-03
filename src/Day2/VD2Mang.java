package Day2;

import java.util.Random;
import java.util.Scanner;

public class VD2Mang {
    // tao mot mang gom n phan tu. nhap gia tri cho mang va in ra
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
            arr[i] = random.nextInt(1000);
        }
        //in ra mang vua tao
        for (int i = 0; i < n; i++){
            System.out.printf("arr[%d] %d \n",i,arr[i]);
        }
    }
}
