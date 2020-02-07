import java.util.Scanner;

public class excellenseCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var rate = Double.parseDouble(scan.nextLine());

        if (rate >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}