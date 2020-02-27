import java.util.Scanner;

//public class Numberto1000endby7 {
//    public static void main(String[] args) {
//      //  Scanner scan = new Scanner(System.in);
//
//        for (int i = 7 ; i <= 997 ; i++) {
//            if (i % 10 == 7) {
//                System.out.println(i);
//            }
//        }
//        }
//    }
public class Numberto1000endby7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 7; i <=997 ; i+=10) {
            System.out.println(i);
        }
    }
}
