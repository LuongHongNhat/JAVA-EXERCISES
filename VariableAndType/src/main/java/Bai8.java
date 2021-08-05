import java.util.Calendar;
import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args){
        int duongKinh;
        final double PI = 3.14;
        double dienTich;
        System.out.println("Moi ban nhap ban kinh duong tron:");
        Scanner sc = new Scanner(System.in);
        duongKinh = sc.nextInt();

        dienTich = PI * (Math.pow(duongKinh, 2));
        System.out.println(dienTich);
    }

}
