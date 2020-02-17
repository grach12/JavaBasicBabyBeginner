import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        var temp = Double.parseDouble(scan.nextLine());
        String dayTime = scan.nextLine();

        String Outfit = "";
        String Shoes = "" ;

        switch (dayTime) {
            case "Morning":
                if ((temp >= 10) && (temp <= 18)) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                } else if ((temp > 18) && (temp <= 24)) {
                    Outfit = "Shirt";
                    Shoes = "moccasins";
                } else {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;
            case "Afternoon":
                if ((temp >= 10) && (temp <= 18)) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                } else if ((temp >= 18) && (temp <= 24)) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                } else {
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                }
                break;
            case "Evening":
                Outfit = "Shirt";
                Shoes = "Moccasins";
                break;
        }
        System.out.printf("It's %.0f degrees, get your %s and %s.", temp, Outfit, Shoes);

    }
}
        /*
if (dayTime.equals("Morning")) {
    if ((temp >= 10) && (temp <= 18)) {
        System.out.printf("It's %.0f degrees, get your Sweatshirt and Sneakers.", temp);
    } else if ((temp > 18) && (temp <= 24)) {
        System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", temp);
    } else System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", temp);
}

else if (dayTime.equals("Afternoon")){
    if ((temp >= 10) && (temp <= 18)) {
        System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", temp);
    } else if ((temp >= 18) && (temp <= 24)) {
        System.out.printf("It's %.0f degrees, get your T-Shirt and Sandals.", temp);
    } else System.out.printf("It's %.0f degrees, get your Swim Suit and Barefoot.", temp);
}

else {
    if ((temp >= 10) && (temp <= 18)) {
        System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", temp);
    } else if ((temp >= 18) && (temp <= 24)) {
        System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", temp);
    } else System.out.printf("It's %.0f degrees, get your Shirt and Moccasins.", temp);
}

    }
}
*/