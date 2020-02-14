import java.util.Scanner;

public class LocalShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        String town = scan.nextLine();

        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.5));
                        break;
                    }
                    case "water": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.8));
                        break;
                    }
                    case "beer": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.2));
                        break;
                    }
                    case "sweets": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.45));
                        break;
                    }
                    case "peanuts": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.6));
                        break;
                    }
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.45));
                        break;
                    }
                    case "water": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.7));
                        break;
                    }
                    case "beer": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.10));
                        break;
                    }
                    case "sweets": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.35));
                        break;
                    }
                    case "peanuts": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.55));
                        break;
                    }
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.4));
                        break;
                    }
                    case "water": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 0.7));
                        break;
                    }
                    case "beer": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.15));
                        break;
                    }
                    case "sweets": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.30));
                        break;
                    }
                    case "peanuts": {
                        var pieces = Double.parseDouble(scan.nextLine());
                        System.out.printf("%.2f",(pieces * 1.5));
                        break;
                    }
                }

                break;
        }
    }
}
