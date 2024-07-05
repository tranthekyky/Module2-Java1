import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        //Bài 1: Nhập vào hai số a và b, và kiểm tra xem a có chia hết cho b hay không.
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhap a : ");
//        int a = input.nextInt();
//        System.out.print("Nhap b : ");
//        int b = input.nextInt();
//        System.out.println((a % b == 0 ? "a chia het cho b" : "a khong chia het cho b"));
        //Bài 2: Nhập tuổi và in ra kết quả nếu tuổi học sinh đó không đủ điều kiện vào học lớp 10.
//        Scanner input2 = new Scanner(System.in);
//        System.out.print("Nhap tuoi :");
//        int n = input2.nextInt();
//        if (n <= 0) {
//            System.out.println("Tuoi khong hop le !!");
//        }else {
//            if (n >= 15) {
//                System.out.println("Hoc sinh du kieu kien vao lop 10");
//            }else {
//                System.out.println("Hoc sinh khong du kieu kien vao lop 10");
//
//            }
//        }
        //Bài 3: Nhập một số nguyên bất kỳ và in kết quả ra màn hình để nói cho người dùng biết số đó là lớn hay nhỏ hơn 0
//        Scanner input2 = new Scanner(System.in);
//        System.out.print("Nhap so bat ki :");
//        int N = input2.nextInt();
//        System.out.print("So do la : " + N);
        //Bài 4: Nhập 3 số nguyên và tìm giá trị lớn nhất của ba số nguyên đo
//        Scanner input3 = new Scanner(System.in);
//        System.out.print("Nhap so thu 1 : ");
//        int n1 = input3.nextInt();
//        System.out.print("Nhap so thu 2 : ");
//        int n2 = input3.nextInt();
//        System.out.print("Nhap so thu 3 : ");
//        int n3 = input3.nextInt();
//        if (n1 > n2 && n1 > n3) {
//            System.out.println("So " + n1 + " la so lon nhat .");
//        }else if (n2 > n1 && n2 > n3) {
//            System.out.println("So " + n2 + " la so lon nhat .");
//        }else if (n3 > n1 && n3 > n2) {
//            System.out.println("So " + n3 + " la so lon nhat .");
//        }
        //Bài 5: Xếp hạng học lực của học sinh dựa trên các điểm bài kiểm tra, điểm thi giữa kỳ, điểm thi cuối kỳ
//        Scanner input4 = new Scanner(System.in);
//        System.out.print("Nhap diem bai kiem tra : ");
//        float n = input4.nextFloat();
//        System.out.print("Nhap diem thi giua ki : ");
//        double g = input4.nextDouble();
//        System.out.print("Nhap diem thi cuoi ki : ");
//        double c = input4.nextDouble();
//        double medium = (n + g + c) / 3d ;
//        if (medium <= 0 || medium > 10) {
//            System.out.println("Diem khong hop le !");
//        }else {
//            if (medium >= 8) {
//                System.out.println("Hoc luc : GIOI");
//            } else if (medium >= 6.5 && medium < 8) {
//                System.out.println("Hoc luc : KHA");
//            }else if (medium >= 4.5 && medium < 6.5) {
//                System.out.println("Hoc luc : TRUNG BINH");
//            }else {
//                System.out.println("Hoc luc YEU");
//            }
//        }
        //Bài 6: Tính hoa hồng nhận được tuỳ theo mức doanh số bán hàng
        Scanner input5 = new Scanner(System.in);
        System.out.print("Nhập Số doanh thu tháng này ");
        int n = input5.nextInt();
        if (n >= 30000000) {
            System.out.println("Hoa hồng nhận được là : " + (n * 15 / 100) + " Đ");
        }else {
            System.out.println("Hoa hồng nhận được là : " + (n * 10 / 100) + " Đ");
        }
    }
}
