import java.util.Scanner;

public class Bai6 {

    public static void main(String[] args){
        double soLuong;
        double donGia;

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so luong:");
        soLuong = sc.nextInt();

        System.out.println("Moi ban nhap don gia:");
        donGia = sc.nextInt();

        double thanhTien = soLuong*donGia;
        System.out.println("Thanh tien:" + thanhTien);
        System.out.println("TGTGT:" + (thanhTien*10)/100);
    }

}
