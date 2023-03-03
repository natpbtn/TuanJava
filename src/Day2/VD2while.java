package Day2;

import java.util.Scanner;

public class VD2while {
    public static void main(String[] args) {
        //nhap chuoi tu ban phim, in ra chuoi viet hoa
        //chuong trinh dung khi nguoi dung nhap exit
        //a -> A
        //bkacad -> BKACAD
        //exit -> Thoat khoi chuong trinh

        //lap lai o day la gi?
        //nhap, chuyen sang viet hoa, in

        String s = "";
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("nhap chuoi: ");
            s = in.nextLine();
            if (s.equalsIgnoreCase("exit")){
                //thoat khoi vong lap
                break;
            }
            s = s.toUpperCase();
            System.out.println("Viet hoa: " + s);
        }
        in.close();
    }
}