package BTDay2;

import java.util.Scanner;

public class b135 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Nhập kích thước của array : ");
        int n = in.nextInt();
        if (n < 1) {
            System.out.printf("Nhập lại kích thước của array");
            System.exit(0);
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
        int max=-1;
        boolean flag_negative=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                flag_negative=false;
                max =  arr[i];
                break;
            }
        }
        if (flag_negative==true) {
            System.out.printf("\nMảng không có giá trị dương : %d", max);
        } else {
            System.out.printf("\nGía trị dương đầu tiên là %d",max);
        }
    }
}