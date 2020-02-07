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
        var whinePrice = rakaiaPrrice-rakaiaPrrice*0.4;
        var beerPrice = rakaiaPrrice-rakaiaPrrice*0.8;

        var rakiaSum = rakiaLiters*rakaiaPrrice;
        var beerSum = beerLiters*beerPrice;

        System.out.println(rakaiaPrrice);

    }
}
