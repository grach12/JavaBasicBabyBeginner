import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String movieType = scan.nextLine();
        var rows = Integer.parseInt(scan.nextLine());
        var columns = Integer.parseInt(scan.nextLine());

        double Income;

        switch (movieType) {
            case "Premiere":
                Income = rows * columns * 12;
                System.out.printf("%.2f leva", Income);
                break;
            case "Normal":
                Income = rows * columns * 7.50;
                System.out.printf("%.2f leva", Income);
                break;
            case "Discount":
                Income = rows * columns * 5.00;
                System.out.printf("%.2f leva", Income);
                break;
        }

    }
}
