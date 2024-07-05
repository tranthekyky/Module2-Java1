import java.util.Scanner;

public class BaiTapJame {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập số cần đọc : ") ;
       int so = sc.nextInt();
       switch (so) {
           case 1: System.out.print("One");
           break;
           case 2: System.out.print("Two");
           break;
           case 3: System.out.print("Three");
           break;
           case 4: System.out.print("Four");
           break;
           case 5: System.out.print("Five");
           break;
           case 6: System.out.print("Six");
           break;
           case 7: System.out.print("Seven");
           break;
           case 8: System.out.print("Eight");
           break;
           case 9: System.out.print("Nine");
           break;
           case 10: System.out.print("Ten");
           break;
           default: System.out.print("out of ability");
       }

    }
}
