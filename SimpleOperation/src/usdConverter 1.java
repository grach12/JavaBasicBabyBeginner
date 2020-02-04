import java.util.Scanner;

public class usdConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var USD = Double.parseDouble(scan.nextLine());

        double bgn = USD*1.79549;
        System.out.printf("%.2f", bgn);
    }
}
