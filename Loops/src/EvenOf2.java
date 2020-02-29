/*import java.util.Scanner;

public class EvenOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int num = 1;
        for (int i=0; i<=n; i+=2){
            System.out.println(num);
            num=num*2*2;
        }


    }
}*/

import java.util.Scanner;

public class EvenOf2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for (int i=0; i<=n; i=i+2) {
            System.out.printf("%.0f%n",Math.pow(2, i)); //Math.pow - вдигане на степен
        }
        }
    }