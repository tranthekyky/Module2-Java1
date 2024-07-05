import java.util.Scanner;

public class KieuDuLieu {
    public static void main(String[] args) {
        //In ra Hello World
//        System.out.println("Hello world!");
        //Bài 2. In ra Hello world, Hi Anh em
//        System.out.println("Hello world, Hi ae!");
        //Bài 3. Nhập vào tên bạn, ví dụ nhập "Linh" => in ra "Hello Linh"

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap ten :");
//        String input = scanner.nextLine();
//        System.out.println("Hello " + input);

        //Bài 1. Khai báo 1 biến kiểu int, in ra số đó.

//        int number = 15 ;
//        System.out.println(number);
        //Bài 2. Nhập 1 biến kiểu int, in ra số đó.

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so :");
//        int number = scanner.nextInt() ;
//        System.out.println(number);
        //Bài 3. Nhập vào 2 biến kiểu int, in ra tổng, tích, hiệu, thương, số dư của 2 số đó.
//        Scanner scanner = new Scanner(System.in);
//        int number1 = 12 ;
//        int number2 = 2 ;
//        int tong = number1 + number2;
//        int tich = number1 * number2;
//        int hieu = number1 - number2;
//        int thuong = number1 / number2;
//
//        System.out.println("So 1 : " + number1);
//        System.out.println("So 2 : " + number2);
//        System.out.println("Tong : " + tong + ",Hieu : " + hieu +",Tich : " + tich + ",Thuong : " + thuong);
        //Bài 4. Nhập vào tên, tuổi. In ra: "Xin chào ..., tôi năm nay ..."
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = scanner1.nextLine();
        System.out.println("Enter Age :");
        int age = scanner1.nextInt() ;
        System.out.println("My name is " + name + " and I am " + age + "years old");

    }
}