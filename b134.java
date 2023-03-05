package BTDay2;

import java.util.Scanner;

public class b134 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước của array : ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("Nhập lại kích thước của array");
        }
        int[] arr = new int[n];

        System.out.printf("Nhập giá trị các phần tử con của mảng: ");
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]= ",i);
            arr[i]=in.nextInt();
        }
        in.close();
        System.out.printf("Mảng vừa tạo là : ");
        for (int value : arr) {
            System.out.printf(value+"\t");
        }
        int value_max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (value_max < arr[i]) {
                value_max = arr[i];
            }
        }
        System.out.printf("Giá trị max= %d",value_max);

    }
}