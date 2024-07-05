
import java.sql.SQLOutput;
import java.util.Scanner;

public class DieuKien2 {
    public static void main(String[] args) {

        //Bài 1: Chuyển từ độ C sang độ F. °C  x  9/5 + 32 = °F
        //Bài 2: Chuyển từ mét sang feet: ft =m * 3.2808
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập độ C (oC) : ");
//        double c = sc.nextDouble();
//        double f = c * 9/5 + 32 ;
//        System.out.println("Độ F (oF) = " + f );
//        System.out.print("Nhập mét (m) : ");
//        double m = sc.nextDouble();
//        double ft = m * 3.2808 ;
//        System.out.print("Feet (ft) = " + ft);
        //Bài 3: Tính diện tích hình vuông khi biết cạnh a.
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Nhập cạnh a : ");
//          float a = sc.nextFloat();
//          float s = a * a ;
//          System.out.println("Diện tích hình vuông cạnh " + a + " m là : " + s + " m2");
          //Bài 4: Tính diện tích hình  chữ nhật khi biết 02 cạnh a, b.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập chiều dài : ");
//        float a = sc.nextFloat();
//        System.out.print("Nhập chiều rộng : ");
//        float b = sc.nextFloat();
//        float s = a * b ;
//        System.out.println("Diên tích hình chữ nhật là : " + s + " m2");
        //Bài 5: Tính diện tích tam giác vuông khi biết 02 cạnh kề a, b.
//          Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập cạnh a : ");
//        float a = sc.nextFloat();
//        System.out.println("Nhập cạnh h : ");
//        float h = sc.nextFloat();
//        float s = (a * h) / 2 ;
//        System.out.println("Diện tích tam giác là  : " + s + " m2" );
        //Bài 6: Giải phương trình bậc 1.
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập giá trị a : ");
//        float a= sc.nextFloat();
//        System.out.print("Nhập giá trị b : ");
//        float b= sc.nextFloat();
//        if ( a == 0 ) {
//            System.out.println("Đây không phải là phương trình bậc 1");
//        }else {
//            System.out.println("Phương trình có nghiệm là : " + (- b / a ));
//        }
        //Bài 6: Giải phương trình bậc 2 .
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập a : ");
//        float a = sc.nextFloat();
//        System.out.print("Nhập b : ");
//        float b = sc.nextFloat();
//        System.out.print("Nhập c : ");
//        float c = sc.nextFloat();
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phương trình vô nghiệm ");
//            }else {
//                System.out.println("Phương trình có nghiệm là " + (-b/c));
//            }
//            return ;
//        }
//        float deta = b * b - 4 * a * c;
//        double canbachaiDeta = Math.sqrt(deta);
//        if (deta < 0) {
//            System.out.println("Phương trình vô nghiệm ");
//        }else if (deta == 0) {
//            System.out.println("Phương trình có 1 nghiệm kép x1 ,x2 = " + (- b / 2 * a)) ;
//        }else if (deta > 0) {
//            System.out.println("Nghiệm x1 = " + ((-b + canbachaiDeta) / 2 * a));
//            System.out.println("Nghiệm x2 = " + ((-b - canbachaiDeta) / 2 * a));
//        }
        //Bài 8: Kiểm tra xem một số nhập vào có phải là tuổi của một người không. Một số nguyên là tuổi của một người khi nhỏ 120 và lơn hơn 0.
//        Scanner sc2 = new Scanner(System.in);
//        System.out.print("Nhập số : ");
//        int n = sc2.nextInt();
//        if (n > 0 && n < 120) {
//            System.out.print("Đây là tuổi của một người");
//        }else {
//            System.out.print("Không phải tuổi của một người");
//        }
        //Bài 9: Kiểm tra xem 3 số thực (a,b,c) nhập vào có phải là cạnh của một tam giác. Điều kiện để a,b,c là cạnh của một tam giác là:
        //a,b,c > 0
        //a + b > c
        //b + c > a
        //a + c > b
//        Scanner sc3 = new Scanner(System.in);
//        System.out.print("Nhập a :");
//        double a = sc3.nextDouble() ;
//        System.out.print("Nhập b : ");
//        double b = sc3.nextDouble() ;
//        System.out.print("Nhập c : ");
//        double c = sc3.nextDouble() ;
//        if (a <= 0 || b <= 0 || c <= 0) {
//            System.out.println("Đây không phải là 1 tam giác");
//        }else {
//            if (a + b > c || b + c > a || a + c > b) {
//                System.out.println("Đây là 1 tam giac ");
//            }else {
//                System.out.println("Day khong phai la 1 tam giac");
//            }
//        }
        //Bài 10: Viết chương trình tính giá điện.
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mức tiêu thụ điện : ");
        double kWh = sc.nextDouble();
        double electricityPrice = 0 ;
        if (kWh > 0 && kWh <= 50) {
            electricityPrice = kWh * 1.678;
        }else if (kWh > 50 && kWh <= 100) {
            electricityPrice = 50 * 1.678 + (kWh - 50 ) * 1.734;
        }else if (kWh > 100 && kWh <= 200) {
            electricityPrice = 50 * 1.678 + 50 * 1.734 + (kWh - 100) * 2.014;
        }
        System.out.printf("Giá điện = " + electricityPrice + " VND/kWh");


    }
}