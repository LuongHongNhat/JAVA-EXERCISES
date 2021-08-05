import java.util.Scanner;

public class Bai5 {

    public static void main(String[] args){
        double soA;
        double soB;

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap so A:");
        soA = sc.nextDouble();

        System.out.println("Moi ban nhap so B:");
        soB = sc.nextDouble();

        double tong = soA + soB;
        double hieu = soA - soB;
        double thuong = soA/soB;
        double tich = soA * soB;
        System.out.println("Gia tri tong\t" + tong + ", hieu\t" + hieu + ", thuong\t" + thuong + ", tich\t" + tich);
    }
}
