
import java.util.Scanner;

public class Demo { // Teen class de public phai trung voi ten file
    public static void main(String[] args) {
        //Các kiểu dữ liệu :
        // Sô Nguyên (int : interger )
        // Số thực (Double)
        // Số thực (float) Pham vi nhỏ hơn Double
        // Kiểu logic (Boolean )
        // Kiểu chuỗi (String)
        // Kiểu kí tự Character (char) : 'a' , ' b'
//        int age = 10 ;
//        float score = 9.2f ;
//        double a = 18.3d ;
//        String name = "Trần Thế Kỷ" ;
//        char kitu = 'K' ;
//        boolean isflag = true ;
//
//        System.out.println(isflag);
        //
        /*boolean isss = true ;
        if (isss) {
            System.out.println("DDungs");
        }else {

        }
        int chosse = 3 ;
        switch (chosse) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hi");
                break;
            default:
                System.out.println("helloHi");
        }*/

        //Nhập xuất dữ liệu
//        String name = "Thế Kỷ" ;
//        System.out.println("Tôi tên là : " + name + 20 + "Tuổi");
        // Nhập dữ liệu
//        Scanner input = new Scanner(System.in);
//        System.out.println("vui long nhap : ");
//        int a = input.nextInt();
//        double b = input.nextDouble();
//        boolean c = input.nextBoolean();
//        String n = input.nextLine();
//        System.out.println(b);

         Scanner input = new Scanner(System.in);

        System.out.println("Enter an Text: ");
        String text = input.nextLine();
         System.out.println("Enter an integer: "); //
         int number = input.nextInt();
         System.out.println(number );
         System.out.println(text );

    }
}
