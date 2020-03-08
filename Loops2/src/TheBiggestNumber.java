import java.util.Scanner;

public class TheBiggestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int bigger = Integer.MIN_VALUE;
        int i = 0; //брояч за while цикъла
        while (n>i){
            int number = Integer.parseInt(scan.nextLine()); //въвеждаме подадените числа
            if (number>bigger) {
                bigger = number;
            }i++;
        }
        System.out.println(bigger);
    }
}
