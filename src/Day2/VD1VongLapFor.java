package Day2;

import java.util.Scanner;

public class VD1VongLapFor {
    public static void main(String[] args) {
        //in ra cac so tu 1 den 10
      /*  for (int i = 1; i <= 10; i++){
            System.out.print(i+"\t");
        }
        //in ra cac so le tu 1 den 99
        for (int i = 1; i <= 99; i = i + 2){
            System.out.print(i + "\t");
        }

       */
        //in ra cac so chan trong doan [a, b]
        //input: a, b - long (a<b)
        //output: in ra cac so chan

        //Co bao nhieu so le trong khoang (a, b)
        Long a,b;
        System.out.print("Nhap a,b: ");
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();
        in.close();
        if(a >= b) {
            System.out.print("Hai so a va b khong thoa man de bai");
            System.exit(0);
        }
        for(long i = a; i <= b; i++){
            if(i % 2 == 0){
                System.out.print(i + "\t");
            }
        }

    }
}
