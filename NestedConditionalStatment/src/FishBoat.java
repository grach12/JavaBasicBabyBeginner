import java.util.Scanner;

public class FishBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        var fishman = Integer.parseInt(scan.nextLine());

        var discount = 0.00;
        var price = 0.00;
        var spring = 3000;
        var summerAutumn = 4200;
        var winter = 2600;

if (season.equals("Spring")) {
    if (fishman <= 6) {
        discount = (spring * 0.10);
        price = (spring - discount);
        // System.out.println(price);
    } else if (fishman <= 11) {
        discount = (spring * 0.15);
        price = (spring - discount);
    } else {
        discount = (spring * 0.25);
        price = (spring - discount);
    }
}
else if (season.equals("Summer")||season.equals("Autumn")) {
    if (fishman <= 6) {
        discount = (spring * 0.10);
        price = (summerAutumn - discount);
        // System.out.println(price);
    } else if (fishman <= 11) {
        discount = (summerAutumn * 0.15);
        price = (summerAutumn - discount);
    } else {
        discount = (summerAutumn * 0.25);
        price = (summerAutumn - discount);
    }
}
else if (season.equals("Winter")) {
    if (fishman <= 6) {
        discount = (winter * 0.10);
        price = (winter - discount);
        // System.out.println(price);
    } else if (fishman <= 11) {
        discount = (winter * 0.15);
        price = (winter - discount);
    } else {
        discount = (winter * 0.25);
        price = (winter - discount);
    }
}
        System.out.println(price);
    }
}
