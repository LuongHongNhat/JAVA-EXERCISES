import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args){
        int heSoToan,heSoLy,heSoHoa;
        double Toan,Ly, Hoa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm Toán:");
        Toan = sc.nextDouble();
        System.out.println("Mời bạn nhập HS Tóan:");
        heSoToan = sc.nextInt();

        System.out.println("Mời bạn nhập điểm Lý:");
        Ly = sc.nextDouble();
        System.out.println("Mời bạn nhập HS Lý:");
        heSoLy = sc.nextInt();

        System.out.println("Mời bạn nhập điểm Hóa:");
        Hoa = sc.nextDouble();
        System.out.println("Mời bạn nhập HS Hóa:");
        heSoHoa = sc.nextInt();

        double tongDiem = (Toan*heSoToan) + (Ly*heSoLy) + (Hoa*heSoHoa);
        double DTB = tongDiem/(heSoHoa+heSoLy+heSoToan);

        System.out.println("Điểm trung bình 3 môn là:\t" + DTB);
    }
}
