import java.util.Scanner;

public class Alchohol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var priceWhiskey = Double.parseDouble(scan.nextLine());
        var beerLiters = Double.parseDouble(scan.nextLine());
        var whineLiters = Double.parseDouble(scan.nextLine());
        var rakiaLiters = Double.parseDouble(scan.nextLine());
        var whiskeyLiters = Double.parseDouble(scan.nextLine());

        var rakaiaPrrice = priceWhiskey/2;

        System.out.println(rakaiaPrrice);

    }
}
