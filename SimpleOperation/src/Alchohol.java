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
        var whineSum = whineLiters*whinePrice;
        var beerSum = beerLiters*beerPrice;
        var whiskeySum = whiskeyLiters*priceWhiskey;

        var totalSum = rakiaSum+whineSum+beerSum+whiskeySum;

        System.out.printf("%.2f",totalSum);


    }
}
