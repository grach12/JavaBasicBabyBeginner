import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        var count = Double.parseDouble(scan.nextLine());
var bananaPrice = 2.50; var applePrice = 1.20; var orangePrice = 0.85; var grapefruitPrice = 1.45;
var kiwiPrice = 2.70; var pineapplePrice = 5.50; var grapesPrice = 3.85;

        if ((dayOfWeek.equals("Saturday"))||(dayOfWeek.equals("Sunday"))) {
            switch (fruit) {
                case "banana":
                    System.out.println(count * 2.70);
                    break;
                case "apple":
                    System.out.println(count * 1.25);
                    break;
                case "orange":
                    System.out.println(count * 0.90);
                    break;
                case "grapefruit":
                    System.out.println(count * 1.60);
                    break;
                case "kiwi":
                    System.out.println(count * 3.00);
                    break;
                case "pineapple":
                    System.out.println(count * 5.60);
                    break;
                case "grapes":
                    System.out.println(count * 4.20);
                    break;
                default:
                    System.out.println("error");
            }
        }
        else if ((dayOfWeek.equals("Monday")) || (dayOfWeek.equals("Tuesday "))|| (dayOfWeek.equals("Wednesday "))
        || (dayOfWeek.equals("Thursday")) || (dayOfWeek.equals("Friday")))
        {
                switch (fruit) {
                    case "banana":
                        System.out.println(count * bananaPrice);
                        break;
                    case "apple":
                        System.out.println(count * applePrice);
                        break;
                    case "orange":
                        System.out.println(count * orangePrice);
                        break;
                    case "grapefruit":
                        System.out.println(count * grapefruitPrice);
                        break;
                    case "kiwi":
                        System.out.println(count * kiwiPrice);
                        break;
                    case "pineapple":
                        System.out.println(count * pineapplePrice);
                        break;
                    case "grapes":
                        System.out.println(count * grapesPrice);
                        break;
                    default:
                        System.out.println("error");
                }
            } else {
                System.out.println("error");
            }



    }
}
