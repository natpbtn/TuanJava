package Day2;

import java.util.Scanner;
public class vd4while {
    public static void main(String[] args) {
        //viet chuong trinh mo phong nhap du lieu nguoi dung
        //gom co: username va password
        //mac dinh 1 tk user: admin va pass: admin
        //nguoi dung se co toi da 3 lan nhap
        //neu nhap dung -> dua ra thong bao -> dang nhap thanh cong
        //neu nhap sai (duoi 3 lan) -> cho nhap lai
        //Qua 3 lan -> Thong bao dang nhap that bai
        //Ket thuc chuong trinh.
        Scanner in = new Scanner(System.in);
        int count = 3;
        String username, password;
        boolean isLogin = false;
        while (count != 0){
            count = count - 1;
            System.out.print("nhap username: ");
            username = in.nextLine();
            System.out.print("nhap password: ");
            password = in.nextLine();
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
                //thoat khoi vong lap
                System.out.println("Dang nhap thanh cong");
                break;
            }
            System.out.printf("ban con %d lan nhap:\n", count);
        }
        if(!isLogin) {
            System.out.printf("Dang nhap that bai");
        }
        else {
            System.out.printf("Dang nhap thanh cong");
        }

    }
}
