import java.util.Scanner;

public class ToanTu {
    public static void main(String[] args) {
        //Nhập vào 2 số:
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number a : ");
        int a = input.nextInt();
        System.out.print("Enter Number b : ");
        int b = input.nextInt();
        //Bài 1. Sử dụng: +, -, *, /, %
//        System.out.println("a + b = " + (a + b) + " a - b = " + (a - b) + " a / b = " + (a / b) + " a * b = " + (a * b) + " a % b = " + (a % b));
        //Bài 2. Sử dụng =, +=, -=, *=, /=
//        a += 2 ;
//        System.out.println("a = " + a);
//        a -= 3 ;
//        System.out.println("a = " + a);
//        b *= 4 ;
//        System.out.println("b = " + b);
//        b /= 5 ;
//        System.out.println("b = " + b);

        //Bài 3. Sử dụng ++, --
//        a++ ;
//        b-- ;
//        System.out.print("a = " + a + " b = " + b);
        //Bài 4. Sử dụng <, >, <=, >=, ==, !=
        System.out.println( "a < b : " +(a < b ? "True" : "False") + " : " +"a > b : " +  (a > b ? "True" : "False "));
        System.out.println("a = b : " + (a == b ? "True" : "False") + " : " +"a != b : " +  (a != b ? "True" : "False"));

    }
}
