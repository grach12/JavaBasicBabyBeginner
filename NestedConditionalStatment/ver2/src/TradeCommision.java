/*
        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        var sales = Double.parseDouble(scan.nextLine());

        double commision;

        switch (town) {
            case "varna":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 1.045 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 1.75 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 1.10 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.13 - sales;
                    System.out.printf("%.2f", commision);
                }
                else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commision = sales * 1.055 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 1.08 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 1.12 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.145 - sales;
                    System.out.printf("%.2f", commision);
                }
                else {
                    System.out.println("error");
                }
                break;
            case "sofia":
                if (sales >= 0 && sales <=500) {
                    commision = sales * 1.05 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <=1000) {
                    commision = sales * 1.075 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000&&sales <=10000) {
                    commision = sales * 1.08 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.12 - sales;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;
            default: System.out.println("error");
        }
    }
}
*/
import java.util.Scanner;

public class TradeCommision {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String town = scan.nextLine().toLowerCase();
        var sales = Double.parseDouble(scan.nextLine());

        double commision;

        switch (town) {
            case "varna":
                if (sales > 0 && sales <= 500) {
                    commision = sales * 1.045 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 1.75 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 1.10 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.13 - sales;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;
            case "plovdiv":
                if (sales > 0 && sales <= 500) {
                    commision = sales * 1.055 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 1.08 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 1.12 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.145 - sales;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;
            case "sofia":
                if (sales > 0 && sales <= 500) {
                    commision = sales * 1.05 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 500 && sales <= 1000) {
                    commision = sales * 1.07 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 1000 && sales <= 10000) {
                    commision = sales * 1.08 - sales;
                    System.out.printf("%.2f", commision);
                } else if (sales > 10000) {
                    commision = sales * 1.12 - sales;
                    System.out.printf("%.2f", commision);
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
    }
    }
}
