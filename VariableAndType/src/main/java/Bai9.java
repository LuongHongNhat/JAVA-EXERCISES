import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args){
        int soA;
        int soB;

        System.out.println("Moi ban nhap so A:");
        Scanner sc = new Scanner(System.in);
        soA = sc.nextInt();

        System.out.println("Moi ban nhap so B:");
        Scanner sc1 = new Scanner(System.in);
        soB = sc1.nextInt();

        if (soA > soB){
            System.out.println("So min la\t" +soB + "\nSo max la\t" + soA);
        }else if(soA < soB){
            System.out.println("So min la\t" +soA + "\nSo max la\t" + soB);
        }else{
            System.out.println("Khong co so min va max hay noi cach khac la hai so bang nhau");
        }
    }
}
