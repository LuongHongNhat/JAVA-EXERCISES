import java.util.Calendar;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args){
        int namSinh;
        int tuoi;
        System.out.println("Moi ban nhap nam sinh:");
        Scanner sc = new Scanner(System.in);
        namSinh = sc.nextInt();

        Calendar currentYear = Calendar.getInstance();
        int year = Calendar.getInstance().get(Calendar.YEAR);

        tuoi = year - namSinh;
        System.out.println(tuoi);
    }


}
